package treeset;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

//To store large amounts of stored information and accessed quickly because of its faster access and retrieval time
//insertion of null values gives NullPointerException as the entered values are compared to existing values in the set
//before JDK7 null value can be inserted as the 1st value in the empty treeset

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();

        Scanner scanner = new Scanner(System.in);

        SetAdder.addItems(set, scanner);

        SetIterator.iterateSet(set);

        SetClone.cloneSet(set);

        SetDescender.descendSet(set);

        SetFirstLast.firstLastSet(set);
    }
}

class SetAdder {
    public static void addItems(TreeSet<String> set, Scanner scanner) {
        System.out.println("Enter colors to add to treeset and enter stop if done: ");

        while (true) {
            String color = scanner.nextLine();
            if (color.equalsIgnoreCase("stop")) {
                break;
            } else {
                set.add(color);
            }
        }
        // Elements are sorted
        System.out.println("Colors in treeset are: " + set);
    }
}

class SetIterator {
    public static void iterateSet(TreeSet<String> set) {
        System.out.println("Treeset elements are: ");

        for (String e : set) {
            System.out.println(e);
        }
    }
}

class SetClone {
    public static void cloneSet(TreeSet<String> set) {
        System.out.println("Treeset before cloning: " + set);

        // Method-1
        // TreeSet<String> cloneSet = (TreeSet<String>) set.clone();

        // Method-2
        TreeSet<String> cloneSet = new TreeSet<>();
        cloneSet.addAll(set);

        System.out.println("Clone of existing treeset is: " + cloneSet);
    }
}

class SetDescender {
    public static void descendSet(TreeSet<String> set) {
        System.out.println("Treeset in ascending order is: " + set);

        Iterator<String> iterator = set.descendingIterator();

        System.out.println("Treeset in descending order is: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

class SetFirstLast {
    public static void firstLastSet(TreeSet<String> set) {
        System.out.println("First element in the treeset is: " + set.first());
        System.out.println("Last element in the treeset is: " + set.last());
    }
}