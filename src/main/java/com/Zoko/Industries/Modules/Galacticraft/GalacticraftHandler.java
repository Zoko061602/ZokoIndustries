package com.Zoko.Industries.Modules.Galacticraft;

import com.Zoko.Industries.Modules.Galacticraft.Blocks.GalacticraftBlocks;
import com.Zoko.Industries.Modules.Galacticraft.Galaxy.GalaxyBarnard;

public class GalacticraftHandler {
	
	public static void preGalacticraft(){
		GalacticraftBlocks.Blocks();
		
	}
	
	public static void Galacticraft(){
		GalaxyBarnard.Barnard();
		GalaxyBarnard.Zoko();
		GalaxyBarnard.Nepumuk();
		GalaxyBarnard.Dimaria();
		
	}
		
	public static void postGalacticraft(){
		
	}

}
