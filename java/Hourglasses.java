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



public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }

        int maxNumber = Integer.MIN_VALUE;
        for(int x = 0; x < 4;x++){
            for(int j = 0;j < 4;j++){
                int sum = arr[x][j] + arr[x][j+1] + arr[x][j+2];
                sum += arr[x+1][j+1];
                sum += arr[x+2][j] + arr[x+2][j+1] + arr[x+2][j+2];
                if(sum > maxNumber) {
                    maxNumber = sum;
                }
            }
        }
        System.out.println(maxNumber);
    }
}
