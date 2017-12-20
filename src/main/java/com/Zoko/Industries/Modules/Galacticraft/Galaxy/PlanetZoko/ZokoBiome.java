package com.Zoko.Industries.Modules.Galacticraft.Galaxy.PlanetZoko;

import com.Zoko.Industries.Config;

import micdoodle8.mods.galacticraft.core.entities.EntityEvolvedSpider;
import micdoodle8.mods.galacticraft.core.entities.EntityEvolvedZombie;
import net.minecraft.world.biome.BiomeGenBase;


public class ZokoBiome extends BiomeGenBase {
	
	public static BiomeGenBase Zoko = new BiomeGenBase(Config.ZokoBiomeID) {};
	
	@SuppressWarnings("unchecked")
	ZokoBiome(int var1){
		super(var1);
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.add(new SpawnListEntry(EntityEvolvedZombie.class, 10, 4, 4));
		this.spawnableMonsterList.add(new SpawnListEntry(EntityEvolvedSpider.class, 10, 4, 4));
		this.rainfall = 0F;
		this.setBiomeName("Zoko");
		this.setColor(0x3A899E);
		this.setHeight(new Height(2.5F, 0.4F));
	}


	@Override
	public float getSpawningChance()
	{
		return 0.01F;
	}
    
}
