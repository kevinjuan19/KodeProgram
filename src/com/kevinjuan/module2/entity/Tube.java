/**
 * @author Kevin Juan 1972002
 */
package com.kevinjuan.module2.entity;

public class Tube extends ThreeDimensionalShape{
    private double radius,heigth;

    public Tube() {
    }

    public Tube(double radius, double heigth) {
        this.radius = radius;
        this.heigth = heigth;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    @Override
    public double getVolume() {
        double rumus = Math.PI * Math.pow(getRadius(),2) * getHeigth();
        return rumus;
    }

    @Override
    public double getSurfaceArea() {
        double rumus = 2*Math.PI*getRadius()*(getRadius()+getHeigth());
        return rumus;
    }
}
