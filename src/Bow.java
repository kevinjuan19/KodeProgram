/**
 * @author Kevin Juan (1972002)
 */
public class Bow extends Item implements Weapon{
    private int numberOfArrow;
    @Override
    public void attack(GameCharacter attack, GameCharacter enemy) {
        int damage =  attack.getCurrentStrength()+(getDamage()*3);
        enemy.setCurrentHealth(enemy.getCurrentHealth() - damage);
        System.out.println("Hero do "+damage+" damage to monster");
        if (enemy.getCurrentHealth()>0) {
            enemy.attackEnemy(attack);
        }
    }

    @Override
    public int getDamage() {
        return 5;
    }

    public Bow() {
        setName("Bow");
    }

    public int getNumberOfArrow() {
        return numberOfArrow;
    }

    public void setNumberOfArrow(int numberOfArrow) {
        this.numberOfArrow = numberOfArrow;
    }
    public String toString(){
        return String.format("%-10s%-10s",getName(),getDamage());
    }
}
