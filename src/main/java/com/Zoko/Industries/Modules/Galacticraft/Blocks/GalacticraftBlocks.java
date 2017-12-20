package com.Zoko.Industries.Modules.Galacticraft.Blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class GalacticraftBlocks {
	
	public static Block PlanetBlock;

	public static void Blocks(){
		GameRegistry.registerBlock(PlanetBlock = new PlanetBlocks(Material.piston), "blockPlanet");
	}
}
