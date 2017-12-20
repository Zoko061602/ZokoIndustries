package com.Zoko.Industries.Modules.Galacticraft.Galaxy.PlanetNepumuk;

import micdoodle8.mods.galacticraft.api.prefab.world.gen.BiomeDecoratorSpace;
import net.minecraft.world.World;

public class BiomeDecoratorNepumuk extends BiomeDecoratorSpace{

	private World currentWorld;

	@Override
	protected void setCurrentWorld(World world) {
		this.currentWorld = world;
	}

	@Override
	protected World getCurrentWorld() {
		return currentWorld;
	}


	@Override
	protected void decorate() {
		
	}



}
