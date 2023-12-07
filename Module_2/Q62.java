package Assignment_Tops.Module_2;

import java.util.ArrayList;
import java.util.HashSet;

public class Q62 {
    public static void main(String[] args) {
        // Write a Java program to convert a hash set to a List/ArrayList.

        // creating object
        HashSet<Integer> set=new HashSet<>();

        // adding value in set
        set.add(0);
        set.add(1);
        set.add(2);
        set.add(3);

        // convert hashset into arraylist/ list
        ArrayList list=new ArrayList<>(set);
        System.out.println(list);

    }
}
