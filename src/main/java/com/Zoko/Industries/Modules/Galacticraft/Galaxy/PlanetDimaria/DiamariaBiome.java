package com.Zoko.Industries.Modules.Galacticraft.Galaxy.PlanetDimaria;

import com.Zoko.Industries.Config;

import micdoodle8.mods.galacticraft.core.entities.EntityEvolvedSpider;
import micdoodle8.mods.galacticraft.core.entities.EntityEvolvedZombie;
import net.minecraft.world.biome.BiomeGenBase;


public class DiamariaBiome extends BiomeGenBase {
	
	public static final BiomeGenBase Dimaria = new BiomeGenBase(Config.ZokoBiomeID){};
	
	@SuppressWarnings("unchecked")
	public DiamariaBiome(int var1){
		super(var1);
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.add(new SpawnListEntry(EntityEvolvedZombie.class, 10, 4, 4));
		this.spawnableMonsterList.add(new SpawnListEntry(EntityEvolvedSpider.class, 10, 4, 4));
		this.rainfall = 0F;
		this.setBiomeName("Dimaria");
		this.setColor(0xEEE5DE);
		this.setHeight(new Height(2.5F, 0.4F));
	}


	@Override
	public float getSpawningChance()
	{
		return 0.01F;
	}
    
}
