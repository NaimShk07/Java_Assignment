package Assignment_Tops.Module_2;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        // W.A.J.P to get the character at the given index within the String. Original String = Tops Technologies! The character at position 0 is T, The character at position 10 is o
        Scanner in=new Scanner(System.in);
        String str="TopsTechnologies";

        // user input of index
        System.out.print("Enter a index to get character : ");
        short index=in.nextShort();

        System.out.println("The character at given index is "+ str.charAt(index));
    }
}
