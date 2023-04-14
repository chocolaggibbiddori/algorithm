package algorithm.baekjoon.dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 정수_삼각형 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[][] dp = new int[n + 1][n + 1];
        dp[1][1] = Integer.parseInt(st.nextToken());

        for (int i = 2; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= i; j++) {
                int num = Integer.parseInt(st.nextToken());
                dp[i][j] = Math.max(dp[i - 1][j - 1] + num, dp[i - 1][j] + num);
            }
        }

        int max = 0;
        for (int i = 0; i <= n; i++)
            if (dp[n][i] > max) max = dp[n][i];

        System.out.println(max);
    }
}

/* input            output
5
7
3 8
8 1 0
2 7 4 4
4 5 2 6 5           30
 */