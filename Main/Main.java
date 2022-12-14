/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Manage.BookManagement;
import Manage.BorrowManagement;
import Manage.JournalsManagement;
import Manage.PersonManagement;
import Manage.TextBookManagement;
import Model.Book;
import Model.Borrow;
import Model.Person;
import Model.Journals;
import Model.TextBook;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Main {

    private static boolean checkbook;
    public static void main(String[] args) {
        BorrowManagement bor = new BorrowManagement();
        ArrayList<Borrow> borList= new ArrayList<Borrow>();
        BookManagement book = new BookManagement();
        ArrayList<Book> bookList = new ArrayList<Book>();
        PersonManagement per = new PersonManagement();
        ArrayList<Person> perList = new ArrayList<Person>();
        JournalsManagement jour = new JournalsManagement();
        ArrayList<Journals> jourList = new ArrayList<Journals>();
        TextBookManagement text = new TextBookManagement();
        ArrayList<TextBook> textList = new ArrayList<TextBook>();
         while(true){
            System.out.println(" __________________________________________________________");
            System.out.println("|          Welcome To  Borrower Management System          |");
            System.out.println("|__________________________________________________________|");
            System.out.println("|                  [1]   Person Manage                     |");
            System.out.println("|                  [2]   Book Manage                       |");
            System.out.println("|                  [3]   Borrow Manage                     |");
            System.out.println("|                  [4]   Exit                              |");                                                                       
            System.out.println("|__________________________________________________________|");
            System.out.println("|                           ***                            |");
            System.out.println("|__________________________________________________________|");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Number : ");
            int choose = sc.nextInt();
            switch(choose){
                case 1:
                    boolean checkper =true;
                    int perchoose=0;
                    while(true){
                        System.out.println(" ________________________________________________");
                        System.out.println("|            Person Management System            |");
                        System.out.println("|________________________________________________|");
                        System.out.println("|      [1]   Add Person                          |");
                        System.out.println("|      [2]   Edit Person                         |");
                        System.out.println("|      [3]   Delete Person                       |");
                        System.out.println("|      [4]   Show Person                         |");
                        System.out.println("|      [5]   Search Person                       |");
                        System.out.println("|      [6]   Back Home                           |");
                        System.out.println("|________________________________________________|");
                        System.out.println("|                        ***                     |");
                        System.out.println("|________________________________________________|");
                        System.out.println("Enter Number : ");
                        perchoose = sc.nextInt();      
                        switch(perchoose){
                            case 1:
                                perList.add((Person) per.add(perList));
                                break;
                            case 2:
                                per.edit(perList);
                                break;
                            case 3:
                                per.delete(perList);
                                break;
                            case 4:
                                per.show(perList);
                                break;
                            case 5:
                                per.search(perList);
                                break;
                            case 6:
                                checkper=false;
                                break;
                            default:
                                System.out.println("Please Try again ! ");
                                break;
                        }
                        if(checkper==false){
                            break;
                        }
                    }
                    break;
                case 2: 
                    boolean checkbook = true;
                    int choosebook=0;
                    while(true){
                        System.out.println(" ________________________________________________");
                        System.out.println("|             Book Management System             |");
                        System.out.println("|________________________________________________|");
                        System.out.println("|              [1]   Journals Book               |");
                        System.out.println("|              [2]   Text Book                   |");
                        System.out.println("|              [3]   Back                        |");
                        System.out.println("|________________________________________________|");
                        System.out.println("|                        ***                     |");
                        System.out.println("|________________________________________________|");
                        System.out.println("Enter Number : ");
                        choosebook=sc.nextInt();
                        switch(choosebook){
                            case 1:
                                boolean checkjour = true;
                                while(true){
                                       System.out.println(" ________________________________________________");
                                       System.out.println("|            Person Management System            |");
                                       System.out.println("|________________________________________________|");
                                       System.out.println("|            [1]   Add Journals Book             |");
                                       System.out.println("|            [2]   Edit Journals Book            |");
                                       System.out.println("|            [3]   Delete Journals Book          |");
                                       System.out.println("|            [4]   Show Journals Book            |");
                                       System.out.println("|            [5]   Search Journals Book          |");
                                       System.out.println("|            [6]   Back Home                     |");
                                       System.out.println("|________________________________________________|");
                                       System.out.println("|                        ***                     |");
                                       System.out.println("|________________________________________________|");
                                       System.out.println("Enter Number : ");
                                       int jourchoose = 0;

                                       jourchoose = sc.nextInt();      
                                       switch(jourchoose){
                                           case 1:
                                               jourList.add((Journals) jour.add(jourList));
                                           break;
                                           case 2:
                                               jour.edit(jourList);
                                           break;
                                           case 3:
                                               jour.delete(jourList);
                                           break;
                                           case 4:
                                               jour.show(jourList);
                                           break;
                                           case 5:
                                               jour.search(jourList);
                                           break;
                                           case 6:
                                               checkjour=false;
                                           break;
                                           default:
                                               System.out.println("Please Try again ! ");
                                           break;
                                       }
                                if(checkjour==false){
                                   break;
                                }
                                break;
                                }
                            case 2:
                                boolean checktext = true;
                                int textchoose = 0;
                                while(true){
                                       System.out.println(" ________________________________________________");
                                       System.out.println("|            Person Management System            |");
                                       System.out.println("|________________________________________________|");
                                       System.out.println("|                [1]   Add Text Book             |");
                                       System.out.println("|                [2]   Edit Text Book            |");
                                       System.out.println("|                [3]   Delete Text Book          |");
                                       System.out.println("|                [4]   Show Text Book            |");
                                       System.out.println("|                [5]   Search Text Book          |");
                                       System.out.println("|                [6]   Back Home                 |");
                                       System.out.println("|________________________________________________|");
                                       System.out.println("|                       ***                      |");
                                       System.out.println("|________________________________________________|");
                                       System.out.println("Enter Number : ");
                                       textchoose = sc.nextInt();      
                                       switch(textchoose){
                                           case 1:
                                               textList.add((TextBook) text.add(textList));
                                           break;
                                           case 2:
                                               text.edit(textList);
                                           break;
                                           case 3:
                                               text.delete(textList);
                                           break;
                                           case 4:
                                               text.show(textList);
                                           break;
                                           case 5:
                                               text.search(textList);
                                           break;
                                           case 6:
                                               checktext=false;
                                           break;
                                           default:
                                               System.out.println("Please Try again ! ");
                                           break;
                                       }
                                if(checktext==false){
                                   break;
                                }
                                break;
                                }
                            case 3:
                                checkbook=false;
                                break;
                            default:
                                System.out.println("Please Try Again ! ");
                                break;
                        }
                        if(checkbook==false){
                            break;
                        }
                    }
                     break;
                
                case 3:
                    boolean checkbor=true;
                    int choosebor = 0;
                    while(true){
                        System.out.println(" __________________________________________________");
                        System.out.println("|            Borrow Management System            |");
                        System.out.println("|__________________________________________________|");
                        System.out.println("|               [1]   Add Borrow                   |");
                        System.out.println("|               [2]   Edit Borrow                  |");
                        System.out.println("|               [3]   Delete Borrow                |");
                        System.out.println("|               [4]   Show Borrow                  |");
                        System.out.println("|               [5]   Search Borrow                |");
                        System.out.println("|               [6]   Back                         |");
                        System.out.println("|__________________________________________________|");
                        System.out.println("|                         ***                      |");
                        System.out.println("|__________________________________________________|");
                        System.out.println("Enter Number : ");

                        choosebor = sc.nextInt();
                        switch(choosebor){
                            case 1:
                                borList.add(bor.add(borList, perList, bookList));
                                break;
                            case 2:
                                bor.edit(borList,perList,bookList);
                                break;
                            case 3:
                                bor.delete(borList);
                                break;
                            case 4:
                                bor.show(borList);
                                break;
                            case 5:
                                bor.search(borList);
                                break;
                            case 6:
                                checkbor=false;
                                break;
                            default:
                                System.out.println("Please Try Again : ");
                                break;
                        }
                        if(checkbor==false){
                            break;
                        }
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
                
            }
                
        }
    }
}
