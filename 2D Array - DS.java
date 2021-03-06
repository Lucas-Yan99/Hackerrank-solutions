import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public Solution(){
        
    }
    static int prev;
    static int ans = -99999;
    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        for (int i = 0; i < 4; i ++){
            for ( int y = 0; y < 4; y++){
                prev = arr[i][y] + arr[i][y+1] + arr[i][y+2] + arr[i+1][y+1] + arr[i+2][y] + arr[i+2][y+1] + arr[i+2][y+2];
                if (prev > ans) ans = prev;
            }
        }
        return ans;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
