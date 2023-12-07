package Assignment_Tops.Module_2;

class Shape1 {
    public void printShape() {
        System.out.println("This is a shape");
    }
}

class Rectangle1 extends Shape1 {
    public void printRectangle() {
        System.out.println("This is a rectangular shape");
    }
}

class Circle1 extends Shape1 {
    public void printCircle() {
        System.out.println("This is a circular shape");
    }
}

class Square1 extends Rectangle1 {
    public void printSquare() {
        System.out.println("Square is a rectangle");
    }
}

public class Q22 {
    public static void main(String[] args) {
        // creating an object of square class
        Square1 square = new Square1();

        // calling methods of shape and rectangle using the object of square class
        square.printShape();
        square.printRectangle();
    }
}

