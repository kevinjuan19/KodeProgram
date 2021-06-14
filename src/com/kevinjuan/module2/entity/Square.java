/**
 * @author Kevin Juan 1972002
 */
package com.kevinjuan.module2.entity;

public class Square extends TwoDimensionalShape{
    private double height, width;

    public Square() {
    }

    public Square(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        double rumus = getHeight() * getWidth();
        return rumus;
    }

    @Override
    public double getCircumference() {
        double rumus = 2*(getWidth()+getHeight());
        return rumus;
    }
}
