package net.dadamalda.create.less_ticking.fabric;

import net.fabricmc.loader.api.FabricLoader;

public class CLTExpectPlatformImpl {
	public static String platformName() {
		return FabricLoader.getInstance().isModLoaded("quilt_loader") ? "Quilt" : "Fabric";
	}
}
