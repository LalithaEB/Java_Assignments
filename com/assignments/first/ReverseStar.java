package first;

//Program on reverse star pattern

public class ReverseStar {
    public static void main(String[] args) {
        System.out.println("Reverse star pattern-");

        int n = 3;
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
