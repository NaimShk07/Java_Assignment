package Assignment_Tops.Module_2;

class TestThreadTwice1 extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class Q35 {
    public static void main(String[] args) {
        TestThreadTwice1 t1 = new TestThreadTwice1();

        // start the thread  first time
        t1.start();

        // starting thread again
        t1.start();  // This will throw IllegalThreadStateException err
    }
}

