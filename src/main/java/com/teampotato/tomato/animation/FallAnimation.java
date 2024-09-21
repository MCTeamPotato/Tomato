package com.teampotato.tomato.animation;


import com.mojang.blaze3d.vertex.PoseStack;

public class FallAnimation implements Animation {
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
        matrices.translate(0, offset * (1 - progress), 0);
    }

    public FallAnimation(float offset) {
        this.offset = offset;
    }
    public FallAnimation() {
        offset = 50;
    }
}
