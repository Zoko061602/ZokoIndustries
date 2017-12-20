package com.Zoko.Industries.Modules.Thaumcraft.Items.Rods;

import com.Zoko.Industries.Modules.Thaumcraft.Items.ThaumcraftItems;
import com.Zoko.Industries.Modules.Thaumcraft.Items.Rods.Updates.Aero;
import com.Zoko.Industries.Modules.Thaumcraft.Items.Rods.Updates.Coal;
import com.Zoko.Industries.Modules.Thaumcraft.Items.Rods.Updates.Petro;
import com.Zoko.Industries.Modules.Thaumcraft.Items.Rods.Updates.Pyro;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import thaumcraft.api.wands.StaffRod;
import thaumcraft.api.wands.WandRod;

public class RodRegistry {
	
	private static Item WandRod = ThaumcraftItems.WandRod;

	 public static WandRod WAND_ROD_EMPTY;
	 public static WandRod WAND_ROD_REDSTONE;
	 public static WandRod WAND_ROD_GLOWSTONE;
	 public static WandRod WAND_ROD_COAL;
	 public static WandRod WAND_ROD_ENDER;
	 public static WandRod WAND_ROD_CRYO;
	 public static WandRod WAND_ROD_PYRO;
	 public static WandRod WAND_ROD_AERO;
	 public static WandRod WAND_ROD_PETRO;
	 public static WandRod WAND_ROD_MANA;
	 
	 public static StaffRod STAFF_ROD_REDSTONE;
	 public static StaffRod STAFF_ROD_GLOWSTONE;
	 public static StaffRod STAFF_ROD_COAL;
	 public static StaffRod STAFF_ROD_ENDER;
	 public static StaffRod STAFF_ROD_CRYO;
	 public static StaffRod STAFF_ROD_PYRO;
	 public static StaffRod STAFF_ROD_AERO;
	 public static StaffRod STAFF_ROD_PETRO;
	 public static StaffRod STAFF_ROD_MANA;
	 
	 public static void registerRods(){
		 		  
		       WAND_ROD_PYRO = new WandRod("pyro", 150, new ItemStack(WandRod, 1, 1), 16,new Pyro(), new ResourceLocation("zokoindustries", "textures/models/wand_rod_pyro.png"));
	           // STAFF_ROD_PYRO = new StaffRod("Pyro_Staff", 50, new ItemStack(WandRod, 1, 17), 24, new ResourceLocation("zokoindustries", "textures/models/wand_rod_blood.png"));
		       WAND_ROD_CRYO = new WandRod("cryo", 150, new ItemStack(WandRod, 1, 2), 16, new ResourceLocation("zokoindustries", "textures/models/wand_rod_cryo.png"));
		       // STAFF_ROD_CRYO = new StaffRod("Cryo_Staff", 50, new ItemStack(WandRod, 1, 15), 24, new ResourceLocation("zokoindustries", "textures/models/wand_rod_blood.png"));
		       WAND_ROD_AERO = new WandRod("aero", 150, new ItemStack(WandRod, 1, 3), 16,new Aero(), new ResourceLocation("zokoindustries", "textures/models/wand_rod_aero.png"));
		       // STAFF_ROD_AERO = new StaffRod("Aero_Staff", 50, new ItemStack(WandRod, 1, 16), 24, new ResourceLocation("zokoindustries", "textures/models/wand_rod_blood.png"));
		       WAND_ROD_PETRO = new WandRod("petro", 150, new ItemStack(WandRod, 1, 4), 16,new Petro(), new ResourceLocation("zokoindustries", "textures/models/wand_rod_petro.png"));
			   //  STAFF_ROD_PETRO = new StaffRod("Petro_Staff", 50, new ItemStack(WandRod, 1, 18), 24, new ResourceLocation("zokoindustries", "textures/models/wand_rod_blood.png"));
		       WAND_ROD_MANA = new WandRod("mana", 150, new ItemStack(WandRod, 1, 5), 32, new ResourceLocation("zokoindustries", "textures/models/wand_rod_mana.png"));
			   //  STAFF_ROD_MANA = new StaffRod("Mana_Staff", 50, new ItemStack(WandRod, 1, 19), 48, new ResourceLocation("zokoindustries", "textures/models/wand_rod_blood.png"));			             
		       WAND_ROD_REDSTONE = new WandRod("redstone", 150, new ItemStack(WandRod, 1, 6), 12, new ResourceLocation("zokoindustries", "textures/models/wand_rod_redstone.png"));
		       //STAFF_ROD_REDSTONE = new StaffRod("Redstone_Staff", 50, new ItemStack(WandRod, 1, 11), 18, new ResourceLocation("zokoindustries", "textures/models/wand_rod_blood.png"));
		       WAND_ROD_ENDER = new WandRod("ender", 150, new ItemStack(WandRod, 1, 7), 12, new ResourceLocation("zokoindustries", "textures/models/wand_rod_ender.png"));
		       //STAFF_ROD_ENDER = new StaffRod("Ender_Staff", 50, new ItemStack(WandRod, 1, 14), 18, new ResourceLocation("zokoindustries", "textures/models/wand_rod_blood.png")); 
		       WAND_ROD_GLOWSTONE = new WandRod("glowstone", 150, new ItemStack(WandRod, 1, 8), 12, new ResourceLocation("zokoindustries", "textures/models/wand_rod_glowstone.png"));
		       //STAFF_ROD_GLOWSTONE = new StaffRod("Glowstone_Staff", 50, new ItemStack(WandRod, 1, 12), 18, new ResourceLocation("zokoindustries", "textures/models/wand_rod_blood.png"));
		       WAND_ROD_COAL= new WandRod("coal", 150, new ItemStack(WandRod, 1, 9), 12,new Coal() ,new ResourceLocation("zokoindustries", "textures/models/wand_rod_coal.png"));
		       // STAFF_ROD_COAL = new StaffRod("Coal_Staff", 50, new ItemStack(WandRod, 1, 13), 18, new ResourceLocation("zokoindustries", "textures/models/wand_rod_blood.png"));
		       
  
		       
		     
		      
		     
	 }
}
