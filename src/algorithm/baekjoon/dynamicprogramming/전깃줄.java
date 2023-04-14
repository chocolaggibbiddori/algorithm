package algorithm.baekjoon.dynamicprogramming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 전깃줄 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Line[] A = new Line[n];
        for (int i = 0; i < n; i++) A[i] = new Line(sc.nextInt(), sc.nextInt());

        Arrays.sort(A, Comparator.comparingInt(a -> a.start));

        int max = 0;
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (A[j].end < A[i].end && dp[j] >= dp[i]) {
                    dp[i] = dp[j] + 1;
                    max = Math.max(max, dp[i]);
                }
            }
        }

        System.out.println(n - max - 1);
    }

    static class Line {
        int start;
        int end;

        public Line(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
}

/* input                output
8
1 8
3 9
2 2
4 1
6 4
10 10
9 7
7 6                     3
 */