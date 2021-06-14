/**
 * @author Kevin Juan (1972002)
 */
public class Panda {
    private String name;
    private int strength, agility, energy;

    public Panda(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength += strength;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility += agility;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy += energy;
    }

    public void training(Crane crane){
        crane.sparring(Panda.this);
    }
    public void training(Grasshopper grasshopper){
        grasshopper.sparring(Panda.this);
    }
    public void training(Tiger tiger) {
        tiger.sparring(Panda.this);
    }
    public void training(Turtle turtle) {
        turtle.sparring(Panda.this);
    }
    public void training(Snake snake) {
        snake.sparring(Panda.this);
    }
    public void training(Monkey monkey) {
        monkey.sparring(Panda.this);
    }
    public void showMyStats(){
        System.out.println("Strength: "+ strength);
        System.out.println("Agility: "+ agility);
        System.out.println("Energy: "+ energy);
    }
}
