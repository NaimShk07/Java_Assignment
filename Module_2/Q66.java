package Assignment_Tops.Module_2;

import java.util.ArrayList;

public class Q66 {
    public static void main(String[] args) {
        //  Write a Java program to print all the elements of an ArrayList using the position of the elements.

        // creating object from arraylist
        ArrayList<String> list = new ArrayList<>();

        // adding data to arraylist
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");

        // printing all the element using position of element
        for (int i = 0; i < list.size(); i++) {
            System.out.println("position "+i+ " : "+list.get(i));
        }
    }
}
