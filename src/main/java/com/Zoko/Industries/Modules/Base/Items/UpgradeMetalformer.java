package com.Zoko.Industries.Modules.Base.Items;

import java.util.List;
import java.util.Set;

import com.Zoko.Industries.ZokoIndustries;

import ic2.core.upgrade.IUpgradableBlock;
import ic2.core.upgrade.IUpgradeItem;
import ic2.core.upgrade.UpgradableProperty;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class UpgradeMetalformer extends Item implements IUpgradeItem {
	
	public UpgradeMetalformer(String unlocalizedname) {
           this.setUnlocalizedName(unlocalizedname);
           this.setTextureName(ZokoIndustries.MODID + ":Upgrade_1");
           this.setMaxStackSize(4);
	}

	@Override
	public int getAugmentation(ItemStack arg0, IUpgradableBlock arg1) {
		return 0;
	}

	@Override
	public double getEnergyDemandMultiplier(ItemStack arg0, IUpgradableBlock arg1) {
		return 1.5F;
	}

	@Override
	public double getEnergyStorageMultiplier(ItemStack arg0, IUpgradableBlock arg1) {
		return 1;
	}

	@Override
	public int getExtraEnergyDemand(ItemStack arg0, IUpgradableBlock arg1) {
		return 0;
	}

	@Override
	public int getExtraEnergyStorage(ItemStack arg0, IUpgradableBlock arg1) {
		return 0;
	}

	@Override
	public int getExtraProcessTime(ItemStack arg0, IUpgradableBlock arg1) {
		return 0;
	}

	@Override
	public int getExtraTier(ItemStack arg0, IUpgradableBlock arg1) {
		return 0;
	}

	@Override
	public double getProcessTimeMultiplier(ItemStack arg0, IUpgradableBlock arg1) {
		return 1.2F;
	}

	@Override
	public int getRedstoneInput(ItemStack arg0, IUpgradableBlock arg1, int arg2) {
		return 0;
	}

	@Override
	public boolean isSuitableFor(ItemStack arg0, Set<UpgradableProperty> arg1) {
		return true;
	}

	@Override
	public boolean modifiesRedstoneInput(ItemStack arg0, IUpgradableBlock arg1) {
		return false;
	}

	@Override
	public void onProcessEnd(ItemStack arg0, IUpgradableBlock arg1, List<ItemStack> arg2) {
	}

	@Override
	public boolean onTick(ItemStack arg0, IUpgradableBlock arg1) {
		return false;
	}
	

}
