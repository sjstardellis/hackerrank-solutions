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



class isAnagram {

    /*
     * Complete the 'isAnagram' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. STRING t
     */

    public static int isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return 0;
        }
        char[] s_char = s.toCharArray();
        char[] t_char = t.toCharArray();

        Arrays.sort(s_char);
        Arrays.sort(t_char);

        // compare the content, not the references
        if (Arrays.equals(s_char, t_char)) {
            return 1;
        } else {
            return 0;
        }
    }

}