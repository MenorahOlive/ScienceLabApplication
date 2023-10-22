package sciencelabapplication;
//problem: limited student access to science laboratories 
//solution: bring labs closer to students using an application that allows them to interact with the lab in an application

import java.util.Scanner;

public class ScienceLabApplication {

    static Scanner input = new Scanner(System.in);

    int subjectCode;
    String subjectName;

    //constructor
    public ScienceLabApplication(int subCode, String subName) {
        subjectCode = subCode;
        subjectName = subName;
    }

    //method 1
    public void apparatusFinder() {
        System.out.println("****************************************************");
        System.out.println("Welcome to apparatus finder!");
        System.out.println("****************************************************");

    }

    //method 2
    public void pastpaperAccess() {
        System.out.println("****************************************************");
        System.out.println("Welcome to apparatus pastpaper access!");
        System.out.println("****************************************************");

    }

    public static void main(String[] args) {

        // object creation
        Chemistry demo1 = new Chemistry(1024, "CHEMISTRY104", 1);
        Biology demo2 = new Biology(1023, "BIOLOGY104", 1);
        System.out.println("***************************SCIENCE LAB APPLICATION*************************");
        System.out.println("Kindly input your Subject of choice: ");
        System.out.println("1. Chemistry");
        System.out.println("2. Biology");
        int selection = input.nextInt();
        switch (selection) {
            case 1: {
                demo1.apparatusFinder();
                break;
            }
            case 2: {
                demo2.apparatusFinder();
                break;
            }
            default: {
                System.out.println("ERROR! Choose an appropriate choice");
                break;
            }

        }

    }
}
