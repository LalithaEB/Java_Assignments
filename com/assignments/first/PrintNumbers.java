package first;

//Java program to print numbers between 1 and 100 divisible by 3, 5 and both

public class PrintNumbers {
    public static void main(String[] args) {
        System.out.println("Numbers that are divisible by 3 and 5 between 1 to 100 are: ");
        for (int i = 1; i <= 100; i++) {
            if ((i % 3 == 0) && (i % 5 == 0))
                System.out.print(i + " ");
        }
    }
}
