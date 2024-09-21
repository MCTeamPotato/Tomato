package com.teampotato.tomato.mixin;

import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(MinecraftServer.class)
public class MinecraftServerMixin {
    @ModifyConstant(method = "prepareLevels", constant = @Constant(intValue = 441))
    private int modifyNumChunksToWaitFor(int value) {
        return 0;
    }
}
