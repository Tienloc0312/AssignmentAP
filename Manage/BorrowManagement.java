/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manage;
import Interface.ActionBorrow;
import Model.Book;
import Model.Borrow;
import Model.Person;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author hp
 */
public class BorrowManagement implements ActionBorrow<Borrow, Person, Book>{
    @Override
    public Borrow add(ArrayList<Borrow> list, ArrayList<Person> list2, ArrayList<Book> list3) {
        Borrow bor = new Borrow();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Borrow ID: ");
        String BorrowID = sc.nextLine();
        while(checkID(list, BorrowID)){
            System.out.println("Borrow ID is valid . Please Enter another Borrow ID: ");
            BorrowID = sc.nextLine();
        }
        while(BorrowID.contains(" ") || BorrowID.equals(" ")){
            System.out.println("Not Space ! Again ");
            BorrowID = sc.nextLine();
        }
        bor.setBorrowID(BorrowID);
        int countper =0;
        for(int i=0;i<list2.size();i++){
            if(list2.get(i).getPerID().equals("PerID")){
                bor.setPer(list2.get(i));
            }else{
                countper++;
            }
        }
        if(countper==list2.size()){
           System.out.println("Not Found ! ");
        }
        System.out.println("Enter Book ID : ");
        String BookID = sc.nextLine();
        int countbook=0;
        for(int i=0;i<list3.size();i++){
            if(list3.get(i).getBookID().equals(BookID)){
                bor.setBook(list3.get(i));
            }else{
                countbook++;
            }
        }
         if(countper==list3.size()){
          System.out.println("Not Found ! ");
        }
        return bor;
    
    }

    @Override
    public boolean edit(ArrayList<Borrow> list, ArrayList<Person> list2, ArrayList<Book> list3) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter Borrow ID:");
        String BorrowID = sc.nextLine();
        System.out.println("");
        int count=0;
        System.out.println("");
        System.out.println(" ________________________________________");
        System.out.println("|             Choose Functions           |");
        System.out.println("|________________________________________|");
        System.out.println("|              [1]. Edit Person          |");
        System.out.println("|              [2]. Edit Book            |");
        System.out.println("|              [3]. Exit                 |");
        System.out.println("|________________________________________|");
        int choice=0;
        for(int i=0;i<list.size();i++){
           sc = new Scanner(System.in);
           if(list.get(i).getBorrowID().equals(BorrowID)){
                switch(choice){
                    case 1:
                       System.out.println("Enter Person ID:  ");
                       String PerID = sc.nextLine();
                       int countper=0;
                       for(int j=0;j<list2.size();j++){
                           if(list2.get(j).getPerID().equals(PerID)){
                               list.get(i).setPer(list2.get(j));
                           }else{
                               countper++;
                           }
                       }
                       if(countper==list2.size()){
                           System.out.println("Not Found");
                       }
                       break;
                    case 2:
                        System.out.println("Enter Book ID:");
                        String BookID = sc.nextLine();
                        int countbook=0;
                        for(int j=0;i<list3.size();j++){
                            if(list3.get(j).getBookID().equals(BookID)){
                               list.get(i).setBook(list3.get(j));
                           }else{
                               countbook++;
                           }
                       }
                       break;
                    case 3:
                       default:
                           System.out.println("NOT VALID");
                       break; 
                    }
                    count++;
                }
            }
        if(count==0){
            System.out.println("Not Found ! ");
        }
        return true;  
    }

    @Override
    public boolean delete(ArrayList<Borrow> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Borrow ID: ");
        String BorrowID = sc.nextLine();
        for(int i=0;i<list.size();i++){
            if(list.get(i).getBorrowID().equals(BorrowID)){
                System.out.println("Do you want to delete this Borrow (Y/N) ?");
                String choice = sc.nextLine();
                if(choice.equals("Y")){
                    list.remove(i);
                    return true;
                }else{  
                    return false;
                }
            }
        }
        System.out.println("Not Found ! ");
        return true;
    }

    @Override
    public void show(ArrayList<Borrow> list) {
        System.out.printf("|%-10s|%-20s|%-30s|%n", "ID", 
                "Person", "Book");
        System.out.printf("|%-10s|%-20s|%-30s|%n", "_________","__________________", "______________");
        if(list.size()==0){
            System.out.println("Not Found");
        }else{
            for (int i = 0; i < list.size(); i++) {
            System.out.printf("|%-10s|%-20s|%-30s%n", list.get(i).getBorrowID(),
                    list.get(i).getPer().getPerName(), list.get(i).getBook().getBookName());
        }
        }
    }

    @Override
    public void search(ArrayList<Borrow> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Borrow ID: ");
        String BorrowID = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getBorrowID().equals(BorrowID)) {
                System.out.printf("|%-10s|%-10s|%-10s|%n", "ID",
                        "Person", "Book");
                System.out.printf("|%-10s|%-10s|%-10s|%n", list.get(i).getBorrowID(),
                        list.get(i).getPer().getPerName(), list.get(i).getBook().getBookName());
            }else{
                System.out.println("Not Found ! Please Try Again: ");
            }
        }
    }

    @Override
    public Object add(ArrayList<Borrow> list) {
        return null;
    }

    @Override
    public boolean edit(ArrayList<Borrow> list) {
        return false;
    }

    @Override
    public boolean checkID(ArrayList<Borrow> list, String id) {
         for(int i=0;i<list.size();i++){
            if(list.get(i).getBorrowID().equals(id)){
                return true;
            }
        }
        return false;
    }
   
}
