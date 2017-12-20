package com.Zoko.Industries.Modules.Thaumcraft.Items.Caps;

import java.util.List;

import com.Zoko.Industries.ZokoIndustries;
import com.Zoko.Industries.ZokoTab;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class ItemWandCaps extends Item {
	
    public final String[] types = {
            "invar",
            "signallum",
            "lumium",
            "enderium",
            "platinum",
            "darksteel",
            "vibrant",
            "electrum",
            "electrum_fluxed"
    };
    public IIcon[] icon;

    public ItemWandCaps() {
        this.setMaxStackSize(64);
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
        this.setCreativeTab(ZokoTab.ZokoMagic);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IIconRegister ir) {
        icon = new IIcon[types.length];
        for(int x = 0; x < types.length; x++)
            this.icon[x] = ir.registerIcon(ZokoIndustries.MODID+":caps/wand_cap_" + types[x]);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public IIcon getIconFromDamage(int meta) {
        return this.icon[meta];
    }

    @SideOnly(Side.CLIENT)
    @SuppressWarnings({"unchecked","rawtypes"})
    @Override
    public void getSubItems(Item item, CreativeTabs xCreativeTabs, List list) {
        for(int x = 0; x < types.length; x++){
            list.add(new ItemStack(this, 1, x));
        }
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return super.getUnlocalizedName() + "." + types[stack.getItemDamage()];
    }
}