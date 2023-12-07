package Assignment_Tops.Module_2;

class PrintNumber {
    // Methods to print all data types
    public void printn(int num) {
        System.out.println("Integer : " + num);
    }

    public void printn(double num) {
        System.out.println("Double : " + num);
    }

    public void printn(boolean b) {
        System.out.println("Boolean : " + b);
    }

    public void printn(char character) {
        System.out.println("Char : " + character);
    }

    public void printn(String text) {
        System.out.println("String : " + text);
    }
}

public class Q08 {
    public static void main(String[] args) {
        // Create a class named 'PrintNumber' to print various numbers of different data types by creating different methods with the same name 'printn' having a parameter for each data type

        // create object and give memory allocation
        PrintNumber pn = new PrintNumber();

        // calling method
        pn.printn(10);
        pn.printn(3.14);
        pn.printn(true);
        pn.printn('A');
        pn.printn("Hello java");

    }
}
