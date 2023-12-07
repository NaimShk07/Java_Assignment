package Assignment_Tops.Module_2;

import java.util.ArrayList;

public class Q65 {
    public static void main(String[] args) {
        // Write a Java program to replace the second element of an ArrayList with the specified element.

        // creating object from arraylist
        ArrayList<String> list = new ArrayList<>();

        // adding data to arraylist
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");

        //  replacing the second element using set method
        list.set(1,"changed");
        System.out.println(list);
    }
}
