package Assignment_Tops.Module_2;

class Member {
    private String name;
    private int age;
    private long phoneNumber;
    private String address;
    private double salary;

    public Member(String name, int age, long phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    public void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member {
    private String specialization;

    public Employee(String name, int age, long phoneNumber, String address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }

    @Override
    public void printSalary() {
        super.printSalary();
        System.out.println("Specialization: " + specialization);
    }
}

class Manager extends Member {
    private String department;

    public Manager(String name, int age, long phoneNumber, String address, double salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }

    @Override
    public void printSalary() {
        super.printSalary();
        System.out.println("Department: " + department);
    }
}

public class Q12 {
    public static void main(String[] args) {
        Member employee = new Employee("Ram", 25, 9876543210L, "Noida", 25000, "Software Engineer");
        Member manager = new Manager("Shyam", 30, 8765432109L, "Delhi", 40000, "IT");

        employee.printSalary();
        System.out.println();

        manager.printSalary();
    }
}
