import java.util.Scanner;

import static java.lang.StringTemplate.STR;

public class Appartment {
    private String title;
    private double price;
    private String address;

    public Appartment(String title, double price, String address) {
        this.title = title;
        this.price = price;
        this.address = address;
    }


   public Appartment(){

   }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getInfo() {
        return STR. "\{ getTitle() } | price: \{ getPrice() } | address: \{ getAddress() }" ;
    }

    public  void payPerMonth(Student [] students){
        double perMonth = getPrice() / students.length;
        perMonth -= students.length;
        for (Student student : students) {
            System.out.println(student.getFullName()+ " pay for month: "+ perMonth);
        }
    }
}
