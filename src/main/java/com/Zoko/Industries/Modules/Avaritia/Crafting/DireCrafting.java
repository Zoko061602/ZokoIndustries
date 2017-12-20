package com.Zoko.Industries.Modules.Avaritia.Crafting;

import cpw.mods.fml.common.Loader;
import fox.spiteful.avaritia.crafting.Grinder;
import fox.spiteful.avaritia.crafting.Mincer;
import net.minecraftforge.oredict.OreDictionary;

public class DireCrafting {
	
	public static void DireCraftingInit(){
     ShapedCrafting();
	 ShapelessCrafting();	
	if(Loader.isModLoaded("agricraft")){
	  goAwayAgricraft();
	 }
	}
	
	private static void ShapedCrafting(){
	//ExtremeCraftingManager.getInstance().addExtremeShapedOreRecipe(result, recipe);
	}
	
	private static void ShapelessCrafting(){
	 Grinder.catalyst.getInput().add(OreDictionary.getOres("blockZokonite"));
	}
	
	private static void goAwayAgricraft(){	
		Mincer.stewRecipe.getInput().remove(OreDictionary.getOres("cropNitorWart"));
	 
	}
	
	
}
