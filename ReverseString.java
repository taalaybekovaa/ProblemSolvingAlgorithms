package Java;

import java.sql.SQLOutput;

public class ReverseString {

    public static String reverse(String toReverse) {
        String reversed = "";
        for (int i = toReverse.length() - 1; i >= 0; i--) {
            reversed = reversed + toReverse.charAt(i);
        }
        return reversed;

    }
}

