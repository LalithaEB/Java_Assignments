package oop;

public class InterfaceExample {
    public static void main(String[] args) {
        // ClothesShopping shopping = new ClothesShopping("Shirts", 4);
        // shopping.print();

        ClothesShopping[] shopping = {
                new ClothesShopping("shirts", 4),
                new ClothesShopping("Pants", 3),
                new ClothesShopping("dresses", 5)
        };
        // iterate the list of items
        for (ClothesShopping shoppingList : shopping) {
            shoppingList.print();
        }
    }

}

// interface - which has only abstract methods (without implementation)
// no need to externally specify with abstract keyword because interface has
// only abstract methods
interface PrintData {
    void print();
}

// class implemting interfaces and also implementing the abstract methods
class ClothesShopping implements PrintData {
    private String itemName;
    private int noOfPieces;

    public ClothesShopping(String itemName, int noOfPieces) {
        // this keyword which refers to current instance variable
        this.itemName = itemName;
        this.noOfPieces = noOfPieces;
    }

    // implement abstract method from interface
    public void print() {
        System.out.println("Item Name: " + itemName + "\nNo of pieces: " + noOfPieces);
    }
}
