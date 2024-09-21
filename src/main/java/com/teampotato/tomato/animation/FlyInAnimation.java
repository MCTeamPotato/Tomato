package com.teampotato.tomato.animation;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.world.phys.Vec2;

public class FlyInAnimation implements Animation {
    private float offset;

    public float getOffset() {
        return offset;
    }
    public void setOffset(float offset) {
        this.offset = offset;
    }


    @Override
    public void animate(float progress, PoseStack matrices, int chunkX, int chunkY, int chunkZ, float playerX, float playerY, float playerZ) {
        Vec2 direction = new Vec2(playerX, playerZ).add(new Vec2(-chunkX, -chunkZ)).normalized().scale(-offset);

        matrices.translate(direction.x * (1 - progress), 0, direction.y * (1 - progress));
    }

    public FlyInAnimation() {
        offset = 50;
    }
}
