package Assignment_Tops.Module_1;

import java.util.Scanner;

public class N09 {
    public static void main(String[] args) {
        // Write a Java program to print the ASCII value of a given character.

        // user input of one character
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to get the ascii value");
        char value = in.next().charAt(0);

        // type casting string into integer
        int num = (int) (value);
        System.out.println("Ascii value of " + value + " is " + num);
    }
}
