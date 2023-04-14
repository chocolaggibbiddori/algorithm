package algorithm.baekjoon.backtracking;

import java.util.Scanner;

public class N과_M_3 {

    static int N;
    static int M;
    static int[] A;
    static StringBuilder sb;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        A = new int[N + 1];
        for (int i = 1; i < A.length; i++) A[i] = i;

        sb = new StringBuilder();
        dfs("", 0);

        System.out.println(sb);
    }

    static void dfs(String s, int count) {
        if (count == M) {
            sb.append(s).append("\n");
            return;
        }

        for (int i = 1; i < A.length; i++) {
            dfs(s + A[i] + " ", count + 1);
        }
    }
}

/* input 1          output 1
   3 1              1
                    2
                    3
 */

/* input 2          output 2
   4 2              1 1
                    1 2
                    1 3
                    1 4
                    2 1
                    2 2
                    2 3
                    2 4
                    3 1
                    3 2
                    3 3
                    3 4
                    4 1
                    4 2
                    4 3
                    4 4
 */

/* input 3          output 3
   3 3              1 1 1
                    1 1 2
                    1 1 3
                    1 2 1
                    1 2 2
                    1 2 3
                    1 3 1
                    1 3 2
                    1 3 3
                    2 1 1
                    2 1 2
                    2 1 3
                    2 2 1
                    2 2 2
                    2 2 3
                    2 3 1
                    2 3 2
                    2 3 3
                    3 1 1
                    3 1 2
                    3 1 3
                    3 2 1
                    3 2 2
                    3 2 3
                    3 3 1
                    3 3 2
                    3 3 3
 */