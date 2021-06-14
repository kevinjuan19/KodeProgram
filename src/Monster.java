/**
 * @author Kevin Juan (1972002)
 */
public class Monster extends GameCharacter{
    private boolean flyingUnit = false;

    public Monster() {
    }
    public boolean isFlyingUnit(){
        return flyingUnit;
    }

    public void setFlyingUnit(boolean flyingUnit) {
        this.flyingUnit = flyingUnit;
    }
    @Override
    public void attackEnemy(GameCharacter gameCharacter){
        double  r = Math.random();
        int damage = (int) (r * getCurrentStrength())*3;
        gameCharacter.setCurrentHealth(gameCharacter.getCurrentHealth() - damage);
        System.out.println("Monster do "+ damage +" damage to hero");
    }
}
