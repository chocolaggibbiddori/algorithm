package algorithm.baekjoon.dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 가장_긴_증가하는_부분_수열 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        int max = 0;
        int[] A = new int[n];
        int[] dp = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken());

            for (int j = 0; j < i; j++)
                if (A[j] < A[i] && dp[j] >= dp[i]) dp[i] = dp[j] + 1;

            max = Math.max(max, dp[i]);
        }

        System.out.println(max + 1);
    }
}

/* input                output
6
10 20 10 30 20 50       4
 */