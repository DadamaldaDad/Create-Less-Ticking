package net.dadamalda.create.less_ticking.mixin;

import com.simibubi.create.content.logistics.funnel.FunnelBlockEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = FunnelBlockEntity.class, remap = false)
public abstract class MixinFunnelImpl {
    @Unique
    private int tickSlowdown = 3;
    
    @Unique
    private int tickCounter = 0;

    @Inject(
            method = "tick",
            at = @At(value = "HEAD"),
            cancellable = true
    )
    public void tick(CallbackInfo ci) {
        tickCounter++;
        if (tickCounter % tickSlowdown != 0) {
            ((MixinFunnel) this).setExtractionCooldown(((MixinFunnel) this).getExtractionCooldown()-1);
            ci.cancel();
        }
    }
}
