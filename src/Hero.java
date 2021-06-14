/**
 * @author Kevin Juan (1972002)
 */
import java.util.Arrays;
import java.util.List;

public class Hero extends GameCharacter{
    private String name;
    private Weapon mainWeapon;
    private Item [] inventory;


    public Hero() {
        inventory = new Item[2];
        inventory[0] = new Sword();
        inventory[1] = new Bow();
        mainWeapon = (Weapon) inventory[0];
        setMaxHealth(200);
        setBaseStrength(20);
        setCurrentHealth(200);
        setCurrentStrength(20);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void equip(Weapon weapon){
        mainWeapon = weapon;
        setCurrentStrength(getBaseStrength() + mainWeapon.getDamage());
    }
    public void showAllInventory(){
        List<Item> Inverntory = Arrays.asList(inventory);
        Inverntory.forEach(Item ->{
            if (Item instanceof Weapon){
                System.out.println(((Weapon)Item).toString());
            }
        });
    }
    public Item getItemFromInventory(String itemName){
        Item temp=null;
        for (int i=0;i<2;i++){
            if (inventory[i].getName().equals(itemName)){
                temp=inventory[i];
            }
        }
        return temp;
    }

    @Override
    public void attackEnemy(GameCharacter enemy){
        mainWeapon.attack(Hero.this,enemy);
    }
}
