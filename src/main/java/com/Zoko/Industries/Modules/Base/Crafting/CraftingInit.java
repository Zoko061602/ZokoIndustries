package com.Zoko.Industries.Modules.Base.Crafting;

import com.Zoko.Industries.Modules.IC2.Crafting.Amplifier;
import com.Zoko.Industries.Modules.IC2.Crafting.Compressor;
import com.Zoko.Industries.Modules.IC2.Crafting.Macerator;
import com.Zoko.Industries.Modules.IC2.Crafting.Metalformer;

public class CraftingInit {
	
	public static void init(){
		
		OreDict.init();
		Furnance.init();
		Metalformer.init();
    	Macerator.init();
    	Amplifier.init();
    	Compressor.init();
		ModCrafting.init();
		
		
		
		
		
		
	}
	

}
