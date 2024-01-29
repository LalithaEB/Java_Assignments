package lambdaexpressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortStrings {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("Belt", "Chain", "Lock", "Keys");

        Collections.sort(str, (str1, str2) -> str1.compareTo(str2));

        System.out.println("Sorted strings list: " + str);
    }
}
