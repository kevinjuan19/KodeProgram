/**
 * @author Kevin Juan (1972002)
 */
public interface Weapon {
    void attack(GameCharacter attack, GameCharacter enemy);
    int getDamage();
}
