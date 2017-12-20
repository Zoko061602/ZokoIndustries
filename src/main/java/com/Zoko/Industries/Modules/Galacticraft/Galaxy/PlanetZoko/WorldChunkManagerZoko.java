package com.Zoko.Industries.Modules.Galacticraft.Galaxy.PlanetZoko;

import micdoodle8.mods.galacticraft.api.prefab.world.gen.WorldChunkManagerSpace;
import net.minecraft.world.biome.BiomeGenBase;


public class WorldChunkManagerZoko extends WorldChunkManagerSpace {
	@Override
	public BiomeGenBase getBiome() {
		return ZokoBiome.Zoko;
	}

}
