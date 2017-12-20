package com.Zoko.Industries.Modules.Base.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class MachineAssembler extends Block {

	protected  MachineAssembler(String unloaclizedname, Material material) {
		super(material);
        this.setHardness(2.0F);
        this.setResistance(6.0F);
        this.setStepSound(soundTypeMetal);
	}
	

	}

