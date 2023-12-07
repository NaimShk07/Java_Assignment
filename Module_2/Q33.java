package Assignment_Tops.Module_2;

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }
}

public class Q33 {
    public static void main(String[] args) {
        // Create an instance of the custom thread
        MyThread myThread = new MyThread();

        // Start the thread
        myThread.start();
    }
}

