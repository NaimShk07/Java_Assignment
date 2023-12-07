package Assignment_Tops.Module_2;

import java.util.HashSet;

public class Q53 {
    public static void main(String[] args) {
        // Write a Java program to get the number of elements in a hash set.

        // creating object from hashset
        HashSet<String> set = new HashSet<>();

        // adding data to hashset
        set.add("Red");
        set.add("Blue");
        set.add("Green");
        set.add("Yellow");
        set.add("AppleRed");

        // Number of element in hash set using size method
        System.out.println(set.size());
    }
}
