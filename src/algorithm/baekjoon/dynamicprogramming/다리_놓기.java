package algorithm.baekjoon.dynamicprogramming;

import java.util.Scanner;

public class 다리_놓기 {

    static int[][] A;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        A = new int[30][];
        for (int i = 1; i < 30; i++) {
            A[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) A[i][j] = 1;
                else A[i][j] = A[i - 1][j - 1] + A[i - 1][j];
            }
        }

        for (int i = 0; i < T; i++) {
            int r = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(A[n][r]);
        }
    }
}

/* input
3
2 2
1 5
13 29
 */

/* output
1
5
67863915
 */