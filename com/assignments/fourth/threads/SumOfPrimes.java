package threads;

public class SumOfPrimes {
    public static void main(String[] args) throws InterruptedException {
        int limit = 10;
        int numOfThreads = 2;

        long sum = sumOfPrimes(limit, numOfThreads);
        System.out.println("Sum of prime numbers upto " + limit + " numbers is: " + sum);
    }

    public static long sumOfPrimes(int limit, int numOfThreads) throws InterruptedException {
        CalculatePrimeThread[] thread = new CalculatePrimeThread[numOfThreads];

        for (int i = 0; i < numOfThreads; i++) {
            int start = i * (limit / numOfThreads) + 1;
            int end = (i + 1) * (limit / numOfThreads);

            thread[i] = new CalculatePrimeThread(start, end);
            thread[i].start();
        }

        long sum = 0;
        for (CalculatePrimeThread thread1 : thread) {
            thread1.join();
            sum += thread1.getSum();
        }
        return sum;
    }
}

class CalculatePrimeThread extends Thread {
    private final int start;
    private final int end;
    private long sum;

    public CalculatePrimeThread(int start, int end) {
        this.start = start;
        this.end = end;
        this.sum = 0;
    }

    public long getSum() {
        return sum;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
    }

    private boolean isPrime(int num) {
        if (num <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
