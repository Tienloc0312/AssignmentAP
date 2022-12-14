/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author hp
 */
public class TextBook extends Book{
    private String publisher;
    public TextBook(){      
    }
    public TextBook(String publisher) {
        this.publisher = publisher;
    }
    public TextBook(String publisher, String BookID, String BookName, String AuthorName, String title) {
        super(BookID, BookName, AuthorName, title);
        this.publisher = publisher;
    }
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setBookID(String bookID) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    
}
