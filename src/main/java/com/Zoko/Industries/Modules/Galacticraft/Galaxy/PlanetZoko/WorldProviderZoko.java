package com.Zoko.Industries.Modules.Galacticraft.Galaxy.PlanetZoko;

import com.Zoko.Industries.Modules.Galacticraft.Galaxy.GalaxyBarnard;

import micdoodle8.mods.galacticraft.api.galaxies.CelestialBody;
import micdoodle8.mods.galacticraft.api.prefab.world.gen.WorldProviderSpace;
import micdoodle8.mods.galacticraft.api.vector.Vector3;
import micdoodle8.mods.galacticraft.api.world.IGalacticraftWorldProvider;
import micdoodle8.mods.galacticraft.api.world.ISolarLevel;
import net.minecraft.world.biome.WorldChunkManager;
import net.minecraft.world.chunk.IChunkProvider;

public class WorldProviderZoko extends WorldProviderSpace implements IGalacticraftWorldProvider,ISolarLevel {

	@Override
	public double getSolarEnergyMultiplier() {
		return 2;
	}

	@Override
	public float getGravity() {
		return 0;
	}

	@Override
	public double getMeteorFrequency() {
		return 0;
	}
	@Override
	public int getAverageGroundLevel() {
		return 72;
	}

	@Override
	public double getFuelUsageMultiplier() {
		return 1;
	}

	@Override
	public boolean canSpaceshipTierPass(int tier) {
		return tier >= GalaxyBarnard.planetZoko.getTierRequirement();
	}

	@Override
	public float getFallDamageModifier() {
		return 1;
	}

	@Override
	public float getSoundVolReductionAmount() {
		return 1;
	}

	@Override
	public float getThermalLevelModifier() {
		return 0;
	}

	@Override
	public float getWindLevel() {
		return 1.0F;
	}

	@Override
	public CelestialBody getCelestialBody() {
		return GalaxyBarnard.planetZoko ;
	}

	@Override
	public Vector3 getFogColor() {
        float f = 1.0F - this.getStarBrightness(1.0F);
        return new Vector3(58F / 255F * f, 137F / 255F * f, 158F / 255F * f);
	}

	@Override
	public Vector3 getSkyColor() {
        float f = 1.0F - this.getStarBrightness(1.0F);
        return new Vector3(58F / 255F * f, 137F / 255F * f, 158F / 255F * f);
	}

	@Override
	public boolean canRainOrSnow() {
		return false;
	}

	@Override
	public boolean hasSunset() {
		return false;
	}

	@Override
	public long getDayLength() {
		return 12000;
	}

	@Override
	public Class<? extends IChunkProvider> getChunkProviderClass() {
		return ChunkProviderZoko.class;
	}

	@Override
	public Class<? extends WorldChunkManager> getWorldChunkManagerClass() {
		return WorldChunkManagerZoko.class;
	}

}
