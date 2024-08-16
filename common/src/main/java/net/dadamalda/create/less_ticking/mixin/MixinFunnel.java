package net.dadamalda.create.less_ticking.mixin;

import com.simibubi.create.content.logistics.funnel.FunnelBlockEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value = FunnelBlockEntity.class, remap = false)
public interface MixinFunnel {
    @Accessor("extractionCooldown")
    void setExtractionCooldown(int value);

    @Accessor("extractionCooldown")
    int getExtractionCooldown();
}

