/**
 * @author Kevin Juan 1972002
 */
package com.kevinjuan.module2.entity;

public class Ball extends ThreeDimensionalShape{
    private double radius;

    public Ball() {
    }

    public Ball(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        double rumus =(4 * Math.PI * Math.pow(getRadius(),3))/3;
        return rumus;
    }

    @Override
    public double getSurfaceArea() {
        double rumus = (4 * Math.PI * Math.pow(getRadius(),2));
        return rumus;
    }
}

