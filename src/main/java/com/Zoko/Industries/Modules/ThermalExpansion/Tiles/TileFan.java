package com.Zoko.Industries.Modules.ThermalExpansion.Tiles;

import ic2.api.energy.tile.IEnergyConductor;
import ic2.api.energy.tile.IEnergySink;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.ForgeDirection;


public class TileFan extends TileEntity implements  IEnergySink {

	@Override
	public boolean acceptsEnergyFrom(TileEntity emitter, ForgeDirection direction) {
		boolean Interface = false;
		for(int i =0;!(emitter.getClass().getInterfaces().length == i);){
			if(emitter.getClass().getInterfaces()[i] == IEnergyConductor.class){
				Interface = true;
			}
		} 
         if(direction == ForgeDirection.DOWN && Interface){
        	 return true;
         }      	 
         else return false;
	}

	@Override
	public double getDemandedEnergy() {
		return 32;
	}

	@Override
	public int getSinkTier() {
		return 1;
	}

	@Override
	public double injectEnergy(ForgeDirection directionFrom, double amount, double voltage) {
		return amount -0.01F;
	}

}
