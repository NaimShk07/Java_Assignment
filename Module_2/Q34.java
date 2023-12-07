package Assignment_Tops.Module_2;

class MyRunnable2 implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("Thread is running");
                // sleep for 2000 milliseconds
                Thread.sleep(2000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Q34 {
    public static void main(String[] args) {
        // creating two object of MyRunnable
        MyRunnable2 myRunnable1 = new MyRunnable2();

        Thread thread1 = new Thread(myRunnable1);

        // thread start
        thread1.start();
    }
}

