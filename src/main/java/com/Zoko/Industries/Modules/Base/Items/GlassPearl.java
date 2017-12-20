package com.Zoko.Industries.Modules.Base.Items;

import com.Zoko.Industries.ZokoIndustries;
import com.Zoko.Industries.ZokoTab;

import net.minecraft.item.Item;

public class GlassPearl extends Item {

	public GlassPearl() {
		this.setCreativeTab(ZokoTab.ZokoMain);
		this.setTextureName(ZokoIndustries.MODID +"GlassPearl");
		this.setUnlocalizedName("ItemGlassPearl");
	}
	/*
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
        if(player.capabilities.isCreativeMode){
        	return stack;      	
        }
        else{
             if(world.isRemote){
            	 world.spawnEntityInWorld(new Entity());
             }
        	
    		return stack;
        }   
	}
	*/
}
