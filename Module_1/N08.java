package Assignment_Tops.Module_1;

import java.util.Scanner;

public class N08 {
    public static void main(String[] args) {
        // Write a Java program to count the letters, spaces, numbers and other characters of an input string.

        Scanner in = new Scanner(System.in);

        // User input
        System.out.println("Enter something to count the letters, spaces, numbers and other characters");
        String value = in.nextLine();
        int letters = 0, space = 0, number = 0, other_char = 0;

        // counting letter, space, number, other_char with acsii values

        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) > 64 && value.charAt(i) < 123) {
                letters++;
            } else if (value.charAt(i) == 32) {
                space++;
            } else if (value.charAt(i) > 47 && value.charAt(i) < 58) {
                number++;
            }else{
                other_char++;
            }
        }
        System.out.println("Letter = " + letters);
        System.out.println("Space = " + space);
        System.out.println("Other_char = " + other_char);
        System.out.println("number = " + number);


    }
}
