package Assignment_Tops.Module_2;

import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // array to store 10 integer
        int[] arr = new int[10];

        try {
            System.out.println("enter 10 integer values:");

            for (int i = 0; i < 10; i++) {
                arr[i] = scanner.nextInt();

                // condition to chech entered value is less than or more than 40
                if (arr[i] < 10 || arr[i] > 40) {
                    throw new IllegalArgumentException("value must be between 10 and 40.");
                }
            }

            // displaying all entered values
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
