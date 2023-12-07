package Assignment_Tops.Module_2;

import java.util.HashMap;

public class Q63 {
    public static void main(String[] args) {
        //  Write a Java program to check whether a map contains key-value mappings (empty) or not.

        // creating object from Hashmap
        HashMap<Integer, String> map = new HashMap<>();

        // adding data to arraylist
        map.put(0, "Red");
        map.put(1, "Blue");
        map.put(2, "Green");
        map.put(3, "Yellow");
        map.put(4, "AppleRed");

        // checking is map contain key-value or not using isempty method
        if (map.isEmpty()) {
            System.out.println("Map is empty");
        } else {
            System.out.println("map is not empty");
        }
    }
}
