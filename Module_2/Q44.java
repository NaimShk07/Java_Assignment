package Assignment_Tops.Module_2;

import java.util.ArrayList;

public class Q44 {
    public static void main(String[] args) {
        // Write a Java program to update specific array element by given element.

        // creating object from arraylist
        ArrayList list = new ArrayList();

        // adding data to arraylist
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");


        // to update element of arraylist of specific index
        list.set(0,"ChangedRed");

        System.out.println(list);
    }
}

