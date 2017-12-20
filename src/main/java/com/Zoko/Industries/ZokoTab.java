package com.Zoko.Industries;



import com.Zoko.Industries.Modules.Base.Items.ModItems;
import com.Zoko.Industries.Modules.Base.Items.Meta.MetaItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public final class ZokoTab  {

	public static final CreativeTabs ZokoMain = new CreativeTabs("Zokos Industries : Earth") {
	    @Override public Item getTabIconItem() {
	        return ModItems.Brickcast;
	    }
     };
 	public static final CreativeTabs ZokoMaterials = new CreativeTabs("Zokos Industries : Main") {
	    @Override public Item getTabIconItem() {
	        return ModItems.TabIcon;
	    }
     };
  	public static final CreativeTabs ZokoGalaxy = new CreativeTabs("Zokos Industries : Intergalactical") {
	    @Override public Item getTabIconItem() {
	        return MetaItems.ItemMaterials1;
	    }
     };
   	public static final CreativeTabs ZokoMagic = new CreativeTabs("Zokos Industries : Magic") {
	    @Override public Item getTabIconItem() {
	        return MetaItems.ItemMaterials1;
	    }
     };
    public static final CreativeTabs Zoko = new CreativeTabs("Zokos Industries : Magic") {
    	    @Override public Item getTabIconItem() {
    	        return MetaItems.ItemMaterials1;
    	}
     };
     
}
	
	
