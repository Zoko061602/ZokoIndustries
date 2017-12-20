package com.Zoko.Industries.Modules.Base.Items.Meta;

import java.util.ArrayList;
import java.util.HashMap;

public class Materials {
    public static ArrayList<String> OreKey = new ArrayList<>();
    public static ArrayList<String> CompundKey = new ArrayList<>();  
    private static int Ore = 0;
    private static int Compund= 0;
	public static HashMap<String, Integer> ColorMapOre = new HashMap<>();
	public static final String[] Types ={			
				"dust",
				"gem",
				"ingot",
				"nugget",
				"plate",
				"plate_dense",
				"rod",
				"gear",
				"dust_small",
				"dust_tiny",
				"casing"				
		};		
    
    public static void registerMaterials(){
     register();	
    	
    }


	private static void register(){
    	
    	registerOreMaterial("Iron", 0xD8D8D8);
    	registerOreMaterial("Gold", 0xFFFF8B);
    	registerOreMaterial("Copper", 0xFFB421);
    	registerOreMaterial("Tin", 0xBBE0E6);		
    	registerOreMaterial("Silver", 0xE7F1F1);		
    	registerOreMaterial("Lead", 0x818EBE);	
		registerOreMaterial("Platinum", 0xDCECEF);	
		registerOreMaterial("Prometheum", 0x6A9865);		
		registerOreMaterial("Orichalcum", 0xA2C886);	
		registerOreMaterial("Quicksilver", 0xD1EFEB);				
		registerOreMaterial("Adamantine", 0xFE4343);		
		registerOreMaterial("Atlarus", 0xFFE004);		
		registerOreMaterial("Zinc", 0xEBE3C1);		
		registerOreMaterial("Manganese", 0xD584D5);	
		registerOreMaterial("Nickel", 0xE3DF94);			
		registerOreMaterial("Aluminium", 0xEDEDED);
		registerOreMaterial("Uranium", 0x3B6F07);		
		registerOreMaterial("Ardite", 0xFF8517);
		registerOreMaterial("Cobalt", 0x59AAEF);			
		registerOreMaterial("Plutonium", 0xAAAAAA);
		registerOreMaterial("BlackPlutonium", 0x444444);
		registerOreMaterial("Nikolite", 0x007273);
		registerOreMaterial("Norium", 0x384A72);		
		registerOreMaterial("Quantium", 0x00FF00);		
		registerOreMaterial("Zokonite", 0x3A899E);	
		registerOreMaterial("Diamond", 0xA2F6E7);
		registerOreMaterial("Sunnarium", 0x627302);
		registerOreMaterial("Iridium", 0xF0F0F0);
		registerOreMaterial("Silicon", 0x171717);
		registerOreMaterial("ShadowIron", 0x8D7565);
		registerOreMaterial("Endium", 0x650065);
        registerOreMaterial("Ignatus", 0xFFCE9D);	
		registerOreMaterial("Vyroxeres", 0x88FE41);
		registerOreMaterial("Ceruclase", 0x8CBDD0);
		registerOreMaterial("Inoshalite", 0x94D8BB);
		registerOreMaterial("Kaldendrite", 0xC691D2);	
		registerOreMaterial("Vulcanite", 0xFFB08A);
		registerOreMaterial("Sangunite", 0xFF0F0F);
		registerOreMaterial("Oureclase", 0xE7862E);
		registerOreMaterial("Adluorite", 0xD8D8D8);
		registerOreMaterial("DeepIron", 0x798FA2);	
		registerOreMaterial("Midasium", 0xFFCB7D);
		registerOreMaterial("AstralSilver", 0xD1DDDE);		
		registerOreMaterial("Carmot", 0xE7E0B6);
		registerOreMaterial("Mithril", 0xB5F5FB);
		registerOreMaterial("Emerald", 0x17DD62);
		registerOreMaterial("Lapis", 0x5A82E2);
		registerOreMaterial("Quartz", 0xD1BEB1);
		registerOreMaterial("Ruby", 0xC41743);
		registerOreMaterial("Saphire", 0x2F8FBE);
		registerOreMaterial("Peridot", 0x92BB5C);
		registerOreMaterial("Malachite", 0x10917A);
		registerOreMaterial("Amber", 0xFFCB68);
		registerOreMaterial("Topaz", 0xF1935C);
		registerOreMaterial("Tanzanite", 0x8A2FE0);
		registerOreMaterial("Elementium", 0xFCCEFE);
		registerOreMaterial("Invar", 0xD0D7D5);		
		registerOreMaterial("Signalum", 0xFFD887);		
		registerOreMaterial("Lumium", 0xF3F9DF);
		registerOreMaterial("Enderium", 0x127575);	
    	registerOreMaterial("Obsidian", 0x8F21DF);
		registerOreMaterial("EnderiumBase", 0x4E7A9A);
		registerOreMaterial("Enderpearl", 0x2CCDB1);		
		registerOreMaterial("Flint", 0x7F7F7F);
		registerOreMaterial("Alumite", 0xF9ECF7);
		registerOreMaterial("Manyulln", 0xBD92F1);		
		registerOreMaterial("DarkSteel", 0x5B5B5B);
		registerOreMaterial("PhasedGold", 0x92B029);		
		registerOreMaterial("EnergeticAlloy", 0xED8009);		
		registerOreMaterial("ConductiveIron", 0xDDBAB3);
		registerOreMaterial("Soularium", 0x786349);
		registerOreMaterial("ElectricalSteel", 0xC9C9C9);		
		registerOreMaterial("RedstoneAlloy", 0xFF7373);		
		registerOreMaterial("PhasedIron", 0x82FA9E);
		registerOreMaterial("EnderEye", 0x659F55);	
		registerOreMaterial("FluxedElectrum", 0xFFFFFF);
		registerOreMaterial("GelidEnderium", 0xFFFFFF);		
		registerOreMaterial("Thaumium", 0x9F93C5);		
		registerOreMaterial("Void", 0x39265E);
		registerOreMaterial("ManaSteel", 0xCDECFE);		
		registerOreMaterial("TerraSteel", 0x9AF68D);	
		registerOreMaterial("Tartarite", 0xFFB697);	
		registerOreMaterial("PigIron", 0xFFFFFF);	
		registerOreMaterial("Amordrine", 0xA98DB1);
		registerOreMaterial("Celengil", 0xC1E197);	
		registerOreMaterial("Bronze", 0xFBDCBA);		
    	registerOreMaterial("Electrum", 0xEBE3B1);
    	registerOreMaterial("BlackSteel", 0x395679);
		registerOreMaterial("ShadowSteel", 0x887362);
		registerOreMaterial("Hepaziton", 0xC6A58C);
		registerOreMaterial("DamascusSteel", 0x897949);
		registerOreMaterial("Angmallen", 0xFCEE4B);
		registerOreMaterial("Brass", 0xDFD0AA);
		registerOreMaterial("Haderoth", 0xDF5920);		
        registerOreMaterial("Glowstone",0x000000);
		registerOreMaterial("Carbon", 0x252525);
		registerOreMaterial("Uranium235", 0x60AE11);
		registerOreMaterial("Steel", 0x818181);
		
		//Compund
		registerCompundMaterial("VoidIridium");
		registerCompundMaterial("AdvancedAlloy");
		registerCompundMaterial("HeavyDutyT1");
		registerCompundMaterial("HeavyDutyT2");
		registerCompundMaterial("HeavyDutyT3");
		
		
		
	}
	private static void registerOreMaterial(String name,int color){	   
		   OreKey.add(Ore,name);
           ColorMapOre.put(name, color);
           Ore++;
	}
	private static void registerCompundMaterial(String name){
           CompundKey.add(Compund,name);	
           Compund++;
	}

	public static int getOreMaterial(String string){
		int j = 0;
		for(int i=0;!(i==Ore);i++){
			if(string == OreKey.get(i))
				j=i;
		}
		return j;
	}
	public static int getCompundMaterial(String string) {
		int j = 0;
		for(int i=0;!(i==Compund);i++){
			if(string == CompundKey.get(i))
				j=i;
		}
		return j;
	}

	public static int getType(String input){
		int j=0;
		for(int i=0; i < Types.length; i++){
		    if(Types[i].equals(input)){
		    	j=i;
		    }
		  }
		return j;
 }
	
}
