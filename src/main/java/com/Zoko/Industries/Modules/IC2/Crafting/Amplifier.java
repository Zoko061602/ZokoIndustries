package com.Zoko.Industries.Modules.IC2.Crafting;

import ic2.api.recipe.IRecipeInput;
import ic2.api.recipe.RecipeInputItemStack;
import ic2.api.recipe.RecipeInputOreDict;
import ic2.api.recipe.Recipes;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class Amplifier {

	  public static void init() {
	    addAmplifier("dustEnderium", 1, 10000);
	   
	    
	    
 }
	  

	  public static void addAmplifier(ItemStack input, int amount, int amplification) {
	    addAmplifier(new RecipeInputItemStack(input, amount), amplification);
	  }
	  
	  public static void addAmplifier(String input, int amount, int amplification) {
	    addAmplifier(new RecipeInputOreDict(input, amount), amplification);
	  }
	  public static void addAmplifier(IRecipeInput input, int amplification) {
	    NBTTagCompound metadata = new NBTTagCompound();
	    metadata.setInteger("amplification", amplification);   
	    Recipes.matterAmplifier.addRecipe(input, metadata, new ItemStack[0]);
	  }
	
	
}

