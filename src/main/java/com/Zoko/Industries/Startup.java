package com.Zoko.Industries;

import cpw.mods.fml.common.Loader;

public class Startup {
	
	  public static boolean TE =false;
	  public static boolean IC2 = false;
	  public static boolean TC4 = false;
	  public static boolean AdvSolar = false;
	  public static boolean Forbidden = false;
	  public static boolean IChest = false;
	  public static boolean ZokoMagic = false;
	  public static boolean Galactic = false;
	  public static boolean PlanetsIV = false;
			  
		
	  
	  
	  public static void initiate() {
		  
	       IC2 = Loader.isModLoaded("mod_IC2");
	       TC4 = Loader.isModLoaded("Thaumcraft");
	       IChest = Loader.isModLoaded("");
	       ZokoMagic= Loader.isModLoaded("ZokoWands");
	       Galactic= Loader.isModLoaded("galacticraft_core");
	       PlanetsIV=Loader.isModLoaded("");

	    }
	  
	  
	

}
