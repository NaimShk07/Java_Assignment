package Assignment_Tops.Module_2;

import java.util.ArrayList;

public class Q42 {
    public static void main(String[] args) {
        // Write a Java program to insert an element into the array list at the first position.

        // creating object from arraylist
        ArrayList<String> list = new ArrayList<>();

        // adding data to arraylist
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");

        // to add element at first position
        list.add(0,"BloodRed");
        // or
        list.addFirst("FirstBloodRed");

        System.out.println(list);
    }
}
