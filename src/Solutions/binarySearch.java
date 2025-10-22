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



class binarySearch {

    /*
     * Complete the 'binarySearch' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY nums
     *  2. INTEGER target
     */

    public static int binarySearch(List<Integer> nums, int target) {
        // boundaries
        int left = 0;
        int right = nums.size() - 1;

        while (left <= right) {
            // calculate middle
            int mid = (left + right) / 2;

            // middle is the target, therefore return the middle
            if (nums.get(mid) == target) {
                return mid;
            // middle is less than target, adjust bounds
            } else if (nums.get(mid) < target) {
                left = mid + 1;
            // middle is greater than target, adjust bounds
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

}