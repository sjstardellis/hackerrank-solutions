package Solutions;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class isAlphabeticPalindrome {

    /*
     * Complete the 'isAlphabeticPalindrome' function below.
     *
     * The function is expected to return a BOOLEAN.
     * The function accepts STRING code as parameter.
     */

    public static boolean isAlphabeticPalindrome(String code) {
        // our new filtered string of just letters
        StringBuilder letters = new StringBuilder();

        // for each loop, converting the string to char array
        for (char l : code.toCharArray()) {
            // if it is a letter, add it to new string
            if (Character.isLetter(l)) {
                letters.append(Character.toLowerCase(l));
            }
        }
        // two pointers
        int p1 = 0;
        int p2 = letters.length()-1;

        while (p1 < p2) {
            // if the characters don't match, return false
            if (letters.charAt(p1) != letters.charAt(p2)) {
                return false;
            }
            // move pointers
            p1++;
            p2--;
        }

        return true;
    }

}
