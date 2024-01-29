package lambdaexpressions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueIntegers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4, 8, 5, 7, 4, 8, 6, 2, 5, 2);

        List<Integer> uniqueNumbers = numbers.stream().distinct().collect(Collectors.toList());

        System.out.println("After removing duplicate integers: " + uniqueNumbers);
    }
}
