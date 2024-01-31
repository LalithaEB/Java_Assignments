package first;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hotel Menu");

        String[] items = {
                "Veg Spring rolls", "Chilli Paneer", "Crispy Babycorn",
                "Chicken", "Fish", "Sushi",
                "Tropical punch", "Pina Colada", "Cranberry sangria"
        };

        int[] prices = {
                200, 220, 180, 250, 280, 320, 100, 120, 150
        };

        for (int i = 0; i < items.length; i++) {
            System.out.println((i + 1) + "- " + items[i] + "  -Rs." + prices[i]);
        }

        List<Integer> orders = new ArrayList<>();
        int orderNum;

        while (true) {
            System.out.println("Please enter yout order number 1-" + items.length
                    + " and 0 for no order and -1 if finished ordering: ");
            orderNum = scanner.nextInt();

            if (orderNum == 0) {
                System.out.println("No order is placed.");
                break;
            } else if (orderNum > 0 && orderNum <= items.length) {
                orders.add(orderNum - 1);
            } else if (orderNum == -1) {
                break;
            } else {
                System.out.println("Invalid number.");
            }
        }
        System.out.println("Your orders:");
        for (int o : orders) {
            System.out.println("Item: " + items[o - 1]);
            System.out.println("Price: " + prices[o - 1]);
        }
        scanner.close();
    }
}
