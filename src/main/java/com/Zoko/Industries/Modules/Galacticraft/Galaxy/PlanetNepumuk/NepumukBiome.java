package com.Zoko.Industries.Modules.Galacticraft.Galaxy.PlanetNepumuk;

import com.Zoko.Industries.Config;

import micdoodle8.mods.galacticraft.core.entities.EntityEvolvedSpider;
import micdoodle8.mods.galacticraft.core.entities.EntityEvolvedZombie;
import net.minecraft.world.biome.BiomeGenBase;


public class NepumukBiome extends BiomeGenBase {
	
	public static BiomeGenBase Nepumuk = new BiomeGenBase(Config.ZokoBiomeID) {};
	
	@SuppressWarnings("unchecked")
	public NepumukBiome(int var1){
		super(var1);
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.add(new SpawnListEntry(EntityEvolvedZombie.class, 10, 4, 4));
		this.spawnableMonsterList.add(new SpawnListEntry(EntityEvolvedSpider.class, 10, 4, 4));
		this.rainfall = 0F;
		this.setBiomeName("Nepumuck");
		this.setColor(0xBDFCC9);
		this.setHeight(new Height(2.5F, 0.4F));
	}


	@Override
	public float getSpawningChance()
	{
		return 0.01F;
	}
    
}
