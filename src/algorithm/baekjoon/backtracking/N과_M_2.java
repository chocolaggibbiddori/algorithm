package algorithm.baekjoon.backtracking;

import java.util.Scanner;

public class N과_M_2 {

    static int N;
    static int M;
    static int[] A;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        A = new int[N + 1];
        for (int i = 1; i < A.length; i++) A[i] = i;

        dfs("", 0, 1);
    }

    static void dfs(String s, int count, int idx) {
        if (count == M) {
            System.out.println(s);
            return;
        }

        for (int i = idx; i < A.length; i++) {
            dfs(s + A[i] + " ", count + 1, i + 1);
        }
    }
}

/* input 1              output 1
   3 1                  1
                        2
                        3
 */

/* input 2              output 2
   4 2                  1 2
                        1 3
                        1 4
                        2 3
                        2 4
                        3 4
 */

/* input 3              output 3
   4 4                  1 2 3 4
 */