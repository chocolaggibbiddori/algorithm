package algorithm.backtracking;

import java.util.Scanner;

public class N과_M_1 {

    static int N;
    static int M;
    static boolean[] isVisited;
    static int[] A;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        A = new int[N + 1];
        for (int i = 1; i < A.length; i++) A[i] = i;

        isVisited = new boolean[N + 1];
        dfs("", 0);
    }

    static void dfs(String s, int count) {
        if (count == M) {
            System.out.println(s);
            return;
        }

        for (int i = 1; i < A.length; i++) {
            if (isVisited[i]) continue;

            isVisited[i] = true;
            dfs(s + A[i] + " ", count + 1);
            isVisited[i] = false;
        }
    }
}

/* input 1          output 1
   3 1              1
                    2
                    3
 */

/* input 2          output 2
   4 2              1 2
                    1 3
                    1 4
                    2 1
                    2 3
                    2 4
                    3 1
                    3 2
                    3 4
                    4 1
                    4 2
                    4 3
 */

/* input 3          output 3
   4 4              1 2 3 4
                    1 2 4 3
                    1 3 2 4
                    1 3 4 2
                    1 4 2 3
                    1 4 3 2
                    2 1 3 4
                    2 1 4 3
                    2 3 1 4
                    2 3 4 1
                    2 4 1 3
                    2 4 3 1
                    3 1 2 4
                    3 1 4 2
                    3 2 1 4
                    3 2 4 1
                    3 4 1 2
                    3 4 2 1
                    4 1 2 3
                    4 1 3 2
                    4 2 1 3
                    4 2 3 1
                    4 3 1 2
                    4 3 2 1
 */