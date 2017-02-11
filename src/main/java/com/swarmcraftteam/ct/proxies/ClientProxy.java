package com.swarmcraftteam.ct.proxies;

import com.swarmcraftteam.ct.ModItems;

public class ClientProxy implements CommonProxy {

	public void init() {
		ModItems.registerRenders();
	}

}
