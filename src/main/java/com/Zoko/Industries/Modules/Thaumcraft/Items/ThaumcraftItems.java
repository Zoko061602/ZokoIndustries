package com.Zoko.Industries.Modules.Thaumcraft.Items;

import com.Zoko.Industries.ZokoIndustries;
import com.Zoko.Industries.Modules.Thaumcraft.Items.Caps.ItemWandCaps;
import com.Zoko.Industries.Modules.Thaumcraft.Items.Rods.ItemWandCores;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ThaumcraftItems {
	
	public static Item WandRod;
	public static Item WandCap;
    public static Item MagicGlue;
    public static Item FocusEnder;
	
	
	public static void init(){
		GameRegistry.registerItem(WandRod = new ItemWandCores(),"ItemWandRod");
		GameRegistry.registerItem(WandCap = new ItemWandCaps(), "ItemWandCap");
		MagicGlue = new Item().setUnlocalizedName("MagicPearl").setCreativeTab(CreativeTabs.tabMisc).setTextureName(ZokoIndustries.MODID + ":" + "primal_glue"); 			            
    	GameRegistry.registerItem(MagicGlue, "primal_glue");
		
		
		
		
	}
	

}
