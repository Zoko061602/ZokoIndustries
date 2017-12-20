package com.Zoko.Industries.Modules.IC2.Crafting;


import com.Zoko.Industries.Modules.Base.Items.Meta.Materials;
import com.Zoko.Industries.Modules.Base.Items.Meta.MetaItems;

import ic2.api.recipe.RecipeInputOreDict;
import ic2.api.recipe.Recipes;
import net.minecraft.item.ItemStack;

public class Metalformer  {


	public static void init() {

			for(int i=0;!(Materials.OreKey.size() == i);){
		      Recipes.metalformerRolling.addRecipe(new RecipeInputOreDict("ingot"+ Materials.OreKey.get(i)) , null, new ItemStack (MetaItems.ItemMaterials0,1,(Materials.OreKey.size()*Materials.getType("plate")+i)));
		      Recipes.metalformerRolling.addRecipe(new RecipeInputOreDict("plate"+ Materials.OreKey.get(i)) , null, new ItemStack (MetaItems.ItemMaterials0,1,(Materials.OreKey.size()*Materials.getType("casing")+i)));
		      Recipes.metalformerCutting.addRecipe(new RecipeInputOreDict("plate"+ Materials.OreKey.get(i)) , null, new ItemStack (MetaItems.ItemMaterials0,1,(Materials.OreKey.size()*Materials.getType("rod")+i)));		   
		        i++;	    
	          }			    
            }
	       
}
	
	
	
	
   
		
		
		
	
	



