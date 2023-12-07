package Assignment_Tops.Module_1;

public class N12 {
    public static void main(String[] args) {
        // Write a Java program to print numbers between 1 and 100 which are divisible by 3, 5 and by both.
        System.out.println("These numbers are divisible by 3,5, and both");
        for (int i = 1; i <= 100; i++) {
            if ((i % 3 == 0) || (i % 5 == 0)) {
                System.out.println(i);
            }
        }
    }
}
