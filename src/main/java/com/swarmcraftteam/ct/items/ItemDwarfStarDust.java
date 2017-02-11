package com.swarmcraftteam.ct.items;

import com.swarmcraftteam.ct.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemDwarfStarDust extends Item {

	public ItemDwarfStarDust() {
		setUnlocalizedName(Reference.ModItems.DwarfStarDust.getUnlocalizedName());
		setRegistryName(Reference.ModItems.DwarfStarDust.getRegistryName());
		setCreativeTab(CreativeTabs.SEARCH);
	}

}
