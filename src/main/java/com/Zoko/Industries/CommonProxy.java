package com.Zoko.Industries;

import com.Zoko.Industries.Modules.ModuleHandler;
import com.Zoko.Industries.Modules.Base.Blocks.ModBlocks;
import com.Zoko.Industries.Modules.Base.Crafting.CraftingInit;
import com.Zoko.Industries.Modules.Base.Items.ModItems;
import com.Zoko.Industries.Modules.Base.Items.Meta.Materials;
import com.Zoko.Industries.Modules.Base.Items.Meta.MetaItems;
import com.Zoko.Industries.World.ModBiomeManager;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
    	
    	Startup.initiate();
    	Config.init(e.getSuggestedConfigurationFile());
    	Materials.registerMaterials();
    	ModItems.init();
    	ModBlocks.init();
    	MetaItems.init();
    	ModBiomeManager.init();
    	ModuleHandler.preModules();
    }

    public void Init(FMLInitializationEvent e) {
    	CraftingInit.init();
    	ModuleHandler.Modules();
    }

    public void postInit(FMLPostInitializationEvent e) {
    	ModuleHandler.postModules();
    	
    	

    }


}