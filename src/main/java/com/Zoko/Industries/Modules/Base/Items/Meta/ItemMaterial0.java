package com.Zoko.Industries.Modules.Base.Items.Meta;

import java.util.List;

import com.Zoko.Industries.ZokoIndustries;
import com.Zoko.Industries.ZokoTab;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class ItemMaterial0 extends Item{
	
	private IIcon[] icons = new IIcon [(Materials.OreKey.size())*Materials.Types.length +1];
	
	public ItemMaterial0(){
		
		this.setHasSubtypes(true);
		this.setUnlocalizedName("ItemMaterial0");
		this.setCreativeTab(ZokoTab.ZokoMaterials);
	}
		@Override
		public void registerIcons(IIconRegister reg) {
			int Icon = 0;
		    for (int i= 0;!(i == Materials.Types.length);i++) {
		    	
		    	for(int j=0;!(j == Materials.OreKey.size());j++){
		    
		    		if(Materials.OreKey.get(j)== "PigIron"||Materials.OreKey.get(j)== "FluxedElectrum"||Materials.OreKey.get(j)== "GelidEnderium"){
		    	     	 this.icons[Icon] = reg.registerIcon(ZokoIndustries.MODID + ":materials/"+Materials.Types[i]+"_"+Materials.OreKey.get(j)); 	
		    	         Icon++;
		    		}
                    else{	
                         this.icons[Icon] = reg.registerIcon(ZokoIndustries.MODID + ":materials/"+Materials.Types[i]);   
                         Icon++;
                    }
		    	}
		    }
		    }
 
				public IIcon getIconFromDamage(int meta) {
		            if (meta > Materials.OreKey.size()*Materials.Types.length)
		                meta = 0;

		            return this.icons[meta];
		        }
		        @SuppressWarnings({"unchecked","rawtypes"})
				@Override
		        public void getSubItems(Item item, CreativeTabs tab, List list) {
		            for (int i = 0; !(i == Materials.OreKey.size()*Materials.Types.length); i ++) {
		                list.add(new ItemStack(item, 1, i));
		            }
		        }
		        
		        
		        @SideOnly(Side.CLIENT)
		    	public int getColorFromItemStack(ItemStack stack, int par2) {
		        	int Damage = stack.getItemDamage();
		        	int j=0;
		        	for(int i = 0;!(i == Materials.Types.length);i++){
		        		if(Damage-(i*Materials.OreKey.size())>=0){
		        			j=i;
		        		}	
		        	}                        	        	
		    		return Materials.ColorMapOre.get(Materials.OreKey.get(Damage-(j*Materials.OreKey.size())));		        	
		    	}
		        
		        @Override
		        public String getUnlocalizedName(ItemStack stack) {   
		            return this.getUnlocalizedName() + "_" + stack.getItemDamage();
		        } 	
		        
		        @SuppressWarnings({ "unchecked", "rawtypes" })
				@Override
		        public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean bool) {		        	
		        	super.addInformation(stack, player, list, bool);
		        	int Damage = stack.getItemDamage();
		        	int j=0;
		        	for(int i = 0;!(i == Materials.Types.length);i++){
		        		if(Damage-(i*Materials.OreKey.size())>=0){
		        			j=i;
		        		}	
		        	}    
		        	list.add(Materials.OreKey.get(Damage-(j*Materials.OreKey.size())));
		        	
		        }
		        
	}
                     
		    		



		    	
		 
		
		
	   
		
	 
   

	
