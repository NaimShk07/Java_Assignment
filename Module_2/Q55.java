package Assignment_Tops.Module_2;

import java.util.HashMap;

public class Q55 {
    public static void main(String[] args) {
        // Write a Java program to count the number of key-value (size) mappings in a map.

        // creating object from Hashmap
        HashMap<Integer,String> map = new HashMap<>();

        // adding data to arraylist
        map.put(0,"Red");
        map.put(1,"Blue");
        map.put(2,"Green");
        map.put(3,"Yellow");
        map.put(4,"AppleRed");

        // counting the number of key-value pair
        System.out.println(map.size());

    }
}
