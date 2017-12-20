package com.Zoko.Industries.Modules.Base.Items;

import com.Zoko.Industries.ZokoIndustries;

import amerifrance.guideapi.api.base.Book;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public final class ModItems {   
	
     public static Item Brickcast;
     public static Item Ring;
     public static Item ShockBelt;
     public static Item Upgrade_Metalformer;
     public static Book PSE;
	 public static Item TabIcon;	

         	
        
	
    public static void init() {
       //Simple Items
    	Brickcast = new Item().setUnlocalizedName("Brickcast").setCreativeTab(CreativeTabs.tabMisc).setTextureName(ZokoIndustries.MODID + ":" + "Brickcast"); 			            
    	GameRegistry.registerItem(Brickcast, "Brickcast");
       //Stub Items
    	TabIcon = new Item().setUnlocalizedName("TabIcon").setTextureName(ZokoIndustries.MODID + ":" + "TabIcon");
    	GameRegistry.registerItem(TabIcon, "TabIcon");
    	
       //Upgrade
    	GameRegistry.registerItem(Upgrade_Metalformer = new UpgradeMetalformer("Upgrade_Metalformer"), "UpgradeMetalformer");
    	// Book
    	Books.registerBook(PSE, "Periodic Table");
    }


		
}
   
