package Assignment_Tops.Module_2;

class FindArea{
    public void printArea(int length,int breadth){
        System.out.println("Area of rectangle is "+length*breadth);
    }
    public void printArea(int square){
        System.out.println("Area of square is "+square*square);

    }
}

public class Q10 {
    public static void main(String[] args) {
        // Create a class to print the area of a square and a rectangle. The class has two methods with the same name but different number of parameters. The method for printing area of a rectangle has two parameters which are length and breadth respectively while the other method for printing area of square has one parameter which is side of square

        // creating object of class
        FindArea fa=new FindArea();

        // call different methods
        fa.printArea(10,20);
        fa.printArea(10);


    }
}
