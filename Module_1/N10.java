package Assignment_Tops.Module_1;

import java.util.Scanner;

public class N10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // user input
        System.out.print("Enter an integer (n): ");
        int n = scanner.nextInt();

        // Calculate the values of n + nn + nnn
        int nn = n * 10 + n;
        int nnn = n * 100 + nn;
        int result = n + nn + nnn;

        System.out.println("Result: " + result);
    }
}
