package com.Zoko.Industries.Modules.Thaumcraft.Items.Rods.Updates;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.wands.IWandRodOnUpdate;
import thaumcraft.common.items.wands.ItemWandCasting;

public class Coal implements IWandRodOnUpdate {
	private static int slot= 0;
	private static boolean test = true;
	private static  Aspect primals[] = {Aspect.ORDER, Aspect.ENTROPY, Aspect.AIR, Aspect.EARTH, Aspect.WATER,Aspect.FIRE};
	

	@Override
	public void onUpdate(ItemStack stack, EntityPlayer player) {
         if(player.getHeldItem()== stack){
        	 if(player.isSneaking()){       		 
        		 if(player.inventory.hasItem(Items.coal)){
        			 for(int i = 5;!(i==0);i--){
        				 if(player.inventory.hasItem(Items.coal)){      					 
        					 for(int size =player.inventory.getSizeInventory();!(size==0);size--){
        					 if(player.inventory.getStackInSlot(size).getItem() == Items.coal);
        					      slot = size;
        					      test = true;
        					 }
        					 player.inventory.decrStackSize(slot, 1);	 
        				 }
        				 else {
        					 test = false;
        				 }   				 
        			 }
        				 for(int i = 0;!(i==primals.length);){
        				 ((ItemWandCasting)stack.getItem()).addVis(stack, primals[i], 1, test);
		                  i++;
        				 }
        		 }
        		 
        		 
        	 }
 
         }
         
  }
}
