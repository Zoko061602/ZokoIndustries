package com.Zoko.Industries.Modules.IC2.Blocks;

import com.Zoko.Industries.ZokoIndustries;
import com.Zoko.Industries.ZokoTab;
import com.Zoko.Industries.Modules.ThermalExpansion.Tiles.TileFan;
import com.Zoko.Industries.Modules.ThermalExpansion.Tiles.TileRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockFan extends Block {
	public IIcon[] icons = new IIcon[6];

	protected BlockFan(Material material) {
		super (material);
		this.setResistance(20F);
		this.setHardness(5F);
		this.setCreativeTab(ZokoTab.ZokoMain);
		this.setStepSound(soundTypeMetal);		
		this.setBlockTextureName(ZokoIndustries.MODID + ":machine/Fan/"+"Fan");
	}
	
	@Override
	public void registerBlockIcons(IIconRegister reg) {
	    for (int i = 0; i < 6; i ++) {
	        this.icons[i] = reg.registerIcon(this.textureName + i);
	    }
	}
	@Override
	public IIcon getIcon(int side, int meta) {
	    return this.icons[side];
	}

	@Override
	public TileEntity createTileEntity(World world, int metadata) {
		return TileRegistry.TileFan;
	}

}
