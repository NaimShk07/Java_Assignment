package Assignment_Tops.Module_2;

import java.util.ArrayList;

public class Q58 {
    public static void main(String[] args) {
        // Write a Java program to compare two array lists.

        // creating object from arraylist
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        // adding data to arraylist
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list2.add("Red");
        list2.add("Blue");
        list2.add("Green");

        // comparing both arraylist using equals method
        if (list.equals(list2)){
            System.out.println("Both list are equal");
        }
        else{
            System.out.println("Both list are not equal");
        }


    }
}
