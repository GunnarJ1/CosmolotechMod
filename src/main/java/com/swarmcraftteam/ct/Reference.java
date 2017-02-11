package com.swarmcraftteam.ct;

public class Reference {

	public static final String MOD_ID = "ct";
	public static final String NAME = "CosmoloTech";
	public static final String VERSION = "1.0.0";

	public static final String CLIENT_PROXY_CLASS = "com.swarmcraftteam.ct.proxies.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.swarmcraftteam.ct.proxies.ServerProxy";

	//List of items
	public enum ModItems {
		DwarfStarDust("dwarfStarDust", "DwarfStarDust");
		private String unlocalizedName;
		private String registryName;

		ModItems(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;

		}

		public String getUnlocalizedName() {
			return unlocalizedName;
		}

		public String getRegistryName() {
			return registryName;
		}

	}
	
	public enum ModBlocks {
		DwarfStarOre("dwarfStarOre", "BlockDwarfStarOre");
		private String unlocalizedName;
		private String registryName;
		ModBlocks(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;

		}

		public String getUnlocalizedName() {
			return unlocalizedName;
		}

		public String getRegistryName() {
			return registryName;
		}
	}
	
}
