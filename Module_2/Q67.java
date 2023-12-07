package Assignment_Tops.Module_2;

import java.util.HashSet;

public class Q67 {
    public static void main(String[] args) {
        // Write a Java program to compare two sets and retain elements which are same on both sets.

        // creating
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        // Insert
        set.add(0);
        set.add(1);
        set.add(2);
        set2.add(2);
        set2.add(3);
        set2.add(4);

        System.out.println(set);
        // compare two sets and retain elements which are same using retainAll method
        set.retainAll(set2);
        System.out.println(set);


    }
}
