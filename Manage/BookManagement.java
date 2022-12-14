/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manage;

import Interface.Action;
import Model.Book;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class BookManagement implements Action<Book>{
    @Override
    public Object add(ArrayList<Book> list){
        Book book = new Book();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Book ID :  ");
        String bookID = sc.nextLine();
        while(checkID(list, bookID)){
            System.out.println("Book ID is valid ...... Please Try again!........");
            bookID = sc.nextLine();
        }
        while(bookID.contains(" ") || bookID.equals(" ")){
            System.out.println("   Not space!  ");
            bookID = sc.nextLine();
        }
        book.setBookID(bookID);
        System.out.println("Enter Book Name: ");
        String bookName = sc.nextLine();
        book.setBookName(bookName);
        System.out.println("Enter Author Name: ");
        String AuthorName = sc.nextLine();
        book.setAuthor(AuthorName);
        System.out.println("Enter Title Book: ");
        String title = sc.nextLine();
        book.settitle(title);
        return book;
    }

     @Override
    public boolean edit(ArrayList<Book> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Book ID: ");
        String BookID = sc.nextLine();
        for(int i=0;i<list.size();i++){
            if(list.get(i).getBookID().equals(BookID)){
                System.out.println("Enter Book Name: ");
                String posName = sc.nextLine();
                System.out.println("Enter Author Name: ");
                String AuthorName = sc.nextLine();
                System.out.println("Enter Title: ");
                String title = sc.nextLine();
                list.get(i).setBookName(posName);
                list.get(i).setAuthor(AuthorName);
                list.get(i).settitle(title);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(ArrayList<Book> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Book ID:  ");
        String BookID = sc.nextLine();
        for(int i=0;i<list.size();i++){
            if(list.get(i).getBookID().equals(BookID)){
                System.out.println("Do you want to really delete this Book? (Y/N) ");
                String choice =sc.nextLine();
                if(choice.equals("Y")){
                    list.remove(i);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void show(ArrayList<Book> list) {
        System.out.printf("|%-10s|%-20s|%-20s|%-40s|%n", "BookID", "BookName", "Author", "title");
        if(list.size()==0){
            System.out.println("Empty ! ");
        }else{
            for(int i=0;i<list.size();i++){
                System.out.printf("|%-10s|%-20s|%-20s|%-40s|%n",list.get(i).getBookID(),
                        list.get(i).getBookName(),list.get(i).getAuthor(),list.get(i).getTitle());
            }
        }
       
    }

    @Override
    public void search(ArrayList<Book> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Book ID : ");
        String BookID = sc.nextLine();
        for(int i=0;i<list.size();i++){
            if(list.get(i).getBookID().equals(BookID)){
                System.out.println("Book ID : " + list.get(i).getBookID());
                System.out.println("Book Name : " + list.get(i).getBookName());
                System.out.println("Author Name : " + list.get(i).getAuthor());
                System.out.println("title: " + list.get(i).getTitle());
            }else{
                System.out.println("Not Found");
            }
        }
    }

    @Override
    public boolean checkID(ArrayList<Book> list, String id) {
        for(int i=0;i<list.size();i++){
            if(list.get(i).getBookID().equals(id)){
                return true;
            }
        }
        return false;
    }   
}
