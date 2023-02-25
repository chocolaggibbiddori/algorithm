package algorithm.dynamicprogramming;

import java.util.Scanner;

public class 포도주_시식 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] A = new int[n + 3];
        int[] dp = new int[n + 3];
        for (int i = 3; i < n + 3; i++) {
            int num = sc.nextInt();
            A[i] = num;
            dp[i] = Math.max(dp[i - 2] + num, Math.max(dp[i - 3] + A[i - 1] + num, dp[i - 1]));
        }

        System.out.println(Math.max(dp[n + 1], dp[n + 2]));
    }
}

/* input            output
6
6
10
13
9
8
1                   33
 */