package com.Zoko.Industries.Modules;

import com.Zoko.Industries.Modules.Avaritia.AvaritaHandler;
import com.Zoko.Industries.Modules.Botania.BotaniaHandler;
import com.Zoko.Industries.Modules.Galacticraft.GalacticraftHandler;
import com.Zoko.Industries.Modules.Thaumcraft.ThaumcraftHandler;
import com.Zoko.Industries.Modules.ThermalExpansion.ThermalHandler;

public class ModuleHandler {
	
	public static void preModules(){	   
		GalacticraftHandler.preGalacticraft();
		BotaniaHandler.preBotania();
		ThaumcraftHandler.preThaumcraft();	
		ThermalHandler.preThermal();
		AvaritaHandler.AvaritiuspreInit();
		
	}
	
	public static void Modules(){
		GalacticraftHandler.Galacticraft();
		BotaniaHandler.Botania();
		ThaumcraftHandler.Thaumcraft();
		ThermalHandler.Thermal();
		AvaritaHandler.AvaritiusInit();
	}
	public static void postModules(){
		GalacticraftHandler.postGalacticraft();
		BotaniaHandler.postBotania();
		ThaumcraftHandler.postThaumcraft();
		ThermalHandler.postThermal();
		AvaritaHandler.AvaritiuspostInit();
	}
	

}
