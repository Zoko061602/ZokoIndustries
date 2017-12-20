package com.Zoko.Industries.Modules.Galacticraft.Galaxy;


import com.Zoko.Industries.Config;
import com.Zoko.Industries.Modules.Galacticraft.Galaxy.PlanetDimaria.WorldProviderDimaria;
import com.Zoko.Industries.Modules.Galacticraft.Galaxy.PlanetNepumuk.WorldProviderNepumuk;
import com.Zoko.Industries.Modules.Galacticraft.Galaxy.PlanetZoko.WorldProviderZoko;

import micdoodle8.mods.galacticraft.api.GalacticraftRegistry;
import micdoodle8.mods.galacticraft.api.galaxies.CelestialBody;
import micdoodle8.mods.galacticraft.api.galaxies.GalaxyRegistry;
import micdoodle8.mods.galacticraft.api.galaxies.Planet;
import micdoodle8.mods.galacticraft.api.galaxies.SolarSystem;
import micdoodle8.mods.galacticraft.api.galaxies.Star;
import micdoodle8.mods.galacticraft.api.vector.Vector3;
import micdoodle8.mods.galacticraft.api.world.IAtmosphericGas;
import micdoodle8.mods.galacticraft.core.dimension.TeleportTypeMoon;
import micdoodle8.mods.galacticraft.planets.mars.dimension.TeleportTypeMars;
import net.minecraft.util.ResourceLocation;



public class GalaxyBarnard {
	
	public static Planet planetZoko;
	public static Planet planetDimaria;
	public static Planet planetNepumuk;
	public static SolarSystem SolarSystemBarnard;
		
	
	@SuppressWarnings("deprecation")
	public static void Barnard(){		
		GalaxyBarnard.SolarSystemBarnard = new SolarSystem("SolarSystemBarnard", "milkyWay").setMapPosition(new Vector3(-90.0F, 30.0F));
        Star starBarnard = (Star) new Star("barnard").setParentSolarSystem(GalaxyBarnard.SolarSystemBarnard).setTierRequired(-1).setBodyIcon(new ResourceLocation("zokoindustries", "textures/gui/planets/barnard.png"));     
        GalaxyBarnard.SolarSystemBarnard.setMainStar(starBarnard);	
 	    GalaxyRegistry.registerSolarSystem(SolarSystemBarnard);
 	    System.out.println("New Stars appeared at the sky!");          
	}
	public static void Zoko(){	
        GalaxyBarnard.planetZoko = (Planet) new Planet("Zoko").setParentSolarSystem(GalaxyBarnard.SolarSystemBarnard);
        GalaxyBarnard.planetZoko.setRingColorRGB(0.1F, 0.9F, 0.6F);
        GalaxyBarnard.planetZoko.setPhaseShift(0.0F);
        GalaxyBarnard.planetZoko.setRelativeOrbitTime(0.3F);
        GalaxyBarnard.planetZoko.setBodyIcon(new ResourceLocation("zokoindustries", "textures/gui/planets/zoko.png"));
        GalaxyBarnard.planetZoko.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(0.55F, 0.50F));
        GalaxyBarnard.planetZoko.setDimensionInfo(317, WorldProviderZoko.class, true).setTierRequired(1);
        GalaxyBarnard.planetZoko.atmosphereComponent(IAtmosphericGas.NITROGEN).atmosphereComponent(IAtmosphericGas.OXYGEN).atmosphereComponent(IAtmosphericGas.ARGON).atmosphereComponent(IAtmosphericGas.WATER);
		if(Config.PlanetZoko)
        GalaxyRegistry.registerPlanet(planetZoko);
		GalacticraftRegistry.registerTeleportType(WorldProviderZoko.class, new TeleportTypeMoon());
		GalacticraftRegistry.registerRocketGui(WorldProviderZoko.class, new ResourceLocation("zokoindustries", "textures/gui/ZokoRocketGui.png"));
	}
	public static void Dimaria() {
        GalaxyBarnard.planetDimaria = (Planet) new Planet("Dimaria").setParentSolarSystem(GalaxyBarnard.SolarSystemBarnard);
        GalaxyBarnard.planetDimaria.setRingColorRGB(0.1F, 0.9F, 0.6F);
        GalaxyBarnard.planetDimaria.setPhaseShift(0.0F);
        GalaxyBarnard.planetDimaria.setRelativeOrbitTime(1F);
        GalaxyBarnard.planetDimaria.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(0.85F, 0.9F));
        GalaxyBarnard.planetDimaria.setBodyIcon(new ResourceLocation("zokoindustries", "textures/gui/planets/dimaria.png"));
        GalaxyBarnard.planetDimaria.setDimensionInfo(318, WorldProviderDimaria.class, true).setTierRequired(1); 
        GalaxyBarnard.planetDimaria.atmosphereComponent(IAtmosphericGas.NITROGEN).atmosphereComponent(IAtmosphericGas.HELIUM).atmosphereComponent(IAtmosphericGas.ARGON).atmosphereComponent(IAtmosphericGas.CO2);  
		GalaxyRegistry.registerPlanet(planetDimaria);
		GalacticraftRegistry.registerTeleportType(WorldProviderDimaria.class, new TeleportTypeMoon());
		GalacticraftRegistry.registerRocketGui(WorldProviderDimaria.class, new ResourceLocation("zokoindustries", "textures/gui/DimariaRocketGui.png"));
    }     
	public static void Nepumuk() {
        GalaxyBarnard.planetNepumuk = (Planet) new Planet("Nepumuk").setParentSolarSystem(GalaxyBarnard.SolarSystemBarnard);
        GalaxyBarnard.planetNepumuk.setRingColorRGB(0.1F, 0.9F, 0.6F);
        GalaxyBarnard.planetNepumuk.setPhaseShift(0.0F);
        GalaxyBarnard.planetNepumuk.setRelativeOrbitTime(1.2F);
        GalaxyBarnard.planetNepumuk.setBodyIcon(new ResourceLocation("zokoindustries", "textures/gui/planets/nepumuk.png"));
        GalaxyBarnard.planetNepumuk.setRelativeDistanceFromCenter(new CelestialBody.ScalableDistance(1.35F, 1.5F));
        GalaxyBarnard.planetNepumuk.setDimensionInfo(319, WorldProviderNepumuk.class, true).setTierRequired(1);
        GalaxyBarnard.planetNepumuk.atmosphereComponent(IAtmosphericGas.CO2).atmosphereComponent(IAtmosphericGas.METHANE).atmosphereComponent(IAtmosphericGas.ARGON).atmosphereComponent(IAtmosphericGas.HYDROGEN);
		GalaxyRegistry.registerPlanet(planetNepumuk);
		GalacticraftRegistry.registerTeleportType(WorldProviderNepumuk.class, new TeleportTypeMars());
		GalacticraftRegistry.registerRocketGui(WorldProviderNepumuk.class, new ResourceLocation("zokoindustries", "textures/gui/NepumuckRocketGui.png"));	
    }	

        
		

	


	

}
