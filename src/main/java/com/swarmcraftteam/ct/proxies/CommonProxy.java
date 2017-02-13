package com.swarmcraftteam.ct.proxies;

import com.swarmcraftteam.ct.Reference;
import com.swarmcraftteam.ct.tileentities.TileEntityLightExtractor;

import net.minecraftforge.fml.common.registry.GameRegistry;

public abstract class CommonProxy {

	public void init() {
		
	}
	
	public void preInit() {
		GameRegistry.registerTileEntity(TileEntityLightExtractor.class, Reference.MOD_ID + ":lightExtractor");

	}
}
