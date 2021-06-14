/**
 * @author Kevin Juan (1972002)
 */
import java.text.DecimalFormat;

public class Sphere extends ThreeDimensionalShape{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public double getVolume() {
        double rumus = (4 * Math.PI * Math.pow(getRadius(),3))/3;
        return rumus;
    }

    @Override
    public double getSurfaceArea() {
        double rumus = (4 * Math.PI * Math.pow(getRadius(),2));
        return rumus;
    }
    public String toString (){
        DecimalFormat df = new DecimalFormat("0.00");
        String hasil = "Volume of Sphere is: " + df.format(getVolume()) + "\r\n" + "Surface area of Sphere is: "+ df.format(getSurfaceArea());
        return hasil;
    }
}
