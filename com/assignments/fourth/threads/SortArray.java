package threads;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SortArray {
    public static void main(String[] args) throws InterruptedException {
        int[] array = { 4, 8, 5, 2, 1, 7, 9, 6, 3, 5 };
        bubbleSortArray(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    public static void bubbleSortArray(int[] array) throws InterruptedException {
        int splitArray = array.length / 2;

        Thread thread1 = new Thread(new BubbleSort(array, 0, splitArray));
        Thread thread2 = new Thread(new BubbleSort(array, splitArray, array.length));

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        merge(array, 0, splitArray, array.length);
    }

    private static void merge(int[] array, int left, int mid, int right) {
        int[] temp = Arrays.copyOfRange(array, left, right);

        int[] mergedArray = IntStream.concat(Arrays.stream(Arrays.copyOfRange(temp, 0, mid - left)),
                Arrays.stream(Arrays.copyOfRange(temp, mid - left, right - left))).sorted().toArray();

        System.arraycopy(mergedArray, 0, array, left, mergedArray.length);
    }
}

class BubbleSort implements Runnable {

    private final int[] array;
    private final int start;
    private final int end;

    public BubbleSort(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        bubbleSorting(array, start, end);
    }

    static void bubbleSorting(int[] array, int start, int end) {
        for (int i = start; i < end - 1; i++) {
            for (int j = start; j < end - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
