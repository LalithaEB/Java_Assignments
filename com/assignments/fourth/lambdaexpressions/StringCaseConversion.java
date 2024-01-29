package lambdaexpressions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringCaseConversion {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Apple", "Banana", "Grapes");

        Function<String, String> upper = str -> str.toUpperCase();
        Function<String, String> lower = str -> str.toLowerCase();

        List<String> upperCaseList = words.stream().map(upper).collect(Collectors.toList());
        List<String> lowerCaseList = words.stream().map(lower).collect(Collectors.toList());

        System.out.println("Uppercase list: " + upperCaseList);
        System.out.println("Lowercase list: " + lowerCaseList);
    }
}
