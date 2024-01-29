package lambdaexpressions;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class StringConcatenator {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        // Method - 1: using BinaryOperator (takes 2 string operands and concatenate
        // them)

        // BinaryOperator<String> concat = (s1, s2) -> s1.concat(s2);
        // (OR)
        BinaryOperator<String> concat = (s1, s2) -> s1 + s2;

        String concatenatedString = concat.apply(str1, str2);
        System.out.println("Concatenated String is: " + concatenatedString);

        // Method - 2: using BiFunction (takes 2 inputs of any type and return result of
        // any type) & more generic usage
        BiFunction<String, String, String> concat1 = (s1, s2) -> s1 + s2;

        String concatenatedString1 = concat1.apply(str1, str2);

        System.out.println("Concatenated String is: " + concatenatedString1);
    }
}
