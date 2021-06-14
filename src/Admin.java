/**
 * @author Kevin Juan(1972002)
 */

import java.util.Scanner;

public class Admin {
    private Cinema cinema;
    public Admin(Cinema cinema) {
        this.cinema=cinema;
    }
    public void addFilm(Film film){
        Film[] add=cinema.getFilms();
        Scanner sc=new Scanner(System.in);
        if (cinema.getNumberOfStudio()>0) {
            System.out.print("Title\t: ");
            String title = sc.nextLine();
            System.out.print("Duration\t: ");
            int duration=sc.nextInt();
            add[10 - cinema.getNumberOfStudio()] = new Film(title,duration);
            cinema.setNumberofStudio();
        }
    }
    public void viewAllFilm(){
        Film[] view=cinema.getFilms();
        if (view[0]==null){
            System.out.println("No Film");
        }
        else {
            System.out.println("Title\t Duration");
            for (int i = 0; i < 10; i++) {
                if (view[i] != null) {
                    System.out.println(view[i].getTitle() +"\t"+ String.valueOf(view[i].getDuration()));
                }
            }
        }
    }

    public void viewLongestFilm(){
        Film [] longest =cinema.getLongestFilm();
        if (longest ==null){
            System.out.println("No Film");
        }
        else {
            System.out.println("Longest film");
            System.out.print("Title\t: ");
            System.out.println(longest[0].getTitle());
            System.out.print("Duration\t: ");
            System.out.println(longest[0].getDuration());
        }

    }
    public void viewShortestFilm(){
        Film [] shortest =cinema.getShortestFilm();
        if (shortest==null){
            System.out.println("No Film");
        }
        else {
            System.out.println("Shortest film");
            System.out.print("Title\t: ");
            System.out.println(shortest[0].getTitle());
            System.out.print("Duration\t: ");
            System.out.println(shortest[0].getDuration());
        }
    }
}

