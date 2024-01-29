package arraylist;

// Program-1: Java program to create an array list, add some colors (strings), and print out the collection
//Program 2: Java program to iterate through all elements in an array list
//Program 3: Java program to insert an element into the array list at the first position
//Program 4: Java program to retrieve an element (at a specified index) from a given array list
//Program 5: Java program to update an array element by the given element
//Program 6: Java program to remove the third element from an array list
//Program 7: Java program to search for an element in an array list
//Program 8: Java program to sort a given array list
//Program 9: Java program to copy one array list into another
//Program 10: Java program to shuffle elements in an array list

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//Add colors to ArrayList and print them
public class ColorsArrayList {
    public static void main(String[] args) {
        // Take input from user using Scanner
        Scanner scanner = new Scanner(System.in);

        // ArrayList of type String
        ArrayList<String> colorsList = new ArrayList<>();

        System.out.println("1. Add some colors (strings), and print out the collection");
        ColorsAdder.addColorsInList(colorsList, scanner);

        System.out.println("2. Iterate through all elements in an array list");
        ColorsIterator.printItemsInList(colorsList);
        /*
         * System.out.
         * println("3. Insert an element into the array list at the first position");
         * ColorsInserter.insertItemAtFirst(colorsList, scanner);
         * 
         * System.out.
         * println("4. Retrieve an element (at a specified index) from a given array list"
         * );
         * ColorsRetriever.retrieveItemInList(colorsList, scanner);
         * 
         * System.out.println("5. Update an array element by the given element");
         * ColorsUpdater.updateItemAtIndex(colorsList, scanner);
         * 
         * System.out.println("6. Remove an element from the array list. ");
         * ColorRemover.removeItemFromList(colorsList, scanner);
         * 
         * System.out.println("7. Search for an element in an array list");
         * ColorSearcher.searchItemInList(colorsList, scanner);
         */
        System.out.println("8. Sort a given array list");
        ColorSorter.sortItemInList(colorsList);

        System.out.println("9. Copy one array list into another");
        CopyArrayList.copyList(colorsList);

        System.out.println("10. Shuffle elements in an array list");
        ShuffleArrayList.shuffleList(colorsList);

        scanner.close();
    }
}

class ColorsAdder {
    static void addColorsInList(ArrayList<String> colorsList, Scanner scanner) {
        System.out.println("Colors in the list are: ");
        ColorsIterator.printItemsInList(colorsList);

        System.out.println("Enter colors and enter 'X' if done: ");
        // while loop runs until condition is true
        while (true) {
            // reading user input from console
            String colors = scanner.nextLine();
            // takes input from user until he enters 'X'
            if (colors.equals("X")) {
                // if user presses X then stop taking input
                break;
            }
            // add colors to the list
            colorsList.add(colors);
        }
        System.out.println("\nUpdated Colors in the list are: ");
        ColorsIterator.printItemsInList(colorsList);
    }
}

class ColorsIterator {
    // iterates through all items in ArrayList
    static void printItemsInList(ArrayList<String> colorsList) {

        if (colorsList.size() == 0) {
            System.out.println("Empty list");
        } else {
            for (String color : colorsList) {
                System.out.println(color);
            }
        }
        System.out.println();
    }
}

class ColorsInserter {
    // insert an element into the array list at the first position
    static void insertItemAtFirst(ArrayList<String> colorsList, Scanner scanner) {
        System.out.println("Colors in the list are: ");
        ColorsIterator.printItemsInList(colorsList);
        // insert an element into the array list at the first position
        System.out.println("Enter item to add 1st in the list: ");
        String item = scanner.nextLine();
        colorsList.add(0, item);

        System.out.println("Colors in the list after inserting 1st item are: ");
        ColorsIterator.printItemsInList(colorsList);
    }
}

class ColorsRetriever {
    // retrieve an element (at a specified index) from a given array list
    static void retrieveItemInList(ArrayList<String> colorsList, Scanner scanner) {
        System.out.println("Colors in the list are: ");
        ColorsIterator.printItemsInList(colorsList);
        while (true) {
            System.out.println("Enter index from 0 to " +
                    (colorsList.size() - 1) + " to retrieve item from specific index: ");
            int index = scanner.nextInt();
            if (isValidIndex(colorsList.size(), index)) {
                System.out.println("The item from index " + index + " is: " + colorsList.get(index));
                System.out.println();
                break;
            } else {
                System.out.println("Index entered is not in specified range.\n");
                scanner.nextLine();
            }
        }
    }

    static boolean isValidIndex(int size, int index) {
        return index >= 0 && index < size;
    }

}

class ColorsUpdater {
    static void updateItemAtIndex(ArrayList<String> colorsList, Scanner scanner) {
        System.out.println("Colors in the list are: ");
        ColorsIterator.printItemsInList(colorsList);

        while (true) {
            System.out.println("Enter the index from 0 to " + (colorsList.size() - 1)
                    + " to update an element: ");

            int index = scanner.nextInt();
            scanner.nextLine();

            if (ColorsRetriever.isValidIndex(colorsList.size(), index)) {
                System.out.println("Enter the new element: ");
                String newElement = scanner.nextLine();
                colorsList.set(index, newElement);

                System.out.println("\nUpdated colors in the list are: ");
                ColorsIterator.printItemsInList(colorsList);
                break;
            } else {
                System.out.println("Invalid index.");
            }
        }
    }
}

class ColorRemover {
    static void removeItemFromList(ArrayList<String> colorsList, Scanner scanner) {
        System.out.println("Colors in the list are: ");
        ColorsIterator.printItemsInList(colorsList);

        while (true) {
            System.out.println("Enter index from 0 to " + (colorsList.size() - 1)
                    + ": ");
            int index = scanner.nextInt();
            if (ColorsRetriever.isValidIndex(colorsList.size(), index)) {
                colorsList.remove(index);

                System.out.println("\nUpdated colors in the list are: ");
                ColorsIterator.printItemsInList(colorsList);
                break;
            } else {
                System.out.println("Invalid index\n");
            }
        }
    }
}

class ColorSearcher {
    static void searchItemInList(ArrayList<String> colorsList, Scanner scanner) {
        System.out.println("Colors in the list are: ");
        ColorsIterator.printItemsInList(colorsList);

        System.out.println("Enter item to search: ");
        String searchItem = scanner.nextLine();

        if (colorsList.contains(searchItem)) {
            System.out.println("Item found in the list at index: " + colorsList.indexOf(searchItem));
        } else {
            System.out.println("Item not found");
        }
    }
}

class ColorSorter {
    static void sortItemInList(ArrayList<String> colorsList) {
        System.out.println("Colors in the list are: ");
        ColorsIterator.printItemsInList(colorsList);

        if (colorsList.isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        Collections.sort(colorsList);

        System.out.println("Updated Colors in the list are: ");
        ColorsIterator.printItemsInList(colorsList);
    }
}

class CopyArrayList {
    static void copyList(ArrayList<String> colorsList) {
        System.out.println("Colors in the original list are: ");
        ColorsIterator.printItemsInList(colorsList);

        // Method1- using ArrayList constructor
        ArrayList<String> copiedList1 = new ArrayList<>(colorsList);
        System.out.println("Updated Colors in the copiedList1 are: ");
        ColorsIterator.printItemsInList(copiedList1);

        // Method2 - using addAll method
        ArrayList<String> copiedList2 = new ArrayList<>();
        copiedList2.addAll(colorsList);
        System.out.println("Updated Colors in the copiedList2 are: ");
        ColorsIterator.printItemsInList(copiedList2);
    }
}

class ShuffleArrayList {
    static void shuffleList(ArrayList<String> colorsList) {
        System.out.println("Colors in the original list are: ");
        ColorsIterator.printItemsInList(colorsList);

        Collections.shuffle(colorsList);

        System.out.println("Shuffled Colors in the colorsList are: ");
        ColorsIterator.printItemsInList(colorsList);
    }
}