package algorithm.baekjoon.dynamicprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class 이항_계수_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[][] A = new int[N + 1][];
        for (int i = 1; i <= N; i++) {
            A[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) A[i][j] = 1;
                else A[i][j] = (A[i - 1][j - 1] + A[i - 1][j]) % 10007;
            }
        }

        System.out.println(Arrays.deepToString(A));
        System.out.println(A[N][K]);
    }
}

/* input            output
   5 2              10
 */