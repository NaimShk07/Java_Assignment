package Assignment_Tops.Module_1;

import java.util.Scanner;

public class N07 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        // User input
        System.out.println("Enter number less than ten billion to count digits");
        long num=in.nextLong();

        // Logic here is we will divide the given number with 10, until it become 0, and we will count how many times loop is running to complete this task, at the end we will get count = digits

        int count=0;
        while (num!=0){
            num = num/10;
            count++;
        }
        System.out.println("The number of digits is" + count );
    }
}
