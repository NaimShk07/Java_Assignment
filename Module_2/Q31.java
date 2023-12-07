package Assignment_Tops.Module_2;

class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException() {
        super("Age should be between 15 and 21.");
    }
}

class NameNotValidException extends Exception {
    public NameNotValidException() {
        super("Name should not contain numbers or special symbols.");
    }
}

class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) {
        try {
            this.rollNo=rollNo;
            setName(name);
            setAge(age);
            this.course = course;
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println(e.getMessage());
        }
    }

    private void setName(String name) throws NameNotValidException {
        // Check if name contains numbers or special symbols
        if (!name.matches("[a-zA-Z]+")) {
            throw new NameNotValidException();
        }
        this.name = name;
    }

    private void setAge(int age) throws AgeNotWithinRangeException {
        // Check if age is within the specified range
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException();
        }
        this.age = age;
    }


}

public class Q31 {
    public static void main(String[] args) {

        int rollNo = 101;
        String name = "JohnDoe";
        int age = 22;
        String course = "Computer Science";

        // creating object of class
        Student student = new Student(rollNo, name, age, course);
    }
}

