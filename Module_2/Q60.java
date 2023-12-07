package Assignment_Tops.Module_2;

import java.util.ArrayList;
import java.util.Collections;

public class Q60 {
    public static void main(String[] args) {
        // Write a Java program to join two array lists.

        // creating object from arraylist
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        // adding data to arraylist
        list.add("Red");
        list.add("Blue");
        list2.add("Green");
        list2.add("Yellow");

        // joining two arraylist using addAll mthod
        list.addAll(list2);
        System.out.println(list);
    }
}
