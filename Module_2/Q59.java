package Assignment_Tops.Module_2;

import java.util.ArrayList;
import java.util.Collections;

public class Q59 {
    public static void main(String[] args) {
        // Write a Java program of swap two elements in an array list.

        // creating object from arraylist
        ArrayList<String> list = new ArrayList<>();

        // adding data to arraylist
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");

        System.out.println("Before swapping");
        System.out.println(list);

        // #1
        // .get will return value according to given index
        // .set will update the value according to index
        String temp;
        temp=list.get(0);
        list.set(0,list.get(1));
        list.set(1,temp);

        // #2 to do swap in list there is a specific method is available
        Collections.swap(list,2,3);

        System.out.println("after swapping");
        System.out.println(list);



    }
}
