
# Eagler Context Redacted Diff
# Copyright (c) 2026 lax1dude. All rights reserved.

# Version: 1.0
# Author: lax1dude

> CHANGE  4 : 6  @  4 : 5

~ import net.lax1dude.eaglercraft.v1_8.mojang.authlib.GameProfile;
~ 

> CHANGE  2 : 3  @  2 : 3

~ import net.lax1dude.eaglercraft.v1_8.EaglercraftUUID;

> INSERT  5 : 6  @  5

+ import net.minecraft.command.ICommandSender;

> DELETE  19  @  19 : 23

> CHANGE  45 : 46  @  45 : 46

~ public abstract class EntityPlayer extends EntityLivingBase implements ICommandSender {

> INSERT  77 : 86  @  77

+ 	public boolean getItemShouldUseOnTouchEagler() {
+ 		if (itemInUse != null) {
+ 			return itemInUse.getItem().shouldUseOnTouchEagler(itemInUse);
+ 		} else {
+ 			ItemStack st = getHeldItem();
+ 			return st != null && st.getItem().shouldUseOnTouchEagler(st);
+ 		}
+ 	}
+ 

> INSERT  280 : 297  @  280

+ 		// Firework Client: elytra glide - when wearing an elytra and falling
+ 		// through the air, slow the descent and drift forward toward the look
+ 		// direction, giving a gliding feel.
+ 		if (!this.capabilities.isFlying && !this.onGround && this.motionY < 0.0D && this.ridingEntity == null
+ 				&& net.lax1dude.eaglercraft.v1_8.opticlient.ItemElytra.isWearing(this)) {
+ 			this.motionY *= 0.6D;
+ 			if (this.motionY < -0.1D) {
+ 				this.motionY = -0.1D;
+ 			}
+ 			float yaw = this.rotationYaw * 0.017453292F;
+ 			float pitch = this.rotationPitch * 0.017453292F;
+ 			double lookX = (double) (-MathHelper.sin(yaw) * MathHelper.cos(pitch));
+ 			double lookZ = (double) (MathHelper.cos(yaw) * MathHelper.cos(pitch));
+ 			this.motionX += lookX * 0.05D;
+ 			this.motionZ += lookZ * 0.05D;
+ 			this.fallDistance = 0.0F;
+ 		}

> CHANGE  101 : 102  @  101 : 102

~ 		Collection<ScoreObjective> collection = this.getWorldScoreboard()

> CHANGE  271 : 274  @  271 : 273

~ 		ItemStack[] stack = this.inventory.armorInventory;
~ 		for (int j = 0; j < stack.length; ++j) {
~ 			if (stack[j] != null) {

> INSERT  75 : 86  @  75

+ 				} else if (!this.worldObj.isRemote && MinecraftServer.getServer().worldServers[0].getWorldInfo()
+ 						.getGameRulesInstance().getBoolean("clickToRide") && itemstack == null
+ 						&& parEntity instanceof EntityPlayer) {
+ 					EntityPlayer otherPlayer = (EntityPlayer) parEntity;
+ 					while (otherPlayer.riddenByEntity instanceof EntityPlayer) {
+ 						otherPlayer = (EntityPlayer) otherPlayer.riddenByEntity;
+ 					}
+ 					if (otherPlayer.riddenByEntity == null && otherPlayer != this) {
+ 						mountEntity(otherPlayer);
+ 						return true;
+ 					}

> CHANGE  502 : 503  @  502 : 503

~ 				.get(EntityList.getEntityID(entitylivingbase));

> CHANGE  254 : 256  @  254 : 256

~ 	public static EaglercraftUUID getUUID(GameProfile profile) {
~ 		EaglercraftUUID uuid = profile.getId();

> CHANGE  7 : 9  @  7 : 9

~ 	public static EaglercraftUUID getOfflineUUID(String username) {
~ 		return EaglercraftUUID.nameUUIDFromBytes(("OfflinePlayer:" + username).getBytes(Charsets.UTF_8));

> CHANGE  66 : 67  @  66 : 67

~ 		private static final EntityPlayer.EnumChatVisibility[] ID_LOOKUP = new EntityPlayer.EnumChatVisibility[3];

> CHANGE  21 : 24  @  21 : 23

~ 			EntityPlayer.EnumChatVisibility[] lst = values();
~ 			for (int i = 0; i < lst.length; ++i) {
~ 				ID_LOOKUP[lst[i].chatVisibility] = lst[i];

> EOF
