/**
 * @author Kevin Juan (1972002)
 */
public class Sword extends Item implements Weapon{
    @Override
    public void attack(GameCharacter attack, GameCharacter enemy) {
        if (((Monster)enemy).isFlyingUnit()){
            System.out.println("Enemy is out of range");
            enemy.attackEnemy(attack);
        }else{
            int damage =  attack.getCurrentStrength()*2 + (getDamage()*2);
            enemy.setCurrentHealth(enemy.getCurrentHealth() - damage);
            System.out.println("Hero do "+damage+" damage to monster");
            if (enemy.getCurrentHealth()>0){
                enemy.attackEnemy(attack);
            }
        }
    }

    @Override
    public int getDamage() {
        return 9;
    }

    public Sword() {
        setName("Sword");
    }

    public String toString(){
        return String.format("%-10s%-10s",getName(),getDamage());
    }
}
