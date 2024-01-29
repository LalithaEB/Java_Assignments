package lambdaexpressions;

import java.util.function.Predicate;

public class StringEmptyChecker {
    public static void main(String[] args) {

        StringEmpty.checkString("", "Hello");
    }
}

class StringEmpty {
    public static void checkString(String str1, String str2) {
        Predicate<String> isEmptyCheck = str -> str.isEmpty();

        System.out.println("String 1- '" + str1 + "' is empty?: " + isEmptyCheck.test(str1));
        System.out.println("String 2- '" + str2 + "' is empty?: " + isEmptyCheck.test(str2));
    }
}