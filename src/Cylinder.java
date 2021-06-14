/**
 * @author Kevin Juan (1972002)
 */
import java.text.DecimalFormat;

public class Cylinder extends ThreeDimensionalShape{
    private double radius, height;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeigth() {
        return height;
    }

    public void setHeigth(double height) {
        this.height = height;
    }


    @Override
    public double getVolume() {
        double rumus = Math.PI * Math.pow(getRadius(),2) * getHeigth();
        return rumus;
    }

    @Override
    public double getSurfaceArea() {
        double rumus = 2 * Math.PI * Math.pow(getRadius(),2) + 2 * Math.PI * getRadius() * getHeigth();
        return rumus;
    }

    public String toString (){
        DecimalFormat df = new DecimalFormat("0.00");
        String hasil = "Volume of Cylinder is: " + df.format(getVolume()) + "\r\n" + "Surface area of Cylinder is: "+ df.format(getSurfaceArea());
        return hasil;
    }
}
