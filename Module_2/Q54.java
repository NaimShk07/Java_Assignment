package Assignment_Tops.Module_2;

import java.util.HashMap;
import java.util.HashSet;

public class Q54 {
    public static void main(String[] args) {
        // Write a Java program to associate the specified value with the specified key in a HashMap.

        // creating object from Hashmap
        HashMap<Integer,String> map = new HashMap<>();

        // adding data to arraylist
        map.put(0,"Red");
        map.put(1,"Blue");
        map.put(2,"Green");
        map.put(3,"Yellow");
        map.put(4,"AppleRed");

        // getting value by key
        System.out.println(map.get(0));

    }
}
