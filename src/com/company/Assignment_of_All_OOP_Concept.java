package com.company;


import java.util.ArrayList;
import java.util.Scanner;


//This is the combination of All Pillars of oop
//1)inheritance
//2)Abstraction
//3)Polymophism
//3)Encapsulation
//i use encapsulation as a access modifier
//i use Libaray mangement concept

//i have a absrtact class card holder that is a superclass that is extended by its base class which is Book
//thien i have librarian which stand alone
//thien a main class of concept Library
//then a test class
//========================================================================


//First Abstract class
abstract class Library_Card_Holder{
    String Id_Card_Holder;//instant
    String Name_Card_Holder;//instant
    String Lib_Card_number_for_students_Card_Holder;//instant
    String Address_Card_Holder;//instant

    public abstract String toString();//abstact method

    //contructer 1
    public Library_Card_Holder(String Id_Card_Holder ,String Name_Card_HolderString ,String Lib_Card_number_for_students_Card_Holder,String Address_Card_Holder){
        this.Id_Card_Holder = Id_Card_Holder;
        this.Name_Card_Holder = Name_Card_HolderString;
        this.Lib_Card_number_for_students_Card_Holder = Lib_Card_number_for_students_Card_Holder;
        this.Address_Card_Holder = Address_Card_Holder;
    }
}

//base class for super abstract class
class Book extends Library_Card_Holder{
    String Name_Book;//instant
    String STDN_Book;//instant
    String issue_date_Book;//instant
    String Auther_name_Book;//instant
    double rate_Book;//instant

    //constracter 2 and a super constructer giving example of
    //POLYMORHISM that is reuse of a method
    public Book(String Name, String STDN,String issue_date,String Auther_name,double rate){
        super("f","dsfsdf","dsfsdf","sdfsdf");//polymorphic constructer
        this.Name_Book = Name;
        this.STDN_Book = STDN;
        this.issue_date_Book = issue_date;
        this.Auther_name_Book = Auther_name;
        this.rate_Book = rate;
        //abstarct method print
        System.out.println("Holder : \n\n"+toString());
        System.out.println("Book : \n\nName : "+Name_Book+"\nSTDN : "+STDN_Book+"\nIssue Date : "+issue_date_Book+"\nAuther Name : "+Auther_name_Book+"\nRate : "+rate_Book);
    }

    //abstract method implementation
    //book holder information
    public String toString(){
        return "Id : "+Id_Card_Holder+"\nName : "+Name_Card_Holder+"\nLibraray card : "+Lib_Card_number_for_students_Card_Holder+"\n Address : "+Address_Card_Holder;
    }
}

//simple class 1 for having as a Main class
class Librarian {
    String Name_Librarian;//instant
    String Address_Librarian;//instant
    String Lib_Card_Librarian;//instant

    String Stock_Name_Book_instant;//instant
    String Stock_STDN_Book_instant;//instant
    String Stock_issue_date_Book_instant;//instant
    String Stock_Auther_name_Book_instant;//instant
    double Stock_rate_Book_instant;//instant

    //constracter 3
    public Librarian(String Name_Librarian, String Address_Librarian, String Lib_Card_Librarian) {
        this.Name_Librarian = Name_Librarian;
        this.Lib_Card_Librarian = Lib_Card_Librarian;
        this.Address_Librarian = Address_Librarian;
    }

    //Method For information of book
    void Book_info(String Stock_Name_Book, String Stock_STDN_Book, String Stock_issue_date_Book, String Stock_Auther_name_Book, double Stock_rate_Book) {
        this.Stock_Name_Book_instant = Stock_Name_Book;
        this.Stock_STDN_Book_instant = Stock_STDN_Book;
        this.Stock_issue_date_Book_instant = Stock_issue_date_Book;
        this.Stock_Auther_name_Book_instant = Stock_Auther_name_Book;
        this.Stock_rate_Book_instant = Stock_rate_Book;
        System.out.println("Book : \n\nName : " + Stock_Name_Book_instant + "\nSTDN : " + Stock_STDN_Book_instant + "\nIssue Date : " + Stock_issue_date_Book_instant + "\nAuther Name : " + Stock_Auther_name_Book_instant + "\nRate : " + Stock_rate_Book_instant);
    }

    //Example of a collection of a book so we can use it as a list and show the collection of a
    //We use ArrayList of Book and populated it with Book Object
    public void Book_collection() {
        ArrayList<Book> Book_I = new ArrayList<Book>(1);
        for (int variable_for_book = 0; variable_for_book < 1; variable_for_book++) {
            Book_I.add(new Book("HP5", "AFS21312312312", "3-6-1999", "J.k rowling", 1000));
        }
    }
}
//Interface to hold methods and have there declaration
interface Library_Method_carry {
        void Book_for_Sail(double quantity, double discount_rate);//first method ....to byuty a book

        void Book_Holder();//second method ...Showing the holder of book e.g Name etc
    }


    //Main test class

//here is ae examplpe of a Multi inheritance
//and this class inheriate both class and interface
    class Library extends Librarian implements Library_Method_carry {

    //contracter 4
    //having another example of Method Polymorpisym
        public Library(String Name_Librarian, String Address_Librarian, String Lib_Card_Librarian) {
            super(Name_Librarian, Address_Librarian, Lib_Card_Librarian);//polimorphic method
            System.out.println("Librarian : \n\nName : " + Name_Librarian + "\nAddress : " + Address_Librarian + "\nLibrary car number : " + Lib_Card_Librarian);
        }

        //First Method Declaration
        public void Book_for_Sail(double quantity, double discount_rate) {
            Scanner obj_for_book_sail = new Scanner(System.in);
            System.out.println("Enter Quantity : ");
            quantity = obj_for_book_sail.nextInt();
            double total_price = this.Stock_rate_Book_instant * quantity;
            if (quantity > 50) {
                double discount = total_price - discount_rate;
                System.out.println("With Discount Rate : " + discount);
            } else {
                System.out.println("Your Total Payment = " + total_price);
            }
        }
    //Second Method Declaration
        public void Book_Holder() {
            Scanner scanner_for_Book = new Scanner(System.in);
            char Selecter_for_Scanner = scanner_for_Book.next().charAt(0);
            System.out.println("Enter S to See");
            if (Selecter_for_Scanner == 'S') {
                Book_info("HP5", "AFS21312312312", "3-6-1999", "J.k rowling", 1000);
                System.out.println("Book : \n\nName : " + Stock_Name_Book_instant + "\nSTDN : " + Stock_STDN_Book_instant + "\nIssue Date : " + Stock_issue_date_Book_instant + "\nAuther Name : " + Stock_Auther_name_Book_instant + "\nRate : " + Stock_rate_Book_instant);
            } else {
                System.out.println("Wroung Syntx Enter S");
                Book_Holder();
            }
        }

        //Method for Selection
        public void Selecter_for_methods() {
            Scanner scanner_for_Methpods = new Scanner(System.in);
            System.out.println("Libraray System :\n\nEnter B for buy \n\nN for Book Name\n\nC for Collection");
            System.out.print("Enter : ");
            char Selecter_for_Scanner = scanner_for_Methpods.next().charAt(0);
            switch (Selecter_for_Scanner) {
                case 'B':
                    Book_for_Sail(59, 500);
                    break;
                case 'N':
                    Book_Holder();
                    break;
                case 'C':
                    Book_collection();
                    break;
                default:
                    Selecter_for_methods();
                    break;
            }
        }

    }



public class Assignment_of_All_OOP_Concept {

    public static void main(String[] args) {
	Library object_for_Library = new Library("miss","adasda","34324");//instant of Librarian and library
        object_for_Library.Selecter_for_methods();
    }
}
