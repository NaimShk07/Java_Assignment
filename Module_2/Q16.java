package Assignment_Tops.Module_2;

abstract class Parent {
    public abstract void message();
}

class FirstSubClass extends Parent {
    @Override
    public void message() {
        System.out.println("This is the first subclass");
    }
}

class SecSubClass extends Parent {
    @Override
    public void message() {
        System.out.println("This is the second subclass");
    }
}

public class Q16 {
    public static void main(String[] args) {
        FirstSubClass first_obj = new FirstSubClass();
        first_obj.message();

        SecSubClass sec_obj = new SecSubClass();
        sec_obj.message();

    }
}
