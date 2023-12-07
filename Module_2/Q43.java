package Assignment_Tops.Module_2;

import java.util.ArrayList;

public class Q43 {
    public static void main(String[] args) {
        //Write a Java program to retrieve an element (at a specified index) from a given array list.

        // creating object from arraylist
        ArrayList<String> list = new ArrayList<>();

        // adding data to arraylist
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");


        // to retreive element at arraylist from index
        System.out.println(list.get(2));
    }
}
