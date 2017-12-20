package com.Zoko.Industries.Modules.Thaumcraft;

import com.Zoko.Industries.Modules.Thaumcraft.Items.ThaumcraftItems;
import com.Zoko.Industries.Modules.Thaumcraft.Items.Caps.CapRegistry;
import com.Zoko.Industries.Modules.Thaumcraft.Items.Focus.FocusRegistry;
import com.Zoko.Industries.Modules.Thaumcraft.Items.Rods.RodRegistry;

public class ThaumcraftHandler {
	
	public static void preThaumcraft(){
		ThaumcraftItems.init();
		
		
	}
	
	public static void Thaumcraft(){
		Aspects.initAspects();
	//	Recipes.Recipesinit();
	//	Research.Researchinit();
		CapRegistry.registerCaps();
		RodRegistry.registerRods();
		FocusRegistry.registerFoci();
		
	
	}
	
	public static void postThaumcraft(){
		
		
		
	}

}
