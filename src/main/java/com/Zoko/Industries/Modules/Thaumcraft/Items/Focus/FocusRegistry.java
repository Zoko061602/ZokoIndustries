package com.Zoko.Industries.Modules.Thaumcraft.Items.Focus;

import cpw.mods.fml.common.registry.GameRegistry;
import thaumcraft.api.wands.ItemFocusBasic;

public class FocusRegistry {

	public static ItemFocusBasic EnderFocus;
	
	public static void registerFoci(){
		
		EnderFocus = (ItemFocusBasic) new EnderFocus().setUnlocalizedName("EnderFocus");
        GameRegistry.registerItem(EnderFocus, "EnderFocus");

		
		
		
	}
}
