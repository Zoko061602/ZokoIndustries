package com.Zoko.Industries.World;

import com.Zoko.Industries.Startup;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;

public class ModBiomeManager {

	private static BiomeGenBase Zoko = new BiomeZoko(154).setColor(0x3A899E).setBiomeName("ZokoBiome");
	
public static void init(){	

	BiomeDictionary.registerBiomeType(Zoko,BiomeDictionary.Type.COLD,BiomeDictionary.Type.FOREST);
	if(!Startup.Galactic){
	BiomeManager.addBiome(BiomeType.COOL, new BiomeEntry(Zoko, 5));
	}
	
}
}