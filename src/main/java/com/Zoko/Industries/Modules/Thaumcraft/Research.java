package com.Zoko.Industries.Modules.Thaumcraft;

import java.util.HashMap;

import com.Zoko.Industries.Modules.Base.Items.Meta.Materials;
import com.Zoko.Industries.Modules.Base.Items.Meta.MetaItems;
import com.Zoko.Industries.Modules.Thaumcraft.Items.ThaumcraftItems;

import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.crafting.CrucibleRecipe;
import thaumcraft.api.crafting.IArcaneRecipe;
import thaumcraft.api.crafting.InfusionRecipe;
import thaumcraft.api.research.ResearchCategories;
import thaumcraft.api.research.ResearchItem;
import thaumcraft.api.research.ResearchPage;

public class Research {
	@SuppressWarnings("rawtypes")
	public static HashMap recipes = new HashMap();
  
	public static void Researchinit(){     
		
		 ResearchCategories.registerCategory("GALAXY", new ResourceLocation("zokoindustries", "textures/misc/icon.png"), new ResourceLocation("zokoindustries", "textures/misc/background.png"));
         new ResearchItem("UNIVERSE", "GALAXY",(new AspectList()).add(Aspect.MIND, 5).add(Aspect.TRAVEL, 1).add(Aspects.ELECTROCITY, 3), 0, 0, 3, new ResourceLocation("zokoindustries", "textures/misc/icon.png"))
          .setParents("ELDRITCHMAJOR").setPages(new ResearchPage[]{new ResearchPage("zokoindustries.research_page.GALAXY.1")}).registerResearchItem();
         
         new ResearchItem("MAGICSTATION", "GALAXY",(new AspectList()).add(Aspect.METAL, 5).add(Aspect.MAGIC, 1).add(Aspects.ELECTROCITY, 3), 0, -2, 3,new ItemStack(MetaItems.ItemMaterials1,1,Materials.getCompundMaterial("VoidIridium")))
         .setConcealed().setParents("UNIVERSE").setPages(new ResearchPage[]{new ResearchPage("zokoindustries.research_page.MAGICSTATION.1"),(new ResearchPage((IArcaneRecipe)recipes.get("MagicAlloy")))}).registerResearchItem();
         
         new ResearchItem("LIQUIDROD", "GALAXY",(new AspectList()).add(Aspect.VOID,7).add(Aspect.CRYSTAL, 8).add(Aspects.ELECTROCITY, 5),-5,2,3,new ItemStack(ThaumcraftItems.WandRod,1,0))
		 .setConcealed().setParents("ROD_silverwood").setPages(new ResearchPage[]{new ResearchPage("zokoindustries.research_page.LIQUIDROD.1"),(new ResearchPage((CrucibleRecipe)recipes.get("LiquidRod")))}).registerResearchItem();
         
         new ResearchItem("PEARLDUPLICATION", "GALAXY",(new AspectList()).add(Aspect.VOID, 5).add(Aspect.MAGIC, 1).add(Aspect.ELDRITCH, 3), 9, 9, 3, new ItemStack(ThaumcraftItems.MagicGlue))
         .setParents("PRIMPEARL").setPages(new ResearchPage[]{new ResearchPage("zokoindustries.research_page.PEARLDUPLICATION.1"),(new ResearchPage((IArcaneRecipe)recipes.get("DoublePearl1"))),(new ResearchPage((InfusionRecipe)recipes.get("DoublePearl2"))),}).registerResearchItem();
        
		
	}
}
