import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'lowestTriangle' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER trianglebase
     *  2. INTEGER area
     */

    public static int lowestTriangle(int b, int a) {
    // Write your code here
    double h,ai,bi;
    ai=a;
    bi=b;
    h=(Math.ceil((2*ai)/bi));
    int g=(int)h;
return g;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int trianglebase = Integer.parseInt(firstMultipleInput[0]);

        int area = Integer.parseInt(firstMultipleInput[1]);

        int height = Result.lowestTriangle(trianglebase, area);

        bufferedWriter.write(String.valueOf(height));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
