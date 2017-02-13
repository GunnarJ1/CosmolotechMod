package com.swarmcraftteam.ct.proxies;

import com.swarmcraftteam.ct.ModBlocks;
import com.swarmcraftteam.ct.ModItems;

public class ClientProxy extends CommonProxy {

	public void init() {
		ModItems.registerRenders();
		ModBlocks.registerRenders();
	}

}
