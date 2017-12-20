package com.Zoko.Industries.Modules.Base.Crafting;

import com.Zoko.Industries.Modules.Base.Items.Meta.Materials;
import com.Zoko.Industries.Modules.Base.Items.Meta.MetaItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

public class Furnance {

	public static void init(){
		for (int i = 0;!(i == Materials.OreKey.size());){
		GameRegistry.addSmelting(new ItemStack(MetaItems.ItemMaterials0,1,Materials.OreKey.size()*Materials.getType("dust")+i), 
				                 new ItemStack(MetaItems.ItemMaterials0,1,Materials.OreKey.size()*Materials.getType("ingot")+i), 0);
		GameRegistry.addSmelting(new ItemStack(MetaItems.ItemMaterials0,1,Materials.OreKey.size()*Materials.getType("dust_tiny")+i), 
                                 new ItemStack(MetaItems.ItemMaterials0,1,Materials.OreKey.size()*Materials.getType("nugget")+i), 0);
		i++;

	 }
	}
	
}
