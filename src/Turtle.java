/**
 * @author Kevin Juan (1972002)
 */
public class Turtle {
    private String name;

    public Turtle (String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sparring (Panda panda){
        System.out.println("Come " + panda.getName() + ". I will show you the dragon scroll");
        panda.setAgility(8);
        panda.setStrength(8);
        panda.setEnergy(8);
    }
}
