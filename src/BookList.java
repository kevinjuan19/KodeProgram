/**
 * @author Kevin Juan (1972002)
 */

import java.util.Arrays;

public class BookList {
    private Book[] buku;

    public BookList(){

    }

    public void addBookList(Book book){
        if (buku == null){
            buku = new Book[0];
        }
        buku = Arrays.copyOf(buku,buku.length+1);
        buku[buku.length-1] = new Book(book.getIsbn(),book.getTitle(),book.getAuthor());
    }

    public Book[] searchBook(String isbn){
        Book [] coba = new Book[0];
        if (buku==null){
            return null;
        }
        for (int i=0;i<=buku.length;i++) {
            if (isbn.equals(buku[i].getIsbn())){
                coba[0]=buku[i];
            }
        }
        return coba;
    }

    public void showAllBooks(){
        if (buku != null){
            System.out.println("|ISBN |Title |Author");
            for(int i = 0; i< buku.length;i++){
                System.out.print("|"+buku[i].getIsbn()+"\t");
                System.out.print("|"+buku[i].getTitle()+ "\t");
                System.out.print("|"+buku[i].getAuthor()+"\t");
                System.out.println();
            }

        }
        else{
            System.out.println("No Books to Show");
        }

    }
}