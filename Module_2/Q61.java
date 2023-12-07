package Assignment_Tops.Module_2;

import java.util.HashSet;

public class Q61 {
    public static void main(String[] args) {
        // Write a Java program to convert a hash set to an array.

        // creating object
        HashSet<Integer> set=new HashSet<>();

        // adding value in set
        set.add(0);
        set.add(1);
        set.add(2);
        set.add(3);

        // to convert hashset in array using toarray method
        Integer[] arr=set.toArray(new Integer[0]);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
