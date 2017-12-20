package com.Zoko.Industries.Modules.Thaumcraft.Items.Rods.Updates;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.wands.IWandRodOnUpdate;
import thaumcraft.common.items.wands.ItemWandCasting;

public class Aero implements IWandRodOnUpdate {
	private static int i=0;
	private Aspect[] Primals ={Aspect.AIR,Aspect.EARTH,Aspect.ENTROPY,Aspect.ORDER,Aspect.FIRE,Aspect.WATER};

	@Override
	public void onUpdate(ItemStack arg0, EntityPlayer arg1) {
		int Yheight =arg1.getPlayerCoordinates().posY;
        i++;
		if(i==200){
           if(Yheight>=160){
        	   for(int j=0;!(j==Primals.length);){
                if(((ItemWandCasting)arg0.getItem()).getVis(arg0, Primals[j])<((ItemWandCasting)arg0.getItem()).getMaxVis(arg0)/5){
                	((ItemWandCasting)arg0.getItem()).addVis(arg0, Primals[j], 1, true);
                	j++;
                }
        	   }
           }
        	
        }
		
		
	}

}
