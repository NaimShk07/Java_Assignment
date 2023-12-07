package Assignment_Tops.Module_2;

import java.util.ArrayList;
import java.util.Iterator;

public class Q41 {
    public static void main(String[] args) {
        // Write a Java program to iterate through all elements in an array list.

        // creating object from arraylist
        ArrayList<String> list = new ArrayList<>();

        // adding data to arraylist
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");

        // using iterator to iterate the collection
        Iterator itr = list.iterator();
        // showing data with loop
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
