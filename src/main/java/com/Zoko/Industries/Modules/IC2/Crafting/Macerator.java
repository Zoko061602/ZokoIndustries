package com.Zoko.Industries.Modules.IC2.Crafting;

import com.Zoko.Industries.Modules.Base.Items.Meta.Materials;
import com.Zoko.Industries.Modules.Base.Items.Meta.MetaItems;

import ic2.api.recipe.RecipeInputOreDict;
import ic2.api.recipe.Recipes;
import net.minecraft.item.ItemStack;

public class Macerator {
	

	public static void init() {
			for(int i=0;!(Materials.OreKey.size() == i);){
			  Recipes.macerator.addRecipe(new RecipeInputOreDict("ingot"+ Materials.OreKey.get(i)) , null, new ItemStack (MetaItems.ItemMaterials0,1,(Materials.OreKey.size()*Materials.getType("dust")+i)));
		      Recipes.macerator.addRecipe(new RecipeInputOreDict("gear"+ Materials.OreKey.get(i)) , null, new ItemStack (MetaItems.ItemMaterials0,4,(Materials.OreKey.size()*Materials.getType("dust")+i)));
		      Recipes.macerator.addRecipe(new RecipeInputOreDict("rod"+ Materials.OreKey.get(i)) , null, new ItemStack (MetaItems.ItemMaterials0,2,(Materials.OreKey.size()*Materials.getType("dust_small")+i)));
		      Recipes.macerator.addRecipe(new RecipeInputOreDict("gem"+ Materials.OreKey.get(i)) , null, new ItemStack (MetaItems.ItemMaterials0,1,(Materials.OreKey.size()*Materials.getType("dust")+i)));
		      Recipes.macerator.addRecipe(new RecipeInputOreDict("plate"+ Materials.OreKey.get(i)) , null, new ItemStack (MetaItems.ItemMaterials0,1,(Materials.OreKey.size()*Materials.getType("dust")+i)));
		      Recipes.macerator.addRecipe(new RecipeInputOreDict("plate_dense"+ Materials.OreKey.get(i)) , null, new ItemStack (MetaItems.ItemMaterials0,9,(Materials.OreKey.size()*Materials.getType("dust")+i)));
		      i++;
		      
		      
     }
   }
}
