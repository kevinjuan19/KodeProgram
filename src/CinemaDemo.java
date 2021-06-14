/**
 * @author Kevin Juan (1972002)
 */

import java.util.Scanner;

public class CinemaDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Film film = new Film();
        Cinema cinema = new Cinema();
        Admin admin = new Admin(cinema);
        int pil;
        do{
            System.out.println("============================");
            System.out.println("1. Add new film");
            System.out.println("2. Show all film");
            System.out.println("3. Show longest film");
            System.out.println("4. Show shortest film");
            System.out.println("5. Exit");
            System.out.print("Choice: ");
            pil = sc.nextInt();
            if (pil == 1){
                admin.addFilm(film);
            }
            else if (pil == 2){
                admin.viewAllFilm();
            }
            else if (pil == 3){
                admin.viewLongestFilm();
            }
            else if (pil == 4){
                admin.viewShortestFilm();
            }
            else {
                System.out.println("Wrong menu!");
            }

        }while(pil != 5);

    }
}
