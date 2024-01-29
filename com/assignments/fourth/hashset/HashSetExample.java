package hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

//Program1: Java program to append the specified element to the end of a hash set

public class HashSetExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashSet<String> set = new HashSet<>();

        SetAppender.appendSet(set, scanner);

        SetIterator.iterateSet(set);

        SetCount.countSet(set);

        SetEmptier.emptySet(set);

        SetEmptyCheck.checkEmptySet(set);
    }
}

class SetAppender {
    public static void appendSet(HashSet<String> set, Scanner scanner) {
        System.out.println("Enter items to append to hashset and enter stop if done : ");

        while (true) {
            String item = scanner.nextLine();

            if (item.equalsIgnoreCase("stop")) {
                break;
            } else {
                set.add(item);
            }
        }
        System.out.println("Elements in hashset are: " + set);
    }
}

class SetIterator {
    public static void iterateSet(HashSet<String> set) {
        System.out.println("Elements in the hashset are: ");
        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // for (String e : set) {
        // System.out.println(e);
        // }
    }
}

class SetCount {
    public static void countSet(HashSet<String> set) {
        System.out.println("Number of elements in hashset are: " + set.size());
    }
}

class SetEmptier {
    public static void emptySet(HashSet<String> set) {
        System.out.println("Hash set is emptied");
        set.clear();
        System.out.println("Hashset after emptying is: " + set);
    }
}

class SetEmptyCheck {
    public static void checkEmptySet(HashSet<String> set) {
        if (set.isEmpty()) {
            System.out.println("Hashset is empty");
        } else {
            System.out.println("");
        }
    }
}