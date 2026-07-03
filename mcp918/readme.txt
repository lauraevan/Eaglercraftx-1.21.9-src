

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

To run build_init, place the following files in this directory:

 - 'mcp918.zip' (mod coder pack for minecraft 1.8.8)
 - '1.8.8.jar` (jar file for minecraft 1.8.8)
 - '1.8.json' (assets index for minecraft 1.8)

Optional offline asset cache:

 - 'objects/' (assets objects folder from the minecraft launcher,
   i.e. '.minecraft/assets/objects'; when present, assets listed in
   '1.8.json' are loaded from this folder instead of being downloaded
   from resources.download.minecraft.net; missing files still fall
   back to downloading; a custom folder can also be set with the JVM
   property -Deaglercraft.assetsObjectsDir=<path>)


%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%


Notes on assetsIndexTransformer.json:

Recommended allowed samples:
 - 16000
 - 22050
 - 32000
 - 44100
 - 48000

Recommended allowed bitrates:
 - 48
 - 64
 - 80
 - 96
 - 112
 - 128
