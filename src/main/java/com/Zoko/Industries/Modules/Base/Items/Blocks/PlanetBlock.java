package com.Zoko.Industries.Modules.Base.Items.Blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;

public class PlanetBlock extends ItemBlockWithMetadata{

	public PlanetBlock(Block block) {
		super(block, block);
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) {
	    return this.getUnlocalizedName() + "_" + stack.getItemDamage();
	}
		
}
