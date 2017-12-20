package com.Zoko.Industries.Modules.Thaumcraft.Items.Caps;

import com.Zoko.Industries.Modules.Thaumcraft.Items.ThaumcraftItems;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import thaumcraft.api.wands.WandCap;

public class CapRegistry {	  
	
	public static Item WandCap = ThaumcraftItems.WandCap;
	

	 public static WandCap Cap_Invar;
	 public static WandCap Cap_Signallum;
	 public static WandCap Cap_Lumium;
	 public static WandCap Cap_Enderium;
	 public static WandCap Cap_Platinum;
	 public static WandCap Cap_DarkSteel;
	 public static WandCap Cap_Vibrant;
	 public static WandCap Cap_Electrum;
	 public static WandCap Cap_Electrum_Fluxed;
	 
	 public static void registerCaps(){
    
	Cap_Invar =     new CustomWandCap("invar",   1F, new ItemStack (WandCap,1,0), (int) 2, new ResourceLocation("zokoindustries", "textures/models/wand_cap_invar.png"));
	Cap_Signallum = new CustomWandCap("signallum", 0.95F, new ItemStack (WandCap,1,1), (int) 3.5, new ResourceLocation("zokoindustries", "textures/models/wand_cap_signallum.png"));
	Cap_Electrum =  new CustomWandCap("electrum", 0.9F, new ItemStack (WandCap,1,7), (int) 4, new ResourceLocation("zokoindustries", "textures/models/wand_cap_electrum.png"));
	Cap_Vibrant =   new CustomWandCap("vibrant", 0.9F, new ItemStack (WandCap,1,6), 4, new ResourceLocation("zokoindustries", "textures/models/wand_cap_vibrant.png"));
	Cap_Lumium =    new CustomWandCap("lumium",   0.875F, new ItemStack (WandCap,1,2), (int) 4.5, new ResourceLocation("zokoindustries", "textures/models/wand_cap_lumium.png"));
	Cap_DarkSteel = new CustomWandCap("darksteel", 0.85F, new ItemStack (WandCap,1,5), (int) 5.5, new ResourceLocation("zokoindustries", "textures/models/wand_cap_darksteel.png"));
	Cap_Platinum =  new CustomWandCap("platinum", 0.85F, new ItemStack (WandCap,1,4), (int) 5.5, new ResourceLocation("zokoindustries", "textures/models/wand_cap_platinum.png"));
	Cap_Enderium =  new CustomWandCap("enderium", 0.78F, new ItemStack (WandCap,1,3), (int) 6.5, new ResourceLocation("zokoindustries", "textures/models/wand_cap_enderium.png"));
	Cap_Electrum_Fluxed =  new CustomWandCap("fluxed-electrum", 0.78F, new ItemStack (WandCap,1,8), (int) 6.5, new ResourceLocation("zokoindustries", "textures/models/wand_cap_electrum_fluxed.png"));

	



}
	 }

