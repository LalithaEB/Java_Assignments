package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {
    public static void main(String[] args) {

        AverageOfNumbers.average(50, 40);
        Strings.caseConversion();
        CalculateSum.sumOfNum();
        RemoveDuplicates.remove();
        CountStrings.count();
    }
}

class AverageOfNumbers {
    public static void average(int num1, int num2) {
        List<Integer> number = Arrays.asList(num1, num2);

        double average = number.stream().mapToInt(Integer::intValue).average().orElse(0.0);

        System.out.println("Average: " + average);
    }
}

class Strings {
    public static void caseConversion() {
        List<String> colors = Arrays.asList("Red", "Blue", "Green");

        List<String> upper = colors.stream().map(String::toUpperCase).collect(Collectors.toList());
        List<String> lower = colors.stream().map(String::toLowerCase).collect(Collectors.toList());

        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
    }
}

class CalculateSum {
    public static void sumOfNum() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sumOfEven = numbers.stream().filter(x -> x % 2 == 0).mapToInt(Integer::intValue).sum();

        int sumOfOdd = numbers.stream().filter(x -> x % 2 != 0).mapToInt(Integer::intValue).sum();

        System.out.println("Sum of even numbers: " + sumOfEven);
        System.out.println("Sum of odd numbers: " + sumOfOdd);
    }
}

class RemoveDuplicates {
    public static void remove() {
        List<String> letters = Arrays.asList("A", "B", "C", "D", "E", "A", "C");

        List<String> dup = letters.stream().distinct().collect(Collectors.toList());

        System.out.println("Distinct elements are: " + dup);
    }
}

class CountStrings {
    public static void count() {
        List<String> words = Arrays.asList("Dog", "Cat", "Rat", "Yak", "Donkey", "Deer");

        long countOfWords = words.stream().map(String::toLowerCase).filter(x -> x.startsWith("d")).count();

        System.out.println("No of Words start with D (irrespective of case) are: " + countOfWords);
    }
}