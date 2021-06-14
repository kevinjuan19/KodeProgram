/**
 * @author Kevin Juan (1972002)
 */
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;


public class GameMap {
    private boolean endGame;
    private final GameCharacter hero;
    private GameCharacter monster;
    private Monster[] graveYard;

    public GameMap() {
        hero = new Hero();
        if(graveYard == null){
            graveYard = new Monster[0];
        }
    }
    public void runGame(){
        while(!endGame ){
            double x = Math.random();
            if  (x<0.3){
                System.out.println("Engaging battle. Prepare....");
                battle((Hero)hero,(Monster) monster);
            }
            else{
                System.out.println("Day passed, no monster to find");
            }
            if (graveYard.length == 10){
                endGame = true;
                System.out.println("You win the game!");
            }
        }

    }
    private void battle(Hero hero, Monster monster){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Attack enemy");
        System.out.println("2. Swap weapon");
        System.out.println("3. Show inventory");
        System.out.println("4. Show status");
        System.out.print("Choice : ");
        int pil = sc.nextInt();

        if (pil == 1){
            hero.attackEnemy(monster);
        }
        else if(pil == 2){
            hero.showAllInventory();
            System.out.print("Choose item name : ");
            String choose = sc.next();
            Item weapon = hero.getItemFromInventory(choose);
            if (weapon ==null){
                System.out.println("Wrong item name!");
            }
            else{
                hero.equip((Weapon) weapon);
                System.out.println("Weapon change to "+ weapon.getName());
            }
        }
        else if(pil == 3){
            hero.showAllInventory();
        }
        else if(pil == 4){
            System.out.println(hero.getStatus());
            System.out.println(monster.getStatus());
        }

        if (monster.getCurrentHealth()<=0){
            graveYard = Arrays.copyOf(graveYard,graveYard.length+1);
            graveYard[graveYard.length-1] = monster;
            generateMonster();
        }
        if (hero.getCurrentHealth()<=0){
            System.out.println("You win!");
            endGame = true;
        }
    }
    public void generateMonster(){
        monster=new Monster();
        Random random=new Random();
        int pil = random.nextInt(3);
        ((Monster) monster).setFlyingUnit(pil < 1);

        ((Monster)monster).setBaseStrength(3);
        ((Monster)monster).setMaxHealth(450);
        ((Monster)monster).setCurrentHealth(450);
        ((Monster)monster).setCurrentStrength(3);
    }

    public static void main(String[] args) {
        GameMap demo = new GameMap();
        demo.generateMonster();
        demo.runGame();
    }

}
