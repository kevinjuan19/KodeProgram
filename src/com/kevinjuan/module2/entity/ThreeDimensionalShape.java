/**
 * @author Kevin Juan 1972002
 */
package com.kevinjuan.module2.entity;

public abstract class ThreeDimensionalShape extends Shape{
    public abstract double getVolume();
    public abstract double getSurfaceArea();
    @Override
    public String getDescription() {
        return "Surface Area : "+getSurfaceArea()+"\n"+"Volume : "+getVolume();
    }
}
