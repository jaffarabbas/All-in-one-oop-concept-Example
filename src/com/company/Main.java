package com.company;


import java.util.ArrayList;
import java.util.Scanner;

abstract class Library_Card_Holder{
    String Id_Card_Holder;
    String Name_Card_Holder;
    String Lib_Card_number_for_students_Card_Holder;
    String Address_Card_Holder;

    public abstract String toString();

    public Library_Card_Holder(String Id_Card_Holder ,String Name_Card_HolderString ,String Lib_Card_number_for_students_Card_Holder,String Address_Card_Holder){
        this.Id_Card_Holder = Id_Card_Holder;
        this.Name_Card_Holder = Name_Card_HolderString;
        this.Lib_Card_number_for_students_Card_Holder = Lib_Card_number_for_students_Card_Holder;
        this.Address_Card_Holder = Address_Card_Holder;
    }
}


class Book extends Library_Card_Holder{
    String Name_Book;
    String STDN_Book;
    String issue_date_Book;
    String Auther_name_Book;
    double rate_Book;

    public Book(String Name, String STDN,String issue_date,String Auther_name,double rate){
        super("f","dsfsdf","dsfsdf","sdfsdf");
        this.Name_Book = Name;
        this.STDN_Book = STDN;
        this.issue_date_Book = issue_date;
        this.Auther_name_Book = Auther_name;
        this.rate_Book = rate;
    }

    public String toString(){
        return "Id : "+Id_Card_Holder+"\nName : "+Name_Card_Holder+"\nLibraray card : "+Lib_Card_number_for_students_Card_Holder+"\n Address : "+Address_Card_Holder;
    }
    //abstract void Distnary(String Distnary_Holder_Id_Card_Holder,String Distnary_Holder_Id_Name_Card_Holder, String Distnary_Holder_Id_Lib_Card_number_for_students_Card_Holder,String Distnary_Holder_Id_Address_Card_Holder);
}

class Librarian{
    String Name_Librarian;
    String Address_Librarian;
    String Lib_Card_Librarian;

    String Stock_Name_Book;
    String Stock_STDN_Book;
    String Stock_issue_date_Book;
    String Stock_Auther_name_Book;
    double Stock_rate_Book;

    public Librarian(String Name_Librarian,String Address_Librarian,String Lib_Card_Librarian){
        this.Name_Librarian = Name_Librarian;
        this.Lib_Card_Librarian = Lib_Card_Librarian;
        this.Address_Librarian = Address_Librarian;
    }
//    this.Stock_Name_Book = "HP5";
//        this.Stock_STDN_Book ="AFS21312312312";
//        this.Stock_issue_date_Book="3-6-1999";
//        this.Stock_Auther_name_Book="J.k rowling";
//        this.Stock_rate_Book=1000;
    void Book_info(String Stock_Name_Book, String Stock_STDN_Book, String Stock_issue_date_Book, String Stock_Auther_name_Book, double Stock_rate_Book){
        this.Stock_Name_Book = Stock_Name_Book;
        this.Stock_STDN_Book =Stock_STDN_Book;
        this.Stock_issue_date_Book=Stock_issue_date_Book;
        this.Stock_Auther_name_Book=Stock_Auther_name_Book;
        this.Stock_rate_Book=Stock_rate_Book;
    }

    public void Book_collection(){
        ArrayList<Book> Book_I = new ArrayList<Book>(1);
        for(int variable_for_book = 0 ;variable_for_book <1;variable_for_book++){
            Book_I.add(new Book(Stock_Name_Book,Stock_STDN_Book,Stock_issue_date_Book,Stock_Auther_name_Book,Stock_rate_Book));
        }
    }
}

interface Library_Method_carry{
     void Book_for_Sail(double quantity, double discount_rate);
     void Book_Holder();
}

class Library extends Librarian implements Library_Method_carry{

    public Library(String Name_Librarian, String Address_Librarian, String Lib_Card_Librarian) {
        super(Name_Librarian, Address_Librarian, Lib_Card_Librarian);
    }

    public void Book_for_Sail(double quantity, double discount_rate){
        Scanner obj_for_book_sail = new Scanner(System.in);
        System.out.println("Enter Quantity : ");
        quantity = obj_for_book_sail.nextInt();
        double total_price = this.Stock_rate_Book*quantity;
        if(quantity > 50){
            double discount = total_price - discount_rate;
            System.out.println("With Discount Rate : "+discount);
        }
        else{
            System.out.println("Your Total Payment = "+total_price);
        }
    }

    public void Book_Holder(){
        Scanner scanner_for_Book = new Scanner(System.in);
        char Selecter_for_Scanner = scanner_for_Book.next().charAt(0);
        if (Selecter_for_Scanner == 'S') {
            Book_info("HP5", "AFS21312312312", "3-6-1999", "J.k rowling", 1000);
        }
        else{
            System.out.println("Wroung Syntx Enter S");
            Book_Holder();
        }
    }

//    public void Distnar(String Distnary_Holder_Id_Card_Holder,String Distnary_Holder_Id_Name_Card_Holder, String Distnary_Holder_Id_Lib_Card_number_for_students_Card_Holder,String Distnary_Holder_Id_Address_Card_Holder){
//        this.Distnary_Holder_Id_Card_Holder = Distnary_Holder_Id_Address_Card_Holder;
//        this.Distnary_Holder_Id_Name_Card_Holder =Distnary_Holder_Id_Name_Card_Holder;
//        this.Distnary_Holder_Id_Lib_Card_number_for_students_Card_Holder = Distnary_Holder_Id_Lib_Card_number_for_students_Card_Holder;
//        this.Distnary_Holder_Id_Address_Card_Holder = Distnary_Holder_Id_Address_Card_Holder;
//    }





}



public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
