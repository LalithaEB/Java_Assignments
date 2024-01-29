package threads;

public class ThreadsExample {
    public static void main(String[] args) {
        PrinterThread thread = new PrinterThread();
        thread.start();

        Thread even = new Thread(new EvenThread());
        Thread odd = new Thread(new OddThread());

        even.start();
        odd.start();
    }
}

class PrinterThread extends Thread {
    public void run() {
        System.out.println("Hello World");
    }
}

class EvenThread implements Runnable {

    @Override
    public void run() {
        System.out.println("Even numbers-");
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }
    }
}

class OddThread implements Runnable {

    @Override
    public void run() {
        System.out.println("Odd numbers-");
        for (int i = 1; i <= 20; i += 2) {
            System.out.println(i);
        }
    }
}