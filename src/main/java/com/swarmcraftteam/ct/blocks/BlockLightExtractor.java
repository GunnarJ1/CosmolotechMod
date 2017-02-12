package com.swarmcraftteam.ct.blocks;

import com.swarmcraftteam.ct.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockLightExtractor extends Block {

	public BlockLightExtractor() {
		super(Material.IRON);
		setRegistryName(Reference.ModBlocks.LightExtractor.getRegistryName());
		setUnlocalizedName(Reference.ModBlocks.LightExtractor.getUnlocalizedName());
		setHardness(5);
	}

}
