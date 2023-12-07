package Assignment_Tops.Module_2;

import java.util.ArrayList;

public class Q64 {
    public static void main(String[] args) {
        // Write a Java program to increase the size of an array list.

        // creating object from arraylist
        ArrayList<String> list = new ArrayList<>();

        // adding data to arraylist
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");

        System.out.println("Before size "+list.size());
        // increasing the size of arraylist using ensureCapacity method
        list.ensureCapacity(10);
        System.out.println("After size "+list.size());
    }
}
