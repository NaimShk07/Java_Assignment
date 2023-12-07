package Assignment_Tops.Module_2;

import java.util.ArrayList;
import java.util.Collections;


public class Q48 {
    public static void main(String[] args) {
        // Write a Java program to sort a given array list.

        // creating object from arraylist
        ArrayList list = new ArrayList();

        // adding data to arraylist
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");
        list.add("AppleRed");


        // to sort arraylist
        Collections.sort(list);
        System.out.println(list);

    }
}

