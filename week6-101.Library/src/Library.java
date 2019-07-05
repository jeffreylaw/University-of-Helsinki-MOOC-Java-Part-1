/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author Jeffrey
 */
public class Library {
    private ArrayList<Book> library;
    
    public Library() {
        this.library = new ArrayList<Book>();
    }
    public void addBook(Book newBook) {
        this.library.add(newBook);
    }
    
    public void printBooks() {
        for (Book book : library) {
            System.out.println(book);
        }
    }
    /*
    Returns a list of books that match title
    */
    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> list = new ArrayList<Book>();
        for (Book book : library) {
            if (StringUtils.included(book.title(), title)) {
                list.add(book);
            }
        }
        return list;
    }
    
    /*
    Returns a list of books that match publisher
    */
    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book book : library) {
            if (StringUtils.included(book.publisher(), publisher)) {
                found.add(book);
            }
        }
        return found;
    }
    
    /*
    Return a list of books that match year
    */
    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book book : library) {
            if (book.year() == year) {
                found.add(book);
            }
        }
        return found;
    }
    
}
