package com.Zoko.Industries.Modules.Base.Items.Meta;

import java.util.List;

import com.Zoko.Industries.ZokoIndustries;
import com.Zoko.Industries.ZokoTab;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class ItemMaterial1 extends Item{
	
	private IIcon[] icons = new IIcon [(Materials.CompundKey.size())+1];
	
	public ItemMaterial1(){
		
		this.setHasSubtypes(true);
		this.setUnlocalizedName("ItemMaterial1");
		this.setCreativeTab(ZokoTab.ZokoMaterials);
	}
		@Override
		public void registerIcons(IIconRegister reg) {
			int Icon = 0;   	
		    	for(int i=0;!(i == Materials.CompundKey.size());i++){		    		    			
                         this.icons[Icon] = reg.registerIcon(ZokoIndustries.MODID + ":materials/"+ Materials.CompundKey.get(i) +"ingot");   
                         Icon++;                 
		     
		    }
		   }
 
				public IIcon getIconFromDamage(int meta) {
		            if (meta > Materials.CompundKey.size())
		                meta = 0;

		            return this.icons[meta];
		        }
		        @SuppressWarnings({"unchecked","rawtypes"})
				@Override
		        public void getSubItems(Item item, CreativeTabs tab, List list) {
		            for (int i = 0; !(i == Materials.CompundKey.size()); i ++) {
		                list.add(new ItemStack(item, 1, i));
		            }
		        }

		    


		        @Override
		        public String getUnlocalizedName(ItemStack stack) {
		            return this.getUnlocalizedName() + "_" + stack.getItemDamage();
		        } 		
	}
                     
		    		



		    	
		 
		
		
	   
		
	 
   

	
