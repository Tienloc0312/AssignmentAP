/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author hp
 */
public class Book {
    String BookID;
    String BookName, AuthorName, title;
    public Book(){      
    }
    public Book(String BookID, String BookName, String AuthorName, String title) {
        this.BookID = BookID;
        this.BookName = BookName;
        this.AuthorName = AuthorName;
        this.title = title;
    }
    public String getBookID() {
        return BookID;
    }
    public void setBookID(String BookID) {
        this.BookID = BookID;
    }
    public String getBookName() {
        return BookName;
    }
    public void setBookName(String BookName) {
        this.BookName = BookName;
    }
    public String getAuthor() {
        return AuthorName;
    }
    public void setAuthor(String Author) {
        this.AuthorName = Author;
    }
    public String getTitle() {
        return title;
    }

    public void settitle(String title) {
        this.title = title;
    }
    
   
}
