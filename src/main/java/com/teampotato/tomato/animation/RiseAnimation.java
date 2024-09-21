package com.teampotato.tomato.animation;

import com.mojang.blaze3d.vertex.PoseStack;

public final class RiseAnimation implements Animation {
    private float offset;

    public float getOffset() {
        return offset;
    }
    public void setOffset(float offset) {
        this.offset = offset;
    }

    @Override
    public void animate(float progress, PoseStack matrices, int chunkX, int chunkY, int chunkZ, float playerX, float playerY, float playerZ) {
        animate(progress, matrices);
    }
    public void animate(float progress, PoseStack matrices) {
        matrices.translate(0, offset * (progress - 1), 0);
    }

    public RiseAnimation(float offset) {
        this.offset = offset;
    }
    public RiseAnimation() {
        offset = 50;
    }
}
