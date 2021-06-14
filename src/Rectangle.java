/**
 * @author Kevin Juan (1972002)
 */
import java.text.DecimalFormat;

public class Rectangle extends TwoDimensionalShape{
    private double base, height;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    @Override
    public double getArea() {
        double rumus = getBase() * getHeight();
        return rumus;
    }

    @Override
    public double getCircumference() {
        double rumus = 2*getBase() + 2*getHeight();
        return rumus;
    }
    public String toString (){
        DecimalFormat df = new DecimalFormat("0.00");
        String hasil = "Area of Rectangle is: " + df.format(getArea()) + "\r\n" + "Circumference of Rectangle is: "+ df.format(getCircumference());
        return hasil;
    }

}
