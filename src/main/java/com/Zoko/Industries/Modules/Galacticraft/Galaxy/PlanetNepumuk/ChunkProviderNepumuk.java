package com.Zoko.Industries.Modules.Galacticraft.Galaxy.PlanetNepumuk;

import java.util.List;

import com.Zoko.Industries.Modules.Galacticraft.Blocks.GalacticraftBlocks;
import com.google.common.collect.Lists;

import micdoodle8.mods.galacticraft.api.prefab.core.BlockMetaPair;
import micdoodle8.mods.galacticraft.api.prefab.world.gen.BiomeDecoratorSpace;
import micdoodle8.mods.galacticraft.api.prefab.world.gen.ChunkProviderSpace;
import micdoodle8.mods.galacticraft.api.prefab.world.gen.MapGenBaseMeta;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenBase.SpawnListEntry;
import net.minecraft.world.chunk.IChunkProvider;

public class ChunkProviderNepumuk extends ChunkProviderSpace{
	
	private final BiomeDecoratorNepumuk biomeDecorator = new BiomeDecoratorNepumuk();
	

	public ChunkProviderNepumuk(World par1World, long seed, boolean mapFeaturesEnabled) {
		super(par1World, seed, mapFeaturesEnabled);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected BiomeDecoratorSpace getBiomeGenerator() {
		return biomeDecorator;
	}

	@Override
	protected BiomeGenBase[] getBiomesForGeneration() {
		BiomeGenBase[] Base ={
		NepumukBiome.Nepumuk	
		};
		return Base ;
	}

	@Override
	protected int getSeaLevel() {
		return 52;
	}

	@Override
	protected List<MapGenBaseMeta> getWorldGenerators() {
		List<MapGenBaseMeta> generators = Lists.newArrayList();
		return generators;
	}

	@Override
	protected SpawnListEntry[] getMonsters() {
		SpawnListEntry[] SpawnList ={
				
		};
		return SpawnList;
	}

	@Override
	protected SpawnListEntry[] getCreatures() {
		SpawnListEntry[] SpawnList ={
				
		};
		return SpawnList;
	}

	@Override
	protected BlockMetaPair getGrassBlock() {
		return new BlockMetaPair(GalacticraftBlocks.PlanetBlock,(byte)8);
	}

	@Override
	protected BlockMetaPair getDirtBlock() {
		return new BlockMetaPair(GalacticraftBlocks.PlanetBlock,(byte)9);
	}

	@Override
	protected BlockMetaPair getStoneBlock() {
		return new BlockMetaPair(GalacticraftBlocks.PlanetBlock,(byte)10);
	}

	@Override
	public double getHeightModifier() {
		return 4;
	}

	@Override
	public double getSmallFeatureHeightModifier() {
		return 8;
	}

	@Override
	public double getMountainHeightModifier() {
		return 20;
	}

	@Override
	public double getValleyHeightModifier() {
		return 3;
	}

	@Override
	public int getCraterProbability() {
		return 0;
	}

	@Override
	public void onChunkProvide(int cX, int cZ, Block[] blocks, byte[] metadata) {
	}

	@Override
	public void onPopulate(IChunkProvider provider, int cX, int cZ) {
		
	}

}
