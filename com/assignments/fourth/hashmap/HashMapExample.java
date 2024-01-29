package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, Integer> map = new HashMap<>();

        MapPrint.printMap(map, scanner);

        MapSize.keyValueCount(map);

        MapCopy.copyMap(map);

        MapRemove.removeMap(map);

        MapChecker.checkMap(map);
    }
}

class MapPrint {
    public static void printMap(HashMap<String, Integer> map, Scanner scanner) {
        System.out.println("Enter the number of key-value pairs (fruits and their prices): ");
        int num = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < num; i++) {
            System.out.println("Enter key " + i + ": ");
            String key = scanner.nextLine();

            System.out.println("Enter value " + i + ": ");
            int value = scanner.nextInt();
            scanner.nextLine();

            map.put(key, value);
        }

        System.out.println("Associating map with keys and values: " + map);
    }
}

class MapSize {
    public static void keyValueCount(HashMap<String, Integer> map) {
        System.out.println("The number of key-value pairs in the hashmap are: " + map.size());
    }
}

class MapCopy {
    public static void copyMap(HashMap<String, Integer> map) {
        HashMap<String, Integer> mapClone = new HashMap<>(map);
        System.out.println("Cloned Hashmap is: " + mapClone);
    }
}

class MapRemove {
    public static void removeMap(HashMap<String, Integer> map) {
        map.clear();
        System.out.println("Hashmap after removal of all key-value pairs: " + map);
    }
}

class MapChecker {
    public static void checkMap(HashMap<String, Integer> map) {
        if (map.isEmpty()) {
            System.out.println("There are no key-value pairs");
        } else {
            System.out.println("There are key value pairs: " + map);
        }
    }
}