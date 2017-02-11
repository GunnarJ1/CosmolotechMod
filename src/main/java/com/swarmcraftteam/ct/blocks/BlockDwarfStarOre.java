package com.swarmcraftteam.ct.blocks;

import com.swarmcraftteam.ct.Reference;
import com.swarmcraftteam.ct.Reference.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockDwarfStarOre extends Block {
	
	public BlockDwarfStarOre() {
		super(Material.IRON);
		setUnlocalizedName(Reference.ModBlocks.DwarfStarOre.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.DwarfStarOre.getRegistryName());
		
	}
	
}
