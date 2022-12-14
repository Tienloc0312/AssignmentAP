/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author hp
 */
public class Person {
    String PerID;
    String PerName, DateOfBirth, Email;
    public Person(){
        
    }

    public Person(String PerID, String PerName, String DateOfBirth, String Email) {
        this.PerID = PerID;
        this.PerName = PerName;
        this.DateOfBirth = DateOfBirth;
        this.Email = Email;
    }

    public String getPerID() {
        return PerID;
    }

    public void setPerID(String PerID) {
        this.PerID = PerID;
    }

    public String getPerName() {
        return PerName;
    }

    public void setPerName(String PerName) {
        this.PerName = PerName;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }


}
