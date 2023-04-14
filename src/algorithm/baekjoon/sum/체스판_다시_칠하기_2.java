package algorithm.baekjoon.sum;

import java.util.Scanner;

public class 체스판_다시_칠하기_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        String[] A = new String[n];
        for (int i = 0; i < n; i++) A[i] = sc.next();

        int[][] whiteFirst = new int[n + 1][m + 1];
        int[][] blackFirst = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                int diff;
                if ((i + j) % 2 == 0) diff = (A[i - 1].charAt(j - 1) == 'W') ? 0 : 1;
                else diff = (A[i - 1].charAt(j - 1) == 'B') ? 0 : 1;

                whiteFirst[i][j] = whiteFirst[i - 1][j] + whiteFirst[i][j - 1] + diff - whiteFirst[i - 1][j - 1];
                blackFirst[i][j] = blackFirst[i - 1][j] + blackFirst[i][j - 1] + 1 - diff - blackFirst[i - 1][j - 1];
            }
        }

        int min = n * m;
        for (int i = k; i <= n; i++) {
            for (int j = k; j <= m; j++) {
                int w = whiteFirst[i][j] - whiteFirst[i][j - k] - whiteFirst[i - k][j] + whiteFirst[i - k][j - k];
                int b = blackFirst[i][j] - blackFirst[i][j - k] - blackFirst[i - k][j] + blackFirst[i - k][j - k];
                min = Math.min(min, Math.min(w, b));
            }
        }

        System.out.println(min);
    }
}

/* input 1                  output 1
4 4 3
BBBB
BBBB
BBBW
BBWB                        2
 */

/* input 2                  output 2
8 8 8
WBWBWBWB
BWBWBWBW
WBWBWBWB
BWBBBWBW
WBWBWBWB
BWBWBWBW
WBWBWBWB
BWBWBWBW                    1
 */

/* input 3                  output 3
10 13 10
BBBBBBBBWBWBW
BBBBBBBBBWBWB
BBBBBBBBWBWBW
BBBBBBBBBWBWB
BBBBBBBBWBWBW
BBBBBBBBBWBWB
BBBBBBBBWBWBW
BBBBBBBBBWBWB
WWWWWWWWWWBWB
WWWWWWWWWWBWB               30
 */

/* input 4                  output 4
9 23 9
BBBBBBBBBBBBBBBBBBBBBBB
BBBBBBBBBBBBBBBBBBBBBBB
BBBBBBBBBBBBBBBBBBBBBBB
BBBBBBBBBBBBBBBBBBBBBBB
BBBBBBBBBBBBBBBBBBBBBBB
BBBBBBBBBBBBBBBBBBBBBBB
BBBBBBBBBBBBBBBBBBBBBBB
BBBBBBBBBBBBBBBBBBBBBBB
BBBBBBBBBBBBBBBWWWWWWWW     40
 */