package Assignment_Tops.Module_2;

import java.util.ArrayList;
import java.util.Collections;

public class Q56 {
    public static void main(String[] args) {
        // Write a Java program to reverse elements in an array list.

        // creating object from arraylist
        ArrayList<String> list = new ArrayList<>();

        // adding data to arraylist
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");
        list.add("AppleRed");

        // Reversing the arraylist
        Collections.reverse(list);
        System.out.println(list);

    }
}
