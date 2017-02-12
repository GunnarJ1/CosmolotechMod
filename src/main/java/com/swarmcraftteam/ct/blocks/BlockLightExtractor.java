package com.swarmcraftteam.ct.blocks;

import com.swarmcraftteam.ct.Reference;
import com.swarmcraftteam.ct.tileentities.TileEntityLightExtractor;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockLightExtractor extends Block implements ITileEntityProvider {

	public BlockLightExtractor() {
		super(Material.IRON);
		setRegistryName(Reference.ModBlocks.LightExtractor.getRegistryName());
		setUnlocalizedName(Reference.ModBlocks.LightExtractor.getUnlocalizedName());
		setHardness(5);
	}

	@Override
	public TileEntity createTileEntity(World world, IBlockState state) {
		return new TileEntityLightExtractor();
	}
	
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileEntityLightExtractor();
	}
	
	
	
}
