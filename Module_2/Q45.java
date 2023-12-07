package Assignment_Tops.Module_2;

import java.util.ArrayList;

public class Q45 {
    public static void main(String[] args) {
        // Write a Java program to remove the third element from an array list.

        // creating object from arraylist
        ArrayList list = new ArrayList();

        // adding data to arraylist
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");


        // to remove element at arraylist
        list.remove(0);
        System.out.println(list);
    }
}
