package com.Zoko.Industries.Modules.Base.Blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	

	public static Block MachineAssembler;
	
	
	public static void init(){
		GameRegistry.registerBlock(MachineAssembler = new MachineAssembler("Machine", Material.iron), "Machine0");
	
	}
	
	
	
	
	

}
