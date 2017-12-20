package com.Zoko.Industries.Modules.Thaumcraft.Items.Focus;

import com.Zoko.Industries.ZokoTab;

import net.minecraft.entity.item.EntityEnderPearl;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import thaumcraft.api.wands.ItemFocusBasic;

public class EnderFocus extends ItemFocusBasic {

	
	public EnderFocus() {
     super();
     this.setCreativeTab(ZokoTab.ZokoMain);
	}
	
	@Override
	public ItemStack onFocusRightClick(ItemStack itemstack, World world, EntityPlayer player,
			MovingObjectPosition movingobjectposition) {
		world.spawnEntityInWorld(new EntityEnderPearl(world, player));
		
		player.swingItem();
		return itemstack;
	}
	
}
