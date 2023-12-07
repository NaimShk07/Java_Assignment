package Assignment_Tops.Module_2;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        // W.A.J.P to check whether a given string ends with the contents of another string. "Java Exercises" ends with "se"? False "Java Exercise" ends with"se"? True
        String str1="Java Exercises";

        // user input of second string
        Scanner in=new Scanner(System.in);
        String str2=in.next();

        // checking with endswith method of string

        System.out.println(str1+" end with "+str2+" ? : "+str1.endsWith(str2));
    }
}
