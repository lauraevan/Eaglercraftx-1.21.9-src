package net.lax1dude.eaglercraft.v1_8.opticlient;

import java.util.List;

import net.lax1dude.eaglercraft.v1_8.EaglercraftRandom;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraft.world.gen.structure.MapGenStructure;
import net.minecraft.world.gen.structure.StructureBoundingBox;
import net.minecraft.world.gen.structure.StructureComponent;
import net.minecraft.world.gen.structure.StructureStart;

/**
 * Generates buried Ancient Cities deep underground, using Minecraft 1.8's
 * own structure machinery (MapGenStructure / StructureStart /
 * StructureComponent) since the modern jigsaw system does not exist here.
 * Each city is a large deepslate-brick hall with polished pillars, sculk
 * on the floor, a central chiseled-deepslate shrine, loot chests, and a
 * Warden guarding the middle.
 */
public class MapGenAncientCity extends MapGenStructure {

	private final int spacing = 16;
	private final int separation = 8;

	public MapGenAncientCity() {
	}

	public String getStructureName() {
		return "AncientCity";
	}

	protected boolean canSpawnStructureAtCoords(int chunkX, int chunkZ) {
		int i = chunkX;
		int j = chunkZ;
		if (chunkX < 0) {
			chunkX -= this.spacing - 1;
		}
		if (chunkZ < 0) {
			chunkZ -= this.spacing - 1;
		}
		int rx = chunkX / this.spacing;
		int rz = chunkZ / this.spacing;
		EaglercraftRandom random = this.worldObj.setRandomSeed(rx, rz, 20083477);
		rx = rx * this.spacing + random.nextInt(this.spacing - this.separation);
		rz = rz * this.spacing + random.nextInt(this.spacing - this.separation);
		return i == rx && j == rz;
	}

	protected StructureStart getStructureStart(int chunkX, int chunkZ) {
		return new Start(this.worldObj, this.rand, chunkX, chunkZ);
	}

	public static class Start extends StructureStart {
		public Start() {
		}

		public Start(World worldIn, EaglercraftRandom random, int chunkX, int chunkZ) {
			super(chunkX, chunkZ);
			this.components.add(new ComponentAncientCity(random, chunkX * 16, chunkZ * 16));
			this.updateBoundingBox();
		}
	}

	public static class ComponentAncientCity extends StructureComponent {

		private static final int SX = 28;
		private static final int SY = 20;
		private static final int SZ = 28;

		public ComponentAncientCity() {
		}

		public ComponentAncientCity(EaglercraftRandom random, int x, int z) {
			super(0);
			this.coordBaseMode = EnumFacing.Plane.HORIZONTAL.random(random);
			int y = 20;
			this.boundingBox = new StructureBoundingBox(x, y, z, x + SX - 1, y + SY - 1, z + SZ - 1);
		}

		protected void writeStructureToNBT(NBTTagCompound tag) {
		}

		protected void readStructureFromNBT(NBTTagCompound tag) {
		}

		public boolean addComponentParts(World world, EaglercraftRandom random, StructureBoundingBox sbb) {
			IBlockState air = Blocks.air.getDefaultState();
			IBlockState bricks = Blocks.deepslate_bricks.getDefaultState();
			IBlockState tiles = Blocks.deepslate_tiles.getDefaultState();
			IBlockState polished = Blocks.polished_deepslate.getDefaultState();
			IBlockState chiseled = Blocks.chiseled_deepslate.getDefaultState();
			IBlockState deepslate = Blocks.deepslate.getDefaultState();
			IBlockState sculk = Blocks.sculk.getDefaultState();
			IBlockState soul = Blocks.soul_soil.getDefaultState();

			// hollow out the interior
			this.fillWithBlocks(world, sbb, 1, 1, 1, SX - 2, SY - 2, SZ - 2, air, air, false);
			// floor (tiled) and ceiling
			this.fillWithBlocks(world, sbb, 0, 0, 0, SX - 1, 0, SZ - 1, tiles, bricks, false);
			this.fillWithBlocks(world, sbb, 0, SY - 1, 0, SX - 1, SY - 1, SZ - 1, bricks, deepslate, false);
			// four perimeter walls
			this.fillWithBlocks(world, sbb, 0, 1, 0, 0, SY - 2, SZ - 1, bricks, bricks, false);
			this.fillWithBlocks(world, sbb, SX - 1, 1, 0, SX - 1, SY - 2, SZ - 1, bricks, bricks, false);
			this.fillWithBlocks(world, sbb, 0, 1, 0, SX - 1, SY - 2, 0, bricks, bricks, false);
			this.fillWithBlocks(world, sbb, 0, 1, SZ - 1, SX - 1, SY - 2, SZ - 1, bricks, bricks, false);

			// pillars
			int[][] pillars = { { 5, 5 }, { 5, SZ - 6 }, { SX - 6, 5 }, { SX - 6, SZ - 6 }, { 13, 6 }, { 13, SZ - 7 },
					{ 6, 13 }, { SX - 7, 13 } };
			for (int p = 0; p < pillars.length; ++p) {
				this.fillWithBlocks(world, sbb, pillars[p][0], 1, pillars[p][1], pillars[p][0], SY - 2, pillars[p][1],
						polished, polished, false);
			}

			// sculk patches scattered on the floor
			for (int s = 0; s < 60; ++s) {
				int sx = 1 + random.nextInt(SX - 2);
				int sz = 1 + random.nextInt(SZ - 2);
				this.setBlockState(world, sculk, sx, 1, sz, sbb);
			}

			// central shrine: raised chiseled dais with a soul-lit sculk core
			this.fillWithBlocks(world, sbb, 11, 1, 11, 16, 1, 16, chiseled, chiseled, false);
			this.fillWithBlocks(world, sbb, 12, 2, 12, 15, 2, 15, soul, soul, false);
			this.fillWithBlocks(world, sbb, 13, 2, 13, 14, 6, 14, sculk, sculk, false);
			this.setBlockState(world, chiseled, 13, 7, 13, sbb);
			this.setBlockState(world, chiseled, 14, 7, 14, sbb);

			// loot chests flanking the shrine
			this.setBlockState(world, Blocks.chest.getDefaultState(), 11, 2, 13, sbb);
			this.setBlockState(world, Blocks.chest.getDefaultState(), 16, 2, 14, sbb);

			// spawn the Warden at the shrine
			int wx = this.getXWithOffset(13, 13);
			int wy = this.getYWithOffset(2);
			int wz = this.getZWithOffset(13, 13);
			if (sbb.isVecInside(new BlockPos(wx, wy, wz))) {
				EntityWarden warden = new EntityWarden(world);
				warden.setLocationAndAngles((double) wx + 0.5D, (double) wy, (double) wz + 0.5D, 0.0F, 0.0F);
				world.spawnEntityInWorld(warden);
			}

			return true;
		}
	}
}
