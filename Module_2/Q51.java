package Assignment_Tops.Module_2;

import java.util.HashSet;


public class Q51 {
    public static void main(String[] args) {
        // Write a Java program to append the specified element to the end of a hash set.

        // creating object from hashset
        HashSet<String> set = new HashSet<>();

        // adding data to hashset
        set.add("Red");
        set.add("Blue");
        set.add("Green");
        set.add("Yellow");
        set.add("AppleRed");

        // to add element at the end of hashset
        set.add("last");

        System.out.println(set);
    }
}

