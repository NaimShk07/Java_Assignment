package Assignment_Tops.Module_1;

import java.util.Scanner;

public class N02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a single letter to check if it is a vowel or consonant");

        // Taking user single letter in string
        String vl = in.next();

        // checking if user input is vowel or consonant or user has given more than the single letter.

        if (vl.equals("a") || vl.equals("e") || vl.equals("i") || vl.equals("o") || vl.equals("u") || vl.equals("A") || vl.equals("E") || vl.equals("I") || vl.equals("O") || vl.equals("U")) {
            System.out.println("The letter is a vowel");
        }
        else if (vl.length() > 1) {
            System.err.println("Enter a single letter");
        }
        else {
            System.out.println("The letter in consonant");
        }
    }
}

