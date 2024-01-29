package lambdaexpressions;

import java.util.Arrays;
import java.util.List;

public class AverageOfDoubles {
    public static void main(String[] args) {
        List<Double> number = Arrays.asList(1.2, 4.5, 8.9, 5.6, 7.3);

        double average = number.stream().mapToDouble(d -> d).average().orElse(0.0);

        System.out.println("Average of list of doubles is: " + average);
    }
}
