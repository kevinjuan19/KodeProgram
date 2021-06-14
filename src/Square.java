/**
 * @author Kevin Juan (1972002)
 */
import java.text.DecimalFormat;

public class Square extends TwoDimensionalShape{
    private double lengthOfSide;

    public double getLengthOfSide() {
        return lengthOfSide;
    }

    public void setLengthOfSide(double lengthOfSide) {
        this.lengthOfSide = lengthOfSide;
    }


    @Override
    public double getArea() {
        double rumus = getLengthOfSide() * getLengthOfSide();
        return rumus;
    }

    @Override
    public double getCircumference() {
        double rumus = 4 * getLengthOfSide();
        return rumus;
    }
    public String toString (){
        DecimalFormat df = new DecimalFormat("0.00");
        String hasil = "Area of Square is: " + df.format(getArea()) + "\r\n" + "Circumference of Square is: "+ df.format(getCircumference());
        return hasil;
    }
}
