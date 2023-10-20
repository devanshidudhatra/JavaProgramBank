// "Write a Java program to create the following threads:

// - `ChildThread1`: Prints the multiplication table of `n1`. While printing, it should sleep for 0.5 seconds.
// - `ChildThread2`: Prints the multiplication table of `n2`. `ChildThread2` must wait for `ChildThread1` to complete.
// - `MainThread`: Prints the multiplication table of `n3`. Ensure that the main thread waits for `ChildThread1` and `ChildThread2` to complete. Hint: use sleep and join methods."

class ChildThread1 extends Thread {
    private int n1;

    public ChildThread1(int n1) {
        this.n1 = n1;
    }

    @Override
    public void run() {
        System.out.println("ChildThread1: Multiplication Table for " + n1);
        for (int i = 1; i <= 10; i++) {
            System.out.println(n1 + " x " + i + " = " + (n1 * i));
            try {
                Thread.sleep(500); // Sleep for 0.5 seconds
            } catch (InterruptedException e) {
                System.out.println("ChildThread1 was interrupted.");
            }
        }
    }
}

class ChildThread2 extends Thread {
    private int n2;
    private Thread thread1;

    public ChildThread2(int n2, Thread thread1) {
        this.n2 = n2;
        this.thread1 = thread1;
    }

    @Override
    public void run() {
        try {
            thread1.join(); // Wait for ChildThread1 to complete
        } catch (InterruptedException e) {
            System.out.println("ChildThread2 was interrupted while waiting for ChildThread1.");
        }

        System.out.println("ChildThread2: Multiplication Table for " + n2);
        for (int i = 1; i <= 10; i++) {
            System.out.println(n2 + " x " + i + " = " + (n2 * i));
        }
    }
}

public class MultiplicationTableExample {
    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 7;

        ChildThread1 thread1 = new ChildThread1(n1);
        ChildThread2 thread2 = new ChildThread2(n2, thread1);

        thread1.start();
        thread2.start();

        try {
            thread2.join(); // Wait for ChildThread2 to complete
        } catch (InterruptedException e) {
            System.out.println("Main Thread was interrupted.");
        }

        System.out.println("Main Thread finished.");
    }
}
