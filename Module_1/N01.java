package Assignment_Tops.Module_1;

import java.util.Scanner;

public class N01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 number to find the greatest among them");

        // taking user input of three numbers
        byte n1 = input.nextByte();
        byte n2 = input.nextByte();
        byte n3 = input.nextByte();

        // n1 > n2,n3 = n1 is greatest
        // n2 > n1,n3 = n2 is greatest
        // n3 > n2,n1 = n3 is greatest
        if (n1 > n2) {
            if (n1 > n3) {
                System.out.println("First number is the greatest");
            } else {
                System.out.println("Second number is the greatest");
            }
        } else {
            if (n2 > n3) {
                System.out.println("Second number is the greatest");
            } else {
                System.out.println("Third number is the greatest");
            }
        }
    }
}
