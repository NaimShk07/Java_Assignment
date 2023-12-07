package Assignment_Tops.Module_2;

import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        // user input of marks
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your marks to check the grade : ");
        int mark=in.nextInt();

        // calling displayGrade method
        displayGrade(mark);
    }

    public static void displayGrade(int marks) {
        if (marks >= 91 && marks <= 100) {
            System.out.println("Grade: AA");
        } else if (marks >= 81 && marks <= 90) {
            System.out.println("Grade: AB");
        } else if (marks >= 71 && marks <= 80) {
            System.out.println("Grade: BB");
        } else if (marks >= 61 && marks <= 70) {
            System.out.println("Grade: BC");
        } else if (marks >= 51 && marks <= 60) {
            System.out.println("Grade: CD");
        } else if (marks >= 41 && marks <= 50) {
            System.out.println("Grade: DD");
        } else if (marks <= 40) {
            System.out.println("Grade: Fail");
        } else {
            System.out.println("Invalid marks entered");
        }
    }

}
