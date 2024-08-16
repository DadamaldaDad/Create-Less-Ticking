package net.dadamalda.create.less_ticking.forge;

import net.dadamalda.create.less_ticking.CLTMod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CLTMod.MOD_ID)
public class CLTModForge {
    public CLTModForge() {
        // registrate must be given the mod event bus on forge before registration
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        CLTMod.init();
    }
}
