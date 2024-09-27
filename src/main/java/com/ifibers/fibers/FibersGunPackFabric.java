package com.ifibers.fibers;

import com.tacz.guns.api.resource.ResourceManager;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class FibersGunPackFabric implements ModInitializer {
	public static final String MOD_ID = "fibers";
	public static final Logger LOGGER = LoggerFactory.getLogger("fibers");
	public static final String DEFAULT_GUN_PACK_NAME = "fibers_gunpack";

	public FibersGunPackFabric() {
	}

	public void onInitialize() {
		registerDefaultExtraGunPack();
	}

	private static void registerDefaultExtraGunPack() {
		String jarDefaultPackPath = String.format("/assets/%s/custom/%s", "fibers", "fibers_gun_pack");
		ResourceManager.registerExtraGunPack(FibersGunPackFabric.class, jarDefaultPackPath);
	}
}
