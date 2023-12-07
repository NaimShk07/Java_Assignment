package Assignment_Tops.Module_2;

abstract class Marks {
    public abstract int getPercentage();
}

class A extends Marks {
    private int sub1, sub2, sub3;

    public A(int sub1, int sub2, int sub3) {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }

    @Override
    public int getPercentage() {
        return (sub1 + sub2 + sub3) / 3;
    }
}

class B extends Marks {
    private int sub1, sub2, sub3, sub4;

    public B(int sub1, int sub2, int sub3, int sub4) {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.sub4 = sub4;
    }

    @Override
    public int getPercentage() {
        return (sub1 + sub2 + sub3 + sub4) / 4;
    }
}

public class Q18 {
    public static void main(String[] args) {
        // creating object of class
        A studentA = new A(80, 80, 80);
        B studentB = new B(75, 85, 90, 88);

        // percentage of both students
        System.out.println("Percentage of Student A: " + studentA.getPercentage() + "%");
        System.out.println("Percentage of Student B: " + studentB.getPercentage() + "%");
    }
}
