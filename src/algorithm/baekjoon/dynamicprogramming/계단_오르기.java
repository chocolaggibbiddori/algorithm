package algorithm.baekjoon.dynamicprogramming;

import java.util.Scanner;

public class 계단_오르기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //10 20 15 25 10 20
        int[] A = new int[n + 1];
        for (int i = 1; i <= n; i++) A[i] = sc.nextInt();

        if (n == 1) {
            System.out.println(A[1]);
            return;
        }
        if (n == 2) {
            System.out.println(A[1] + A[2]);
            return;
        }

        int[] dp = new int[n + 1];
        dp[1] = A[1];
        dp[2] = A[1] + A[2];
        for (int i = 3; i <= n; i++) {
            dp[i] = Math.max(dp[i - 2] + A[i], dp[i - 3] + A[i - 1] + A[i]);
        }

        System.out.println(dp[n]);
    }
}

/* input            output
6
10
20
15
25
10
20                  75
 */