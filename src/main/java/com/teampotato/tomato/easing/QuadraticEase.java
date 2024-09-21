package com.teampotato.tomato.easing;

public class QuadraticEase implements Ease {
    @Override
    public float ease(float x) {
        return x * x;
    }
}
