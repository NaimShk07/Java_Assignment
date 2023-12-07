package Assignment_Tops.Module_2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Q68 {
    public static void main(String[] args) {
        // Write a Java program to get a collection view of the values contained in this map.

        // creating object from Hashmap
        HashMap<Integer, String> map = new HashMap<>();

        // adding data to arraylist
        map.put(0, "Red");
        map.put(1, "Blue");
        map.put(2, "Green");
        map.put(3, "Yellow");
        map.put(4, "AppleRed");

        // to get values in collection
        // Iterator
        Set set = map.entrySet();
        Iterator itr = set.iterator();
        while(itr.hasNext()) {
            Map.Entry entry = (Entry) itr.next();
            System.out.println("value : "+entry.getValue());
        }

    }
}
