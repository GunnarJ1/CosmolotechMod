package com.swarmcraftteam.ct.proxies;

import com.swarmcraftteam.ct.ModBlocks;
import com.swarmcraftteam.ct.ModItems;

public class ClientProxy implements CommonProxy {

	@Override
	public void preInit() {
		
	}
	
	public void init() {
		ModItems.registerRenders();
		ModBlocks.registerRenders();
	}

}
