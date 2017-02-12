package com.swarmcraftteam.ct;

import com.swarmcraftteam.ct.blocks.BlockDwarfStarOre;
import com.swarmcraftteam.ct.blocks.BlockLightExtractor;
import com.swarmcraftteam.ct.items.ItemDwarfStarDust;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

	public static Block dwarfStarOre;
	public static Block lightExtractor;
	
	public static void init() {
		dwarfStarOre = new BlockDwarfStarOre();
		lightExtractor = new BlockLightExtractor();
	}
	
	public static void register() {
		registerBlock(dwarfStarOre);
		registerBlock(lightExtractor);
	}
	
	private static void registerBlock(Block block) {
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}
	
	public static void registerRecipes() {
	}
	
	public static void registerRenders() {
		registerRender(dwarfStarOre);
		registerRender(lightExtractor);
	}
	
	private static void registerRender(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
	
	
}
