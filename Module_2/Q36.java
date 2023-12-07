package Assignment_Tops.Module_2;

class TestMultiPriority1 extends Thread {
    public void run() {
        System.out.println("Thread Name: " + Thread.currentThread().getName());
        System.out.println("Thread Priority: " + Thread.currentThread().getPriority());
    }
}

public class Q36 {
    public static void main(String[] args) {
        // Create two object of TestMultiPriority1
        TestMultiPriority1 m1 = new TestMultiPriority1();
        TestMultiPriority1 m2 = new TestMultiPriority1();

        // setting names and priorities
        m1.setName("mythread-1");
        m2.setName("mythread-2");
        m1.setPriority(Thread.MIN_PRIORITY);
        m2.setPriority(Thread.MAX_PRIORITY);

        // starting the threads
        m1.start();
        m2.start();
    }
}

