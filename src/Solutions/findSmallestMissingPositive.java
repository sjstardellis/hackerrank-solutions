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



public class findSmallestMissingPositive {

    /*
     * Complete the 'findSmallestMissingPositive' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY orderNumbers as parameter.
     */

    public static int findSmallestMissingPositive(List<Integer> orderNumbers) {
        // sort the list
        List<Integer> sorted = new ArrayList<>(orderNumbers);
        Collections.sort(sorted);

        // remove non-positives
        List<Integer> positives = sorted.stream()
                .filter(n -> n > 0)
                .toList();
        // keep track of smallest number, default is 1
        int smallest = 1;
        // each number in the list
        for (int n : positives) {
            // if the smallest number matches the current number at the index, increment the smallest number
            if (n == smallest) {
                smallest++;
                // if the smallest number is less than the current number in the list, that means there is a missing number
            } else if (n > smallest) {
                return smallest;
            }
        }
        return smallest;
    }

}
