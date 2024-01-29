package lambdaexpressions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenOdd {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(5, 8, 4, 2, 3, 9, 7, 1, 6, 8, 2);

        List<Integer> even = number.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        List<Integer> odd = number.stream().filter(x -> x % 2 != 0).collect(Collectors.toList());

        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}
