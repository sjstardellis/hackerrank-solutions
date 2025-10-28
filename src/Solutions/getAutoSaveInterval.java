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



class getAutoSaveInterval {

    /*
     * Complete the 'getAutoSaveInterval' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static long getAutoSaveInterval(int n) {
        // base cases in fibonacci sequence
        if (n == 0) return 1;
        if (n == 1) return 2;
        // initialize our values
        long a = 1, b = 2;
        // from 2 to n
        for (int i = 2; i <= n; i++) {
            // sum a and b together
            long temp = a + b;
            // set a to b, b to temp and repeat the summation
            a = b;
            b = temp;
        }
        return b;
    }
}