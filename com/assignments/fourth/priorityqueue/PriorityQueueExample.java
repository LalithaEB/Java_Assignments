package priorityqueue;

import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Iterator;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PriorityQueue<String> pQueue = new PriorityQueue<>();

        QueueAdder.printQueue(pQueue, scanner);

        QueueIterator.iterateQueue(pQueue);

        QueueClone.cloneQueue(pQueue);

        QueueInserter.insertIntoQueue(pQueue, scanner);

        QueueRemover.removeElements(pQueue);
    }
}

class QueueAdder {
    public static void printQueue(PriorityQueue<String> pqueue, Scanner scanner) {
        System.out.println("Enter colors and enter stop if done: ");

        while (true) {
            String color = scanner.nextLine();
            if (color.equalsIgnoreCase("stop")) {
                break;
            } else {
                pqueue.add(color);
            }
        }
        System.out.println("Colors in the priority queue are: " + pqueue);
    }
}

class QueueIterator {
    public static void iterateQueue(PriorityQueue<String> pqueue) {
        System.out.println("Colors iterate in priority queue-");

        // Method-1
        Iterator<String> iterator = pqueue.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Method-2
        // for (String e : pqueue) {
        // System.out.println(e);
        // }
    }
}

class QueueClone {
    public static void cloneQueue(PriorityQueue<String> pqueue) {

        // Method-1
        PriorityQueue<String> clonedPQueue = new PriorityQueue<>(pqueue);
        System.out.println("Colors in cloned priority queue are: " + clonedPQueue);

        // Method-2
        // PriorityQueue<String> clonedPQueue = new PriorityQueue<>();
        // clonedPQueue.addAll(pqueue);
        // System.out.println("Colors in cloned priority queue are: " + clonedPQueue);
    }
}

class QueueInserter {
    public static void insertIntoQueue(PriorityQueue<String> pqueue, Scanner scanner) {
        System.out.println("Enter element into priority queue: ");
        String item = scanner.nextLine();

        pqueue.add(item);
        System.out.println("Updated priority queue is: " + pqueue);
    }
}

class QueueRemover {
    public static void removeElements(PriorityQueue<String> pqueue) {
        pqueue.clear();
        System.out.println("Priority queue after removing elements: " + pqueue);
    }
}