/**
 * @author Kevin Juan (1972002)
 */
import java.util.Random;
import java.util.Scanner;

public class PandaStory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        Panda panda = new Panda("Po");
        System.out.print("Input days for " + panda.getName() + " to train: ");
        int day = sc.nextInt();
        Tiger Tigress = new Tiger("Tigress");
        Grasshopper Mantis = new Grasshopper("Mantis");
        Snake Viper = new Snake("Viper");
        Monkey Monkey = new Monkey("Monkey");
        Crane Crane = new Crane("Crane");
        Turtle Turtle = new Turtle("Turtle");
        for (int i = 0 ; i < day; i++){
            System.out.println("Day "+(i+1));
            System.out.println("1. Training with Tigress");
            System.out.println("2. Training with Mantis");
            System.out.println("3. Training with Viper");
            System.out.println("4. Training with Monkey");
            System.out.println("5. Training with Crane");
            System.out.print("Choose wisely: ");
            int pil = sc.nextInt();
            if (pil==1){
                panda.training(Tigress);
            }
            else if (pil==2){
                panda.training(Mantis);
            }
            else if (pil==3){
                panda.training(Viper);
            }
            else if (pil==4){
                panda.training(Monkey);
            }
            else if (pil==5){
                panda.training(Crane);
            }
            if (random.nextInt(10) == 1){
                panda.training(Turtle);
            }
        }
        panda.showMyStats();




    }
}
