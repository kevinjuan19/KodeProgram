/**
 * @author Kevin Juan (1972002)
 */

import java.util.Scanner;

public class BookDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookList bList = new BookList();
        String isbn, title, author, cari;
        int pil;
        do{
            System.out.println("============================");
            System.out.println("     Library Aplication     ");
            System.out.println("============================");
            System.out.println("1. Show all book");
            System.out.println("2. Add new book");
            System.out.println("3. Search book");
            System.out.println("4. Exit");
            System.out.println("============================");
            System.out.print("choice: ");
            pil = sc.nextInt();
            if (pil == 1){
                bList.showAllBooks();
            }
            else if (pil == 2){
                System.out.print("New ISBN\t: ");
                isbn=sc.next();
                sc.nextLine();
                System.out.print("New Judul Buku\t: ");
                title=sc.nextLine();
                System.out.print("New Penulis\t: ");
                author=sc.nextLine();
                Book book = new Book(isbn, title, author);
                bList.addBookList(book);
            }
            else if (pil == 3){
                Book [] temu = new Book [1] ;
                System.out.print("search (ISBN) : ");
                cari = sc.next();
                temu = bList.searchBook(cari);
                if (temu==null) {
                    System.out.println("Book not found");
                }
                else {
                    if(temu[0]==null){
                        System.out.println("Book not found");
                    }
                    else {
                        System.out.println("Book found");
                        System.out.print("ISBN\t: ");
                        System.out.println(temu[0].getIsbn());
                        System.out.print("TITLE\t: ");
                        System.out.println(temu[0].getTitle());
                        System.out.print("AUTHOR\t: ");
                        System.out.println(temu[0].getAuthor());
                    }
                }
            }
        }
        while (pil != 4);

    }
}
