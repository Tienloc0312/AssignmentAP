/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author hp
 */
public class Borrow {
    public String BorrowID;
    private Person per;
    private Book book;
    
    public Borrow(){
    }

    public Borrow(String BorrowID, Person per, Book book) {
        this.BorrowID = BorrowID;
        this.per = per;
        this.book = book;
    }

    public String getBorrowID() {
        return BorrowID;
    }

    public void setBorrowID(String BorrowID) {
        this.BorrowID = BorrowID;
    }

    public Person getPer() {
        return per;
    }

    public void setPer(Person per) {
        this.per = per;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
    
}
