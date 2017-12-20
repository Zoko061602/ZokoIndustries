package com.Zoko.Industries.Modules.Thaumcraft;

import com.Zoko.Industries.Modules.Base.Items.Meta.Materials;
import com.Zoko.Industries.Modules.Base.Items.Meta.MetaItems;
import com.Zoko.Industries.Modules.Thaumcraft.Items.ThaumcraftItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.common.config.ConfigBlocks;
import thaumcraft.common.config.ConfigItems;;;

public class Recipes {
	private static AspectList WandRod = (AspectList) new AspectList().add(Aspect.MAGIC, 32).add(Aspect.VOID,16).add(Aspect.TOOL, 24);
			
			
	
	
	@SuppressWarnings("unchecked")
    public static void Recipesinit(){
		
		//Furnace
		GameRegistry.addSmelting(new ItemStack(ConfigItems.itemEldritchObject,1,3), new ItemStack(ThaumcraftItems.MagicGlue,2,0), 0);
		
		//ArcaneCrafting
		Research.recipes.put("MagicAlloy", ThaumcraftApi.addArcaneCraftingRecipe("MagicAlloy", new ItemStack(MetaItems.ItemMaterials1,1,Materials.getCompundMaterial("VoidIridium")),(new AspectList()).add(Aspect.ENTROPY, 25).add(Aspect.WATER, 25).add(Aspect.FIRE, 25).add(Aspect.AIR, 25).add(Aspect.EARTH, 25).add(Aspect.ORDER, 25),
		   new Object[]{"AAA", "BBB", "AAA", Character.valueOf('A'), new ItemStack(MetaItems.ItemMaterials0,1,Materials.getType("plate")*Materials.OreKey.size()+Materials.getOreMaterial("Void")), Character.valueOf('B'), new ItemStack(MetaItems.ItemMaterials0,1,Materials.getType("plate")*Materials.OreKey.size()+Materials.getOreMaterial("Iridium"))}));
				
		Research.recipes.put("DoublePearl1", ThaumcraftApi.addArcaneCraftingRecipe("DoublePearl", new ItemStack(ThaumcraftItems.MagicGlue,2,0),(new AspectList()).add(Aspect.ENTROPY, 150).add(Aspect.WATER, 150).add(Aspect.FIRE, 150).add(Aspect.AIR, 150).add(Aspect.EARTH, 150).add(Aspect.ORDER, 150),
				   new Object[]{"AAA", "BCB", "AAA", Character.valueOf('A'), new ItemStack(ConfigBlocks.blockCosmeticOpaque,1,2), Character.valueOf('B'), new ItemStack(ConfigBlocks.blockCrystal,1,6),Character.valueOf('C'), new ItemStack(ThaumcraftItems.MagicGlue,1,0)}));
		
		//Crucible
	    Research.recipes.put("LiquidRod", ThaumcraftApi.addCrucibleRecipe("LiquidRod", new ItemStack(ThaumcraftItems.WandRod,1,0), new ItemStack(Items.glass_bottle,1,0), (new AspectList()).merge(Aspect.MAGIC, 16).merge(Aspect.VOID, 8)));
	    
	    //Infusion
	    Research.recipes.put("RodEnder", ThaumcraftApi.addInfusionCraftingRecipe("LIQUIDROD", new ItemStack(ThaumcraftItems.WandRod,1,9),8,
	    		(new AspectList()).add(Aspect.ENERGY,8).add(WandRod), new ItemStack(ThaumcraftItems.WandRod),new ItemStack[]{new ItemStack(Items.coal,1,0),new ItemStack(Items.diamond)}));

	}

}
