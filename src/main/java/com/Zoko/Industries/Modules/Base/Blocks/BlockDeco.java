package com.Zoko.Industries.Modules.Base.Blocks;

import java.util.ArrayList;

import com.Zoko.Industries.ZokoTab;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BlockDeco extends Block {

	protected BlockDeco(Material material) {
		super(material);
      this.setHarvestLevel("spade", 1, 0);
      this.setCreativeTab(ZokoTab.ZokoMain);
      this.setHardness(2.0F);
      this.setResistance(6.0F);
      this.setStepSound(soundTypeSand);    
	}
 
	@Override
	public void registerBlockIcons(IIconRegister reg) {	
		super.registerBlockIcons(reg);
	}

	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
      ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
      drops.add(0, new ItemStack(this, 1, metadata));
      drops.add(1, new ItemStack(this, 1, metadata));
      drops.add(2, new ItemStack(this, 1, metadata));
      drops.add(3, new ItemStack(this, 1, metadata));
      drops.add(4, new ItemStack(this, 1, metadata));
      drops.add(5, new ItemStack(this, 1, metadata));
      drops.add(6, new ItemStack(this, 1, metadata));
      drops.add(7, new ItemStack(this, 1, metadata));
      drops.add(8, new ItemStack(this, 1, metadata));
      drops.add(9, new ItemStack(this, 1, metadata));
      drops.add(10, new ItemStack(this, 1, metadata));
      drops.add(11, new ItemStack(this, 1, metadata));
      drops.add(12, new ItemStack(this, 1, metadata));
      drops.add(13, new ItemStack(this, 1, metadata));
      drops.add(14, new ItemStack(this, 1, metadata));
      drops.add(15, new ItemStack(this, 1, metadata));
        return drops;
      
      }		
	}
		
	
	

