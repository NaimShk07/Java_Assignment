package Assignment_Tops.Module_2;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
    // W.A.J.P to concatenate a given string to the end of another string.
        String temp_str="hello,";
        // user input of string
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your name to get customised message");
        String in_str=in.next();

        // using concat method we will concat both string.
        System.out.println(temp_str.concat(in_str));
    }
}
