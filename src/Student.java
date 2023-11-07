import java.util.Scanner;

public class Student {
   private String fullName;
   private long phoneNumber;
   private double bankCesh;
   private Appartment appartment;

   public Student(String fullName, long phoneNumber, double bankCesh, Appartment appartment) {
       this.fullName = fullName;
       this.phoneNumber = phoneNumber;
       this.bankCesh = bankCesh;
       this.appartment = appartment;
   }
   public Student(){}

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getBankCesh() {
        return bankCesh;
    }

    public void setBankCesh(int bankCesh) {
        this.bankCesh = bankCesh;
    }
    public Appartment getAppartment(){
       return appartment;
    }
    public void setAppartment(Appartment appartment){
       this.appartment = appartment;
    }

    public String getInfoStudent(){
       return STR."fio: \{getFullName()} | tel: \{getPhoneNumber()} | cash: \{getBankCesh()}";
    }

    public void liveIn(Appartment appartment, Student[] students){
       double result = appartment.getPrice() / students.length;
        System.out.println(getFullName() + "| "+ getBankCesh() / result);
    }

    public void getInfoUpDate(String name, Student[] students){
        Scanner scanner = new Scanner(System.in);
        Scanner scanForNum = new Scanner(System.in);
        for (Student student : students) {
            if (name.equalsIgnoreCase(student.fullName)){
                System.out.print("write full name: ");
                student.setFullName(scanner.nextLine());
                System.out.print("write phone number: ");
                student.setPhoneNumber(scanner.nextInt());
                System.out.print("write cash: ");
                student.setBankCesh(scanForNum.nextInt());
            }
        }
        for (Student student : students) {
            System.out.println(student.getInfoStudent());
        }
    }
}
