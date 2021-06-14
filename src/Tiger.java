/**
 * @author Kevin Juan (1972002)
 */
public class Tiger {
    private String name;

    public Tiger (String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sparring (Panda panda){
        System.out.println("So you are ready to feel pain.");
        panda.setAgility(9);
        panda.setStrength(5);
    }


}
