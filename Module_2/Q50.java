package Assignment_Tops.Module_2;

import java.util.ArrayList;
import java.util.Collections;


public class Q50 {
    public static void main(String[] args) {
        // Write a Java program to shuffle elements in an array list

        // creating object from arraylist
        ArrayList<String> list = new ArrayList<>();

        // adding data to arraylist
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");
        list.add("AppleRed");

        // to shuffle arraylist
        Collections.shuffle(list);
        System.out.println(list);
    }
}

