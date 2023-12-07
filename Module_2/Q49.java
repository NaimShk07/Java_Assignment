package Assignment_Tops.Module_2;

import java.util.ArrayList;
import java.util.Collections;


public class Q49 {
    public static void main(String[] args) {
        // Write a Java program to copy one array list into another.

        // creating object from arraylist
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        // adding data to arraylist
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");
        list.add("AppleRed");

        // to copy one arraylist into another
        list2.addAll(list);
        System.out.println(list);
        System.out.println(list2);

    }
}

