import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] arr,int n1) {
        int temp=n1;
        int diag1=0,diag2=0,diff;
        for(int i=0;i<temp;i++)
        {
            for(int j=0;j<temp;j++)
            {
                if(i==j)
                {
                    diag1=diag1+arr[i][j];
                }
            }
        }
        for(int i=0;i<temp;i++)
        {
            for(int j=0;j<temp;j++)
            {
                if(i==temp-j-1)
                {
                    diag2=diag2+arr[i][j];
                }
            }
        }

        diff=diag1-diag2;


        return Math.abs(diff);
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = diagonalDifference(arr,n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
