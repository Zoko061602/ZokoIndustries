package com.Zoko.Industries.Modules.ThermalExpansion;

import com.Zoko.Industries.Modules.ThermalExpansion.Blocks.ThermalBlocks;
import com.Zoko.Industries.Modules.ThermalExpansion.Tiles.TileRegistry;

public class ThermalHandler {
	public static void preThermal(){
		ThermalBlocks.BlockInit();
		
	}
	
	public static void Thermal(){
		TileRegistry.ThermalTiles();
		
	}
	
	public static void postThermal(){
		
	}

}
