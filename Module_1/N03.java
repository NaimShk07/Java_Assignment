package Assignment_Tops.Module_1;

import java.util.Scanner;

public class N03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a year if it is leap year or not");
        //User input of year
        int year = in.nextInt();

        // to check if it's a leap year or not 3 conditions are there
        // it should be divided by 4
        // it should not be divided by 100
        // it should be divided by 400

        if (year % 4 == 0) {
            if (year % 100 != 0) {
                if (year % 400 == 0) {
                    System.out.println("The given year is a leap year");
                } else {
                    System.out.println("400The given year is not a leap year");
                }
            } else {
                System.out.println("100The given year is not a leap year");
            }
        } else {
            System.out.println("4The given year is not a leap year");
        }

    }
}

