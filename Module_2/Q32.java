package Assignment_Tops.Module_2;

class MyRunnable implements Runnable {

    public void run() {
        System.out.println("Thread is running...");
    }
}

public class Q32 {
    public static void main(String[] args) {
        // creating object of class
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);

        // start  the thread
        thread.start();
    }
}

