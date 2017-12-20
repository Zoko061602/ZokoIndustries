package com.Zoko.Industries.Modules.Base.Crafting;

import com.Zoko.Industries.Modules.Base.Items.Meta.Materials;
import com.Zoko.Industries.Modules.Base.Items.Meta.MetaItems;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class OreDict {
	
	@SuppressWarnings("unused")
	private static ItemStack IronDust = new ItemStack(MetaItems.ItemMaterials0,1,0);
	
	public static void init() {
	//Material0
		for(int i=0;!(Materials.Types.length == i);){
			for(int j=0;!(Materials.OreKey.size() == j);){
				OreDictionary.registerOre(Materials.Types[i]+Materials.OreKey.get(j), new ItemStack(MetaItems.ItemMaterials0,1,(i*Materials.OreKey.size()+j)));
		        j++;	    
	          }		
	        i++;	    
          }
	//Blocks
		for(int j=0;!(Materials.OreKey.size() == j);){
			//OreDictionary.registerOre("block"+Materials.OreKey.get(j), new ItemStack(ModBlocks.StorageBlock,1,j));
	        j++;	    
          }		    
      }
    }
