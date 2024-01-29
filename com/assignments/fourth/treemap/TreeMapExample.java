package treemap;

import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<String, Integer> map = new TreeMap<>();

        MapPrinter.printMap(map, scanner);

        MapClone.cloneMap(map);

        MapKeySearcher.searchKeyInMap(map, scanner);

        MapValueSearcher.searchValueInMap(map, scanner);

        MapKeysGetter.getAllKeysInMap(map);
    }
}

class MapPrinter {
    public static void printMap(TreeMap<String, Integer> map, Scanner scanner) {
        System.out.println("Enter number of key-value pairs: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < num; i++) {
            System.out.println("Enter key " + i + " : ");
            String key = scanner.nextLine();

            System.out.println("Enter value " + i + " : ");
            int value = scanner.nextInt();
            scanner.nextLine();

            map.put(key, value);
        }
        System.out.println("Updated treemap is: " + map);
    }
}

class MapClone {
    public static void cloneMap(TreeMap<String, Integer> map) {
        // Method-1
        TreeMap<String, Integer> clonedMap = new TreeMap<>();
        clonedMap.putAll(map);
        System.out.println("Cloned TreeMap is: " + clonedMap);

        // Method-2
        TreeMap<String, Integer> clonedMap2 = new TreeMap<>(map);
        System.out.println("Another cloned map is: " + clonedMap2);
    }
}

class MapKeySearcher {
    public static void searchKeyInMap(TreeMap<String, Integer> map, Scanner scanner) {
        System.out.println("Enter key to be searched: ");
        String key = scanner.nextLine();

        if (map.containsKey(key)) {
            System.out.println("Key- " + key + " found in treemap");
        } else {
            System.out.println("Key not found");
        }
    }
}

class MapValueSearcher {
    public static void searchValueInMap(TreeMap<String, Integer> map, Scanner scanner) {
        System.out.println("Enter value to be searched: ");
        int value = scanner.nextInt();

        if (map.containsValue(value)) {
            System.out.println("Value- " + value + " found in treemap");
        } else {
            System.out.println("Value not found");
        }
    }
}

class MapKeysGetter {
    public static void getAllKeysInMap(TreeMap<String, Integer> map) {
        System.out.println("All keys in the treemap are: " + map.keySet());
    }
}