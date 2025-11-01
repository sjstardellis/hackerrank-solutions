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



class countAffordablePairs {

    /*
     * Complete the 'countAffordablePairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY prices
     *  2. INTEGER budget
     */

    public static int countAffordablePairs(List<Integer> prices, int budget) {
        // number of prices
        int n = prices.size();

        // edge case, no pairs
        if(n < 2) {
            return 0;
        }

        // initialize our pointers and count
        int left = 0;
        int right = n-1;
        int count = 0;

        // while the pointers have not crossed
        while(left < right) {
            // if the price of the left pointer and the right pointer are <= than the budget
            if(prices.get(left) + prices.get(right) <= budget) {
                // take the difference of the two budgets (larger - smaller) and add to count
                count = count + (right-left);
                // move the left pointer to check the next smallest element
                left += 1;
            } else {
                // the budget is too large, move right pointer left
                right -= 1;
            }
        }
        return count;

    }

}
