package Assignment_Tops.Module_2;

import java.util.ArrayList;


public class Q47 {
    public static void main(String[] args) {
        // Write a Java program to search an element in an array list.


        // creating object from arraylist
        ArrayList list = new ArrayList();

        // adding data to arraylist
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");


        // to search element in arraylist
        String search="Blue";
        if (list.contains(search)){
            System.out.println("Yes, this element exist in arraylist");
        }
        else{
            System.out.println("This element doesn't exist in arraylist");
        }
    }
}

