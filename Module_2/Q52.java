package Assignment_Tops.Module_2;

import java.util.HashSet;
import java.util.Iterator;

public class Q52 {
    public static void main(String[] args) {
        // Write a Java program to iterate through all elements in a hash list.

        // creating object from hashset
        HashSet<String> set = new HashSet<>();

        // adding data to hashset
        set.add("Red");
        set.add("Blue");
        set.add("Green");
        set.add("Yellow");
        set.add("AppleRed");

        // Iterating value using iterator
        Iterator itr=set.iterator();

        // using while loop printing all element of collection
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
