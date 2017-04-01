package com.swarmcraftteam.ct.blocks;

import com.swarmcraftteam.ct.ModItems;
import com.swarmcraftteam.ct.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockDwarfStarOre extends Block
{

    public BlockDwarfStarOre()
    {
        super(Material.IRON);
        setUnlocalizedName(Reference.ModBlocks.DwarfStarOre.getUnlocalizedName());
        setRegistryName(Reference.ModBlocks.DwarfStarOre.getRegistryName());
        setHardness(20);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return ModItems.dwafStarDust;
    }

}
