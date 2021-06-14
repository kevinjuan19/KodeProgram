/**
 * @author Kevin Juan (1972002)
 */
public class Monkey {
    private String name;

    public Monkey(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sparring (Panda panda){
        System.out.println("So "+ panda.getName() + ". Let's get started");
        panda.setAgility(9);
        panda.setStrength(5);
    }
}
