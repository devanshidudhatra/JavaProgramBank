/*
WAP to create the following Threads :
main Thread : prints greeting message with Thread name from 501 to 700.
child Thread1 : prints the value from 1 to 250 with name.(create Thread by extending Thread class)
child Thread2 : prints value from 250 to 500.(create Thread by implementing Runnable Interface)
*/

class ChildThread1 extends Thread {
    public ChildThread1(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 250; i++) {
            System.out.println(getName() + ": " + i);
        }
    }
}

class ChildThread2 implements Runnable {
    @Override
    public void run() {
        for (int i = 251; i <= 500; i++) {
            System.out.println("Child Thread2: " + i);
        }
    }
}

public class MainThreadExample {
    public static void main(String[] args) {
        for (int i = 501; i <= 700; i++) {
            System.out.println("Main Thread: " + i);
        }

        ChildThread1 thread1 = new ChildThread1("Child Thread1");
        Thread thread2 = new Thread(new ChildThread2(), "Child Thread2");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main Thread was interrupted.");
        }

        System.out.println("Main Thread finished.");
    }
}
