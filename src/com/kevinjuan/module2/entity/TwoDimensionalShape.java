/**
 * @author Kevin Juan 1972002
 */
package com.kevinjuan.module2.entity;

public abstract class TwoDimensionalShape extends Shape{
    public abstract double getArea();
    public abstract double getCircumference();

    @Override
    public String getDescription() {
        return "Area : "+getArea()+ "\n"+"Circumference : "+getCircumference();
    }
}
