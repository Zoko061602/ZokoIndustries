package com.Zoko.Industries;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ZokoIndustries.MODID, name = ZokoIndustries.MODNAME, version = ZokoIndustries.VERSION)

public class ZokoIndustries {
	

	    public static final String MODID = "ZokoIndustries";
	    public static final String MODNAME = "Zoko's Industries";
	    public static final String VERSION = "1.0.0";
	        
	    @Instance
	    public static ZokoIndustries instance = new ZokoIndustries();
	        
	    @SidedProxy(clientSide="com.Zoko.Industries.ClientProxy", serverSide="com.Zoko.Industries.ServerProxy")
	    public static CommonProxy proxy;
	    
	    @EventHandler
	    public void preInit(FMLPreInitializationEvent e) {
	    	proxy.preInit(e);
	    }
	        
	    @EventHandler
	    public void init(FMLInitializationEvent e) {
	    	proxy.Init(e);       
	    }
	        
	    @EventHandler
	    public void postInit(FMLPostInitializationEvent e) {
	    	proxy.postInit(e);
	    }
}
