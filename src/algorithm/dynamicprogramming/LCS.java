package algorithm.dynamicprogramming;

import java.util.Scanner;

public class LCS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] A = sc.nextLine().toCharArray();
        char[] B = sc.nextLine().toCharArray();

        int[][] dp = new int[A.length + 1][B.length + 1];
        for (int i = 1; i <= A.length; i++) {
            for (int j = 1; j <= B.length; j++) {
                if (A[i - 1] == B[j - 1]) dp[i][j] = dp[i - 1][j - 1] + 1;
                else dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        System.out.println(dp[A.length][B.length]);
    }
}

/* input        output
ACAYKP
CAPCAK          4
 */