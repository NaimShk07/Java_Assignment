package Assignment_Tops.Module_2;

class Rectangle{
    protected int length,breadth;

    Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public void printArea(){
        System.out.println("Area of Rectangle: " + (length * breadth));
    }
    public void printPerimeter(){
        System.out.println("Perimeter of Rectangle: " + 2 * (length + breadth));
    }
}

class Square extends Rectangle{

    public Square(int side) {
        super(side, side);
    }

    public void printArea(){
        System.out.println("Area of Square: " + (length * length));
    }
    public void printPerimeter(){
        System.out.println("Perimeter of Square: " + 4 * length);
    }
}

public class Q13 {
    public static void main(String[] args) {
        // creating object of rectangle
        Rectangle rectangle = new Rectangle(5, 10);

        // printing area and perimeter of the rectangle
        rectangle.printArea();
        rectangle.printPerimeter();
        System.out.println();

        // creating object of square
        Square square = new Square(4);

        // printing area and perimeter of the square
        square.printArea();
        square.printPerimeter();

    }
}
