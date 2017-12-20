package com.Zoko.Industries.Modules.Base.Crafting;

import com.Zoko.Industries.Modules.Base.Items.Meta.Materials;
import com.Zoko.Industries.Modules.Base.Items.Meta.MetaItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;


public class ModCrafting {
	
	 public static void init(){
		 //Shaped0
         for(int i=0;!(i == Materials.OreKey.size());){
        	 //Gear
             GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MetaItems.ItemMaterials0,1,Materials.getType("gear")*Materials.OreKey.size()+i), 
            		 "PSP","S S","PSP",
            	     'P', "plate"+Materials.OreKey.get(i), 'S', "rod"+Materials.OreKey.get(i)));  	 
		  	 i++;
		  }

	     //Shapeless0	
         for(int i=0;!(i == Materials.OreKey.size());){        
        	 GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MetaItems.ItemMaterials0,1,Materials.getType("dust")+i), "dustSmall"+Materials.OreKey.get(i),"dustSmall"+Materials.OreKey.get(i),"dustSmall"+Materials.OreKey.get(i),"dustSmall"+Materials.OreKey.get(i)));
        	 GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(MetaItems.ItemMaterials0,1,Materials.getType("dust")+i), "dustTiny"+Materials.OreKey.get(i),"dustTiny"+Materials.OreKey.get(i),"dustTiny"+Materials.OreKey.get(i),"dustTiny"+Materials.OreKey.get(i),"dustTiny"+Materials.OreKey.get(i),"dustTiny"+Materials.OreKey.get(i),"dustTiny"+Materials.OreKey.get(i),"dustTiny"+Materials.OreKey.get(i),"dustTiny"+Materials.OreKey.get(i)));
        	 i++;
		  }
			
	}
}


