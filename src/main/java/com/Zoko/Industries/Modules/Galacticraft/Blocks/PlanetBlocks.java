package com.Zoko.Industries.Modules.Galacticraft.Blocks;

import java.util.List;

import com.Zoko.Industries.ZokoIndustries;
import com.Zoko.Industries.ZokoTab;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class PlanetBlocks extends Block {
	public IIcon[] icons = new IIcon[12];
    private static String[] planets ={
    		"dimaria",
    		"zoko",
    		"nepumuk"
    };
    private static String[] rock ={
    		"top",
    		"middle",
    		"bottom",
    		"cobblestone"
    };
	
	public PlanetBlocks(Material material) {
		super(material);
		this.setCreativeTab(ZokoTab.ZokoGalaxy);
		this.setHardness(0.9F);
        this.setHarvestLevel("pickaxe", 0);
        this.setHarvestLevel("shovel", -1, 0);
        this.setHarvestLevel("shovel", -1, 1);
        this.setHarvestLevel("shovel", -1, 4);
        this.setHarvestLevel("shovel", -1, 5);
        this.setHarvestLevel("shovel", -1, 8);
        this.setHarvestLevel("shovel", -1, 9);
		this.setResistance(15);
		this.setStepSound(soundTypeStone);
	}
	
	@Override
	public void registerBlockIcons(IIconRegister reg) {
		int Icon = 0;
	    for (int i = 0; !(i==3);i++) {
	    	for (int j = 0;!(j==4);j++){
	    	     this.icons[Icon] = reg.registerIcon(ZokoIndustries.MODID +":PlanetBlocks/"+planets[i]+"_"+rock[j]);	    
	    	     Icon++;
	    	    }	        
          }
	
}
	    @SuppressWarnings("unchecked")
		@Override
	    public void getSubBlocks(Item item, CreativeTabs tab, @SuppressWarnings("rawtypes") List list) {
	        for (int i = 0; i < icons.length; i ++) {
	            list.add(new ItemStack(item, 1, i));
	        }
	    }
	    
	    @Override
	    public IIcon getIcon(int side, int meta) {
	        if (meta>11)
	            meta = 0;
	        return icons[meta];
	    }
	    
	@Override
    public int damageDropped(int meta) {
		switch(meta){
		case 2:
		case 6:
		case 10: return meta+1;
		default :return meta;
	}
	}

	
	
	}
		

	
	
	