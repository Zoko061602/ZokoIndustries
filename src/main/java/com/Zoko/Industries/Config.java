package com.Zoko.Industries;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class Config {
	
	public static boolean PlanetZoko = true;
	public static boolean PlanetDimaria = true;
	public static boolean PlanetNepumuk = true;
	public static boolean Gears = true;
	public static int ZokoBiomeID = 154;
	public static int ZokoDimensionID = 317;
	public static int DimariaDimensionID = 318;
	public static int NepumukDimensionID = 319;

	
	
	  public static void init(File targ) {
	        Configuration conf = new Configuration(targ);
	         conf.load();	         
	         Gears = conf.get("Compatibility","Gear Changes", true).getBoolean();
	         ZokoBiomeID = conf.getInt("ZokoBiomeID", "World", 154, 1, 255, "Only Change if you know what you're doing!");
	         PlanetZoko = conf.get("Planets", "Zoko", true).getBoolean();
	         PlanetDimaria = conf.get("Planets", "Dimaria", true).getBoolean();
	         PlanetNepumuk = conf.get("Planets", "Nepumuk", true).getBoolean();
	         ZokoBiomeID = conf.getInt("ZokoBiomeID", "World", 317, 1, 255, "Only Change if you know what you're doing!");
	         DimariaDimensionID = conf.getInt("DimariaDimensionID", "World", 318, 1, 255, "Only Change if you know what you're doing!");
	         NepumukDimensionID = conf.getInt("NepumukDimensionID", "World", 319, 1, 255, "Only Change if you know what you're doing!");
	
	
	         conf.save();
	  }       
   }

