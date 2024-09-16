package com.teampotato.tomato.mixin;

import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerChunkCache;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftServer.class)
public class MinecraftServerMixin {
    @ModifyConstant(method = "prepareLevels", constant = @Constant(intValue = 441))
    private int modifyNumChunksToWaitFor(int value) {
        return 0;
    }
}
