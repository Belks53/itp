//import java.util.Scanner;
//
//class Calculator{
//    public int addition(int a, int b){
//        return a+b;
//    }
//    public int subtraction(int a, int b){
//        return a-b;
//    }
//    public int multiplication(int a, int b){
//        return a*b;
//    }
//    public int division(int a, int b){
//        return a/b;
//    }
//
//    public int calculate(int a, int b, char c){
//        switch (c){
//            case '+':
//                return addition(a, b);
//            case '-':
//                return subtraction(a, b);
//            case '*':
//                return multiplication(a, b);
//            case '/':
//                return division(a, b);
//            default:
//                return 0;
//        }
//    }
//}
//
//
//
//public class lab7 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        Calculator c = new Calculator();
//        String line =  input.nextLine();
//
//
//
//    }
//
//}

import javax.naming.PartialResultException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Author
{
    String name;
    String email;
    char gender;

    public Author(String name, String email, char gender)
    {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

   public String getEmail() {
        return email;
    }
    public char getGender() {
        return gender;
    }
}

class Book {
    String name;
    double price;
    int qty = 0;
    Author author;

    public Book(double price, int qty, Author author) {
        this.price = price;
        this.qty = qty;
        this.author = author;

    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getQty() {
        return qty;
    }

    public String toString() {
        return "Book [name=" + getName() + ", " + "Author [name=" + getAuthor().getName() + ", email=" + getAuthor().getEmail() + ", gender" + getAuthor().getGender() + "]" + getPrice() + ", qty=" + getQty() + "]";

    }
}


public class lab7 {
    public static void main(String[] args) {

    }
}

