package com.Zoko.Industries.Modules.Base.Items.Blocks;

import com.Zoko.Industries.Modules.Base.Items.Meta.Materials;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;

public class StorageBlock extends ItemBlockWithMetadata {

	public StorageBlock(Block block) {
		super(block, block);
	}
	
	
	
	@Override
	public int getColorFromItemStack(ItemStack stack, int p_82790_2_) {
		return Materials.ColorMapOre.get(Materials.OreKey.get(stack.getItemDamage()));
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) {
	    return this.getUnlocalizedName() + "_" + stack.getItemDamage();
	}



}
