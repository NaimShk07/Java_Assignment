package Assignment_Tops.Module_2;

abstract class Shape {
    public abstract void RectangleArea(int length, int breadth);

    public abstract void SquareArea(int side);

    public abstract void CircleArea(int radius);
}

class Area extends Shape {
    @Override
    public void RectangleArea(int length, int breadth) {
        System.out.println("Area of rectangle is " + length * breadth);
    }

    @Override
    public void SquareArea(int side) {
        System.out.println("Area of square is " + side * side);
    }

    @Override
    public void CircleArea(int radius) {
        System.out.println("Area of square is " + (radius * radius) / 3.14);
    }
}

public class Q20 {
    public static void main(String[] args) {
        // creating object of classes
        Area rec = new Area();
        Area square = new Area();
        Area circle = new Area();

        // calling all the methods
        rec.RectangleArea(10, 20);
        square.SquareArea(10);
        circle.CircleArea(10);
    }
}

