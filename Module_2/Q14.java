package Assignment_Tops.Module_2;

class Triangle {
    private double side1,side2,side3;

    public Triangle() {
        side1 = 3;
        side2 = 4;
        side3 = 5;
    }

    public void printArea() {
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        System.out.println("Area of Triangle: " + area);
    }

    public void printPerimeter() {
        double perimeter = side1 + side2 + side3;
        System.out.println("Perimeter of Triangle: " + perimeter);
    }
}

public class Q14 {
    public static void main(String[] args) {
        // creating object of Triangle
        Triangle triangle = new Triangle();

        // print area and perimeter
        triangle.printArea();
        triangle.printPerimeter();
    }
}

