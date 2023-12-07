package Assignment_Tops.Module_2;

import java.util.Scanner;

public class Q23 {
    // W.A.J. P to demonstrate try catch block

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // user input
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            System.out.println("You entered: " + number);
        } catch (Exception e) {
            // if user input anything other than integer it will show the error
            e.printStackTrace();
        } finally {
            // this block will always run
            System.out.println("This block will always be executed.");
        }

    }
}

