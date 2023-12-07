package Assignment_Tops.Module_2;

class PrintI_C{
    public void printn(int n ,char c){
        System.out.println("Integer : "+n);
        System.out.println("Character : "+c);
    }
    public void printn(char c,int n){
        System.out.println("Integer : "+n);
        System.out.println("Character : "+c);

    }
}

public class Q09 {
    public static void main(String[] args) {
        // Create a class to print an integer and a character with two methods having the same name but different sequence of the integer and the character parameters. For example, if the parameters of the first method are of the form (int n, char c), then that of the second method will be of the form (char c, int n)

        // creating object of class
        PrintI_C pic=new PrintI_C();

        // calling methods
        pic.printn(19,'h');
        pic.printn('w',91);

    }
}
