package Assignment_Tops.Module_2;

public class Q29 {
    public static void main(String[] args) {
        int age=16;
        // calling method
        validate(age);
    }
    public static void validate(int age){
        // if age is less than 18 throw arithmeticException err
        if (age<18){
            throw new ArithmeticException("Not valid");
        }
        else{
            System.out.println("Welcome to vote");
        }
    }

}
