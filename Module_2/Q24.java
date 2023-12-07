package Assignment_Tops.Module_2;

import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // user input of two number for division
        // putting risky code into try catch block
        try {
            System.out.println("Enter two number");
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            System.out.println(num1 / num2);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
}
