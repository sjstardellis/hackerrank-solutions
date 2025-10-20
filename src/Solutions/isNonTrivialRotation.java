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



class isNonTrivialRotation {

    /*
     * Complete the 'isNonTrivialRotation' function below.
     *
     * The function is expected to return a BOOLEAN.
     * The function accepts following parameters:
     *  1. STRING s1
     *  2. STRING s2
     */

    public static boolean isNonTrivialRotation(String s1, String s2) {
        // check if the two strings are the same length
        if(s1.length() != s2.length()) {
            return false;
        }
        // can't have the exact same string
        if(s1.equals(s2)) {
            return false;
        }
        // make a new string that is concatenating with itself.
        String concat = s1 + s1;
        // now if there is a possible rotation, then s2 should be in this new string
        return concat.contains(s2);
    }

}

