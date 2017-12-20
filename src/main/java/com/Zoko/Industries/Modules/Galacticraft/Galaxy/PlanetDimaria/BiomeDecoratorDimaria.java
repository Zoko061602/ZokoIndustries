package com.Zoko.Industries.Modules.Galacticraft.Galaxy.PlanetDimaria;

import micdoodle8.mods.galacticraft.api.prefab.world.gen.BiomeDecoratorSpace;
import net.minecraft.world.World;

public class BiomeDecoratorDimaria extends BiomeDecoratorSpace{

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
