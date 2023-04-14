package algorithm.baekjoon.dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 연속합 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] dp = new int[n];
        int[] minimums = new int[n];
        dp[0] = Integer.parseInt(st.nextToken());
        minimums[0] = 0;
        for (int i = 1; i < n; i++) {
            dp[i] = dp[i - 1] + Integer.parseInt(st.nextToken());
            minimums[i] = Math.min(minimums[i - 1], dp[i - 1]);
        }

        int max = -100000;
        for (int i = 0; i < n; i++) max = Math.max(max, dp[i] - minimums[i]);

        System.out.println(max);
    }
}

/* input 1                      output 1
10
10 -4 3 1 5 6 -35 12 21 -1      33
 */

/* input 2                      output 2
10
2 1 -4 3 4 -4 6 5 -5 1          14
 */

/* input 3                      output 3
5
-1 -2 -3 -4 -5                  -1
 */