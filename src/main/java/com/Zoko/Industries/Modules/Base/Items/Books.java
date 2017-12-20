package com.Zoko.Industries.Modules.Base.Items;

import java.awt.Color;
import java.util.ArrayList;

import com.Zoko.Industries.Modules.Base.Items.Meta.Materials;
import com.Zoko.Industries.Modules.Base.Items.Meta.MetaItems;

import amerifrance.guideapi.api.GuideRegistry;
import amerifrance.guideapi.api.abstraction.CategoryAbstract;
import amerifrance.guideapi.api.abstraction.EntryAbstract;
import amerifrance.guideapi.api.abstraction.IPage;
import amerifrance.guideapi.api.base.Book;
import amerifrance.guideapi.api.util.BookBuilder;
import amerifrance.guideapi.api.util.PageHelper;
import amerifrance.guideapi.categories.CategoryItemStack;
import amerifrance.guideapi.categories.CategoryResourceLocation;
import amerifrance.guideapi.entries.EntryText;
import amerifrance.guideapi.pages.PageFurnaceRecipe;
import amerifrance.guideapi.pages.PageIRecipe;
import amerifrance.guideapi.pages.PageImage;
import amerifrance.guideapi.pages.PageSound;
import amerifrance.guideapi.pages.PageText;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.ShapelessRecipes;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

@SuppressWarnings("deprecation")
public class Books {
	



	 public static void registerBook(Book book, String title)
	  {
	    PageText page1 = new PageText("HERE IS SOME TEXT FOR YOU TO DRAW LEWL. I AM VERY LONG FOR NOTHING MATE");
	    PageText page2 = new PageText("HERE IS SOME TEXT FOR YOU TO DRAW LEWL. I AM VERY LONG FOR NOTHING MATE. \n\nNew paragraph!");
	    PageImage page3 = new PageImage(new ResourceLocation("guideapi:textures/gui/testimage.png"));
	    PageIRecipe page4 = new PageIRecipe(GameRegistry.addShapedRecipe(new ItemStack(Items.diamond), new Object[] { "XXX", "YYY", "ZZZ", Character.valueOf('X'), Items.apple, Character.valueOf('Y'), Blocks.beacon, Character.valueOf('Z'), Items.beef }));
	    ShapedOreRecipe shapedOreRecipe = new ShapedOreRecipe(Items.beef, new Object[] { "XXX", "YYY", "ZZZ", Character.valueOf('X'), "stairWood", Character.valueOf('Y'), "stone", Character.valueOf('Z'), "ingotIron" });
	    PageIRecipe page5 = new PageIRecipe(shapedOreRecipe);
	    ArrayList<ItemStack> shapelessList = new ArrayList<ItemStack>();
	    shapelessList.add(new ItemStack(Items.cauldron));
	    shapelessList.add(new ItemStack(Items.golden_carrot));
	    ShapelessRecipes shapelessRecipes = new ShapelessRecipes(new ItemStack(Items.blaze_rod), shapelessList);
	    PageIRecipe page6 = new PageIRecipe(shapelessRecipes);
	    ShapelessOreRecipe shapelessOreRecipe = new ShapelessOreRecipe(new ItemStack(Items.baked_potato), new Object[] { "ingotIron", "stairWood" });
	    PageIRecipe page7 = new PageIRecipe(shapelessOreRecipe);
	    PageSound page8 = new PageSound(page6, "mob.pig.say");
	    PageFurnaceRecipe page9 = new PageFurnaceRecipe(new ItemStack(Items.potato));
	    PageFurnaceRecipe page10 = new PageFurnaceRecipe(new ItemStack(Items.diamond_axe));
	    
	    @SuppressWarnings({ "rawtypes", "unchecked" })
		ArrayList<IPage> pages = new ArrayList();
	    pages.add(page1);
	    pages.add(page2);
	    pages.addAll(PageHelper.pagesForLongText("HERE IS SOME TEXT FOR YOU TO DRAW LEWL. I AM VERY LONG FOR NOTHING MATE", new ItemStack(Items.diamond)));
	    pages.add(page3);
	    pages.add(page4);
	    pages.add(page5);
	    pages.add(page6);
	    pages.add(page7);
	    pages.add(page8);
	    pages.add(page9);
	    pages.add(page10);
	    
		EntryText entry1 = new EntryText(pages, "TestEntry1");
		EntryText entry2 = new EntryText(pages, "TestEntry2");
	    @SuppressWarnings({ "rawtypes", "unchecked" })
		ArrayList<EntryAbstract> entries = new ArrayList();
	    entries.add(entry1);
	    entries.add(entry2);
	    
	    CategoryResourceLocation category1 = new CategoryResourceLocation(entries, "Changes", new ResourceLocation("zokoindustries:textures/gui/book/Changes.png"));
	    CategoryItemStack category2 = new CategoryItemStack(entries, "Elements", new ItemStack(Blocks.brick_stairs));
	    CategoryItemStack category3 = new CategoryItemStack(entries, "Alloys", new ItemStack(Blocks.dragon_egg));
	    CategoryItemStack category4 = new CategoryItemStack(entries, "Materials", new ItemStack(MetaItems.ItemMaterials0,1,Materials.OreKey.size() * Materials.getType("gear")+Materials.getOreMaterial("Enderium")));
	    @SuppressWarnings({ "rawtypes", "unchecked" })
		ArrayList<CategoryAbstract> categories = new ArrayList();
	    categories.add(category1);
	    categories.add(category2);
	    categories.add(category3);
	    categories.add(category4);
	    
	    BookBuilder builder = new BookBuilder();
	    builder.setCategories(categories);
	    builder.setUnlocBookTitle(title);
	    builder.setUnlocWelcomeMessage(title);
	    builder.setUnlocDisplayName(title);
	    builder.setBookColor(new Color(58, 137, 158));
	    book = builder.build();
	    
	    GuideRegistry.registerBook(book);
  }
}
