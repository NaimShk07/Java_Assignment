package Assignment_Tops.Module_2;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        // W.A.J.P to check whether a given string starts with the contents of another string. Red is favourite color. Starts with Red? True Orange is also my favorite color. Starts with Red? False I3.
        // String declaration
        String str1="Red is my favourite color";
        String str2="Orange is also my favorite color";
        String str3="Red";

        // using startsWith method
        System.out.println(str1.startsWith(str3));
        System.out.println(str2.startsWith(str3));
    }
}
