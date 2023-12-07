package Assignment_Tops.Module_2;

import java.util.ArrayList;
import java.util.List;

public class Q57 {
    public static void main(String[] args) {
        // Write a Java program to extract a portion of an array list.

        // creating object from arraylist
        ArrayList<String> list = new ArrayList<>();

        // adding data to arraylist
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");
        list.add("AppleRed");

        // extracting a portion of ArrayList using subList method
        List<String> subList = list.subList(1,3);

        // printing extracted portion
        System.out.println("Extracted Portion: " + subList);
    }
}
