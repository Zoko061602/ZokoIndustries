package com.Zoko.Industries.Modules.Base.Items.Meta;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public final class  MetaItems {

	public static Item ItemMaterials0;
	public static Item ItemMaterials1;
	
	public static void init(){
	
		GameRegistry.registerItem(ItemMaterials0 = new com.Zoko.Industries.Modules.Base.Items.Meta.ItemMaterial0(), "ItemMaterial0");
		GameRegistry.registerItem(ItemMaterials1 = new com.Zoko.Industries.Modules.Base.Items.Meta.ItemMaterial1(), "ItemMaterial1");
		
	}





	
	
}
