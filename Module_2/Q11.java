package Assignment_Tops.Module_2;

class ParentClass{
    public void printMessage(){
        System.out.println("This is a parent class");
    }
}
class ChildClass extends ParentClass{
    public  void printMessage(){
        System.out.println("This is a child class");
    }

}

public class Q11 {
    public static void main(String[] args) {
        // Create a class with a method that prints "This is a parent class" and its subclass with another method that prints "This is child class". Now, create an object for each of the class and call 1 - method of parent class by object of parent class 2 - method of child class by object of child class 3 - method of parent class by object of child class

        // creating objects of class
        ParentClass parent_obj= new ParentClass();
        ChildClass child_obj= new ChildClass();
        ParentClass pfromc_obj=new ChildClass();

        // calling method parent class with object of parent class
        parent_obj.printMessage();

        // calling method child class with object of child class
        child_obj.printMessage();

        // calling method parent class with object of child class
        pfromc_obj.printMessage();







    }
}
