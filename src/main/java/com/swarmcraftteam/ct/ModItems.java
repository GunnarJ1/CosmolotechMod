package com.swarmcraftteam.ct;

import com.swarmcraftteam.ct.items.ItemDwarfStarDust;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static ItemDwarfStarDust dwafStarDust;
	
	public static void init() {
		dwafStarDust = new ItemDwarfStarDust();
	}
	
	public static void register() {
		GameRegistry.register(dwafStarDust);
		
	}
	
	public static void registerRecipes() {
	}
	
	public static void registerRenders() {
		registerRender(dwafStarDust);
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	
}
