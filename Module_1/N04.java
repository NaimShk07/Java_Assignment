package Assignment_Tops.Module_1;

import java.util.Scanner;

public class N04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Declaration
        int[] arr = new int[5];
        int sum = 0;

        //  Taking input of 5 numbers from keyboard
        System.out.println("Enter 5 number to get sum and average");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        //sum and average using for loop
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum is " + sum + " Average is " + sum / 5);
    }
}
