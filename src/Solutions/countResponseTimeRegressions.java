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



class Result {

    /*
     * Complete the 'countResponseTimeRegressions' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY responseTimes as parameter.
     */

    public static int countResponseTimeRegressions(List<Integer> responseTimes) {
        // size of array
        int n = responseTimes.size();
        if (n <= 1)
            return 0;

        // keep track of our changing average
        long sum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            // skip index 0, there is nothing to compare against
            if (i > 0) {
                // calculate the average
                double avg = sum / (double) i;
                // if the current number is greater than the average, add to count
                if (responseTimes.get(i) > avg) {
                    count++;
                }
            }
            // add the new number to the sum
            sum += responseTimes.get(i);
        }
        // return count
        return count;
    }

}

public class countResponseTimeRegressions {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int responseTimesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> responseTimes = IntStream.range(0, responseTimesCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.countResponseTimeRegressions(responseTimes);

        System.out.println(result);

        bufferedReader.close();
    }
}
