/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author hp
 */
public class Journals extends Book{
    private int issueNumber;
    public Journals(){
        
    }

    public Journals(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public Journals(int issueNumber, String BookID, String BookName, String AuthorName, String title) {
        super(BookID, BookName, AuthorName, title);
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }
    
}
