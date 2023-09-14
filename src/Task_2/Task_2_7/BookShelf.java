package Task_2.Task_2_7;

import java.util.ArrayList;
import java.util.Date;

public class BookShelf {
    private ArrayList<Book>books = new ArrayList<>();
    private int numberOfBooks = 0;


    public BookShelf(){

    }
    public void addBook(String author, String name, int dateOfCreation){
        Book book = new Book(author,name,dateOfCreation);
        this.books.add(book);
        numberOfBooks++;
    }
    public Book getBook(int number){
        return books.get(number);
    }
    public Book theOldest(){
        Book theOldest = books.get(0);
        for(Book book:books){
            if(theOldest.getDateOfCreation() > book.getDateOfCreation()){
                theOldest = book;

            }
        }
        return theOldest;
    }
    public Book theNewest() {
        Book theNewest = books.get(0);
        for (Book book : books) {
            if (theNewest.getDateOfCreation() < book.getDateOfCreation()) {
                theNewest = book;
            }
        }
        return theNewest;
    }
    public void sortInOrder(){
        for(int i = 0; i <this.numberOfBooks;i++){
            for(int j = i+1;j < this.numberOfBooks;j++){
                if(this.books.get(j).getDateOfCreation() < this.books.get(i).getDateOfCreation()){
                    Book w = this.books.get(j);
                    this.books.set(j,this.books.get(i));
                    this.books.set(i,w);


                }
            }
        }
    }
}
