package com.Zoko.Industries.World;

import java.util.Random;

import com.Zoko.Industries.Startup;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenLiquids;
import net.minecraft.world.gen.feature.WorldGenerator;
import thaumcraft.common.lib.world.WorldGenGreatwoodTrees;
import thaumcraft.common.lib.world.WorldGenSilverwoodTrees;

public class BiomeZoko extends BiomeGenBase {
	
	@SuppressWarnings("unused")
	private WorldGenerator WorldGenTrees;
	@SuppressWarnings("unused")
	private WorldGenerator WorldGenLakes;
	int color;

	public BiomeZoko(int par1) {
		super(par1);
		this.theBiomeDecorator.treesPerChunk = 50;
		this.topBlock = Blocks.grass;
		this.fillerBlock = Blocks.dirt;
		if (Startup.TC4)
		this.WorldGenTrees = new WorldGenGreatwoodTrees(true);
		if (Startup.TC4)
			this.WorldGenTrees = new WorldGenSilverwoodTrees(true, par1, par1);
		this.WorldGenLakes = new WorldGenLiquids(Blocks.water);
	    this.theBiomeDecorator.treesPerChunk = 2;
	    this.theBiomeDecorator.flowersPerChunk = 10;
	    this.theBiomeDecorator.grassPerChunk = 18;
	    this.theBiomeDecorator.waterlilyPerChunk = 6;
	    this.theBiomeDecorator.mushroomsPerChunk = 6;
	    this.addFlower(Blocks.red_flower, 1, 20);
	    this.addFlower(Blocks.tallgrass, 1, 60);
	    this.addFlower(Blocks.red_flower, 6, 20);
	    this.addFlower(Blocks.double_plant, 2, 10);
	    this.addFlower(Blocks.double_plant, 3, 10);
	    setTemperatureRainfall(1.4F, 0.6F);
	    setHeight(new BiomeGenBase.Height(0.7F, 0.2F));
	    setBiomeName("Zoko Biome");
	    setColor(0x3A899E);
	}
	

	@SideOnly(Side.CLIENT)
	  public int getBiomeGrassColor(int x, int y, int z) {
	    return  0x3A899E;
	  }
	@SideOnly(Side.CLIENT)
	  public int getBiomeFoliageColor(int x, int y, int z){
	    return  0x3A899E;
	  }
	@Override
	public int getWaterColorMultiplier() {
		return 0x3A899E;
	}
    @Override
    public int getSkyColorByTemp(float p_76731_1_) {
    	return 0x3A899E;
    }
    @Override
    public void decorate(World world, Random random, int chunkX, int chunkZ) {
    	super.decorate(world, random, chunkX, chunkZ);
    	
    	
    	
    }
    
}
