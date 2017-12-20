package com.Zoko.Industries.Modules.ThermalExpansion.Tiles;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.tileentity.TileEntity;

public class TileRegistry {
	
	public static TileEntity TileFan = new TileFan();
	
	public static void ThermalTiles(){
		GameRegistry.registerTileEntity(TileFan.getClass(), "TileFan");
		
		
		
		
		
	}

}
