/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manage;

import Interface.Action;
import Model.Person;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class PersonManagement implements Action<Person>{

    @Override
    public Object add(ArrayList<Person> list){
        Person per = new Person();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Person ID :  ");
        String PerID = sc.nextLine();
        while(checkID(list, PerID)){
            System.out.println("Person ID is valid ...... Please Try again!........");
            PerID = sc.nextLine();
        }
        while(PerID.contains(" ") || PerID.equals(" ")){
            System.out.println("   Not space!  ");
            PerID = sc.nextLine();
        }
        per.setPerID(PerID);
        System.out.println("Enter Person Name: ");
        String PerName = sc.nextLine();
        per.setPerName(PerName);
        System.out.println("Enter Date Of Birth: ");
        String DateofBirth = sc.nextLine();
        per.setDateOfBirth(DateofBirth);
        System.out.println("Enter Email: ");
        String Email = sc.nextLine();
        per.setEmail(Email);
        return per;
    }

    @Override
    public boolean edit(ArrayList<Person> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Person ID: ");
        String PerID = sc.nextLine();
        for(int i=0;i<list.size();i++){
            if(list.get(i).getPerID().equals(PerID)){
                System.out.println("Enter Person Name: ");
                String PerName = sc.nextLine();
                System.out.println("Enter Date Of Birth: ");
                String DateofBirth = sc.nextLine();
                System.out.println("Enter Email: ");
                String Email = sc.nextLine();
                list.get(i).setPerName(PerName);
                list.get(i).setDateOfBirth(DateofBirth);
                list.get(i).setEmail(Email);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(ArrayList<Person> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Person ID:  ");
        String PerID = sc.nextLine();
        for(int i=0;i<list.size();i++){
            if(list.get(i).getPerID().equals(PerID)){
                System.out.println("Do you want to really delete this Person? (Y/N) ");
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
    public void show(ArrayList<Person> list) {
        System.out.printf("|%-10s|%-20s|%-20s|%-40s|%n", "PerID", "PerName", "DateofBirth", "Email");
        if(list.size()==0){
            System.out.println("Empty ! ");
        }else{
            for(int i=0;i<list.size();i++){
                System.out.printf("|%-10s|%-20s|%-20s|%-40s|%n",list.get(i).getPerID(),
                        list.get(i).getPerName(),list.get(i).getDateOfBirth(),list.get(i).getEmail());
            }
        }
       
    }

    @Override
    public void search(ArrayList<Person> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Person ID : ");
        String PerID = sc.nextLine();
        for(int i=0;i<list.size();i++){
            if(list.get(i).getPerID().equals(PerID)){
                System.out.println("Person ID : " + list.get(i).getPerID());
                System.out.println("Person Name : " + list.get(i).getPerName());
                System.out.println("Date Of Birth : " + list.get(i).getDateOfBirth());
                System.out.println("Email: " + list.get(i).getEmail());
            }else{
                System.out.println("Not Found");
            }
        }
    }

    @Override
    public boolean checkID(ArrayList<Person> list, String id) {
        for(int i=0;i<list.size();i++){
            if(list.get(i).getPerID().equals(id)){
                return true;
            }
        }
        return false;
    } 
}
