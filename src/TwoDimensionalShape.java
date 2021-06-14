/**
 * @author Kevin Juan (1972002)
 */
public abstract class TwoDimensionalShape {
    public abstract double getArea();
    public abstract double getCircumference();
    public void showDetail(){
        System.out.println(toString());
    }
}
