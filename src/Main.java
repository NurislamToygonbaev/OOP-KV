import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanForNum = new Scanner(System.in);
        Appartment magistral = new Appartment("luks", 500D, "magistral");
        Appartment ahunbaeva = new Appartment("Elite Home", 1000D, "Ahunbaeva");

        Student nurislam = new Student("Toigonbaev Nurislam", 503459898, 250D, magistral);
        Student nurmuhammed = new Student("Medetov Nurmuhammed", 707370793, 400D, magistral);
        Student nurgazy = new Student("Temiraliev Nurgazy", 707454354, 300D, magistral);
        Student nurlan = new Student("Abibillaev Nurlan", 777453276, 500D, ahunbaeva);
        Student nurkamil = new Student("Kamchiev Nurkamil", 556349821, 700D, ahunbaeva);
        Student zhigit = new Student("Turumbekov Zhigit", 504345678, 1000D, ahunbaeva);
        Student[] students = new Student[]{nurislam, nurmuhammed, nurgazy, nurlan, nurkamil, zhigit};

        Student[] firstHalfStudents = new Student[]{nurislam, nurmuhammed, nurgazy};
        Student[] secondHalfStudents = new Student[]{nurlan, nurkamil, zhigit};

        boolean istrue = true;
        while (istrue) {
            System.out.println("1 button for chek who where lives");
            System.out.println("2 pay per month");
            System.out.println("3 how many can live in an Apt");
            System.out.println("4 button to Up Date");
            System.out.println("5 for log out");
            System.out.print("----->>> ");
            int numbers = scanForNum.nextInt();
            switch (numbers) {
                case 1:
                    System.out.print("write address Apt: ");
                    String address = scanner.nextLine();
                    getInfoAptAddress(address, magistral, firstHalfStudents);
                    System.out.println();
                    getInfoAptSecAd(address, ahunbaeva, secondHalfStudents);
                    System.out.println();
                    break;
                case 2:
                    magistral.payPerMonth(firstHalfStudents);
                    System.out.println();
                    ahunbaeva.payPerMonth(secondHalfStudents);
                    System.out.println();
                    break;
                case 3:
                    for (Student firstHalfStudent : firstHalfStudents) {
                        firstHalfStudent.liveIn(magistral, firstHalfStudents);
                    }
                    for (Student secondHalfStudent : secondHalfStudents) {
                        secondHalfStudent.liveIn(ahunbaeva, secondHalfStudents);
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.print("write name for Up Date: ");
                    String name = scanner.nextLine();
                    nurislam.getInfoUpDate(name, students);
                    System.out.println();
                    break;
                case 5:
                    istrue = false;
                    break;
                default:
                    System.out.println("write correct!!!");
                    break;
            }
        }

    }


    public static void getInfoAptAddress(String address, Appartment magistral, Student[] students) {
        if (address.equalsIgnoreCase(magistral.getAddress())) {
            for (Student student : students) {
                System.out.println(student.getInfoStudent());
            }
        }
    }

    public static void getInfoAptSecAd(String address, Appartment ahunbaeva, Student[] students) {
        if (address.equalsIgnoreCase(ahunbaeva.getAddress())) {
            for (Student student : students) {
                System.out.println(student.getInfoStudent());
            }
        }
    }
}
//        for (Student student : students) {
//            for (int i = 0; i < firstHalfStudents.length; i++) {
//                firstHalfStudents[i] = students[i];
//            }
//            if (ahunbaeva.getAddress().equals(student.getAppartment())){
//                for (int i = 0; i < secondHalfStudents.length; i++) {
//                    secondHalfStudents[i] = students[i];
//                }
//            }
//        }
//        int split = students.length / 2;