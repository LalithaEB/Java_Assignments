package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);

        LinkedListAppender.appendToEndOfList(linkedList, scanner);

        // LinkedListIterator.iterateList(linkedList);

        // LinkedListPositionIterator.startPositionIterate(linkedList, scanner);

        // LinkedListReverser.iterateReverseList(linkedList);

        // ListSpecificPositionAdd.addAtSpecificPosition(linkedList, scanner);

        // ListInsertFirstAndLast.insertAtFirstAndLast(linkedList, scanner);

        ListFrontInserter.itemInsertAtFront(linkedList, scanner);

        ListLastInserter.itemInsertAtLast(linkedList, scanner);

        // ListElementsAdder.insertItemsAtPosition(linkedList, scanner);

        // ListOccurances.itemOccurances(linkedList, scanner);

    }
}

class LinkedListAppender {
    public static void appendToEndOfList(LinkedList<String> linkedList, Scanner scanner) {
        System.out.println("Linked list items are: " + linkedList);
        System.out.println("Enter strings to append or stop if done: ");
        while (true) {
            String addElement = scanner.nextLine();
            if (addElement.equalsIgnoreCase("stop")) {
                break;
            } else {
                linkedList.addLast(addElement);
            }
        }
        System.out.println("New linked list items are: " + linkedList);
    }
}

class LinkedListIterator {
    public static void iterateList(LinkedList<String> linkedList) {
        System.out.println("Items in list are: ");
        if (linkedList.size() == 0) {
            System.out.println("Empty list");
        } else {
            for (String list : linkedList) {
                System.out.println(list);
            }
        }
    }
}

class LinkedListPositionIterator {
    public static void startPositionIterate(LinkedList<String> linkedList, Scanner scanner) {
        System.out.println("Enter position to iterate from: ");
        int position = scanner.nextInt();
        ListIterator<String> iterator = linkedList.listIterator(position);

        System.out.println("New List starting from position " + position + " :");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

class LinkedListReverser {
    public static void iterateReverseList(LinkedList<String> linkedList) {
        System.out.println("Linked list in reverse order: ");
        Iterator<String> reverseIterator = linkedList.descendingIterator();

        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }
    }
}

class ListSpecificPositionAdd {
    public static void addAtSpecificPosition(LinkedList<String> linkedList, Scanner scanner) {
        System.out.println("Enter position to insert: ");
        int position = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter item to insert at " + position + ": ");
        String item = scanner.nextLine();

        linkedList.add(position, item);
        System.out.println(linkedList);

    }
}

class ListInsertFirstAndLast {
    public static void insertAtFirstAndLast(LinkedList<String> linkedList, Scanner scanner) {
        System.out.println("Enter item to add 1st of list: ");
        String firstItem = scanner.nextLine();

        System.out.println("Enter item to add last of list: ");
        String lastItem = scanner.nextLine();

        linkedList.addFirst(firstItem);
        linkedList.addLast(lastItem);
        System.out.println("New Linked list is: " + linkedList);
    }
}

class ListFrontInserter {
    public static void itemInsertAtFront(LinkedList<String> linkedList, Scanner scanner) {
        System.out.println("Enter item to add at front: ");
        String frontItem = scanner.nextLine();

        linkedList.offerFirst(frontItem);
        System.out.println("New Linked list: " + linkedList);
    }
}

class ListLastInserter {
    public static void itemInsertAtLast(LinkedList<String> linkedList, Scanner scanner) {
        System.out.println("Enter item to add at last: ");
        String lastItem = scanner.nextLine();

        linkedList.offerLast(lastItem);
        System.out.println("New Linked list: " + linkedList);
    }
}

class ListElementsAdder {
    public static void insertItemsAtPosition(LinkedList<String> linkedList, Scanner scanner) {
        System.out.println("Enter position to add items: ");
        int position = scanner.nextInt();

        System.out.println("Enter number of elements to add: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        LinkedList<String> iterator = new LinkedList<>();
        if (position > linkedList.size()) {
            System.out.println("Position is wrong");
            return;
        }

        for (int i = 0; i < num; i++) {
            System.out.println("Enter elements to add at " + (position + i) + ": ");
            String item = scanner.nextLine();
            iterator.add(item);
        }

        linkedList.addAll(position, iterator);
        System.out.println("New Linked list: " + linkedList);
    }
}

class ListOccurances {
    public static void itemOccurances(LinkedList<String> linkedList, Scanner scanner) {
        System.out.println("Enter item to find occurance: ");
        String item = scanner.nextLine();

        int firstIndex = linkedList.indexOf(item);
        int lastIndex = linkedList.lastIndexOf(item);
        System.out.println(
                "The item " + item + " 1st occured at index " + firstIndex + " and last occured at index " + lastIndex);
    }
}