package algorithm.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 스타트와_링크 {

    private static int N;
    private static int[][] A;
    private static int min;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        A = new int[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        min = 1 << 30;
        backtracking(new boolean[N], 0, 0);

        System.out.println(min);
    }

    private static void backtracking(boolean[] team, int startIdx, int count) {
        if (count == N / 2) {
            min = Math.min(min, getStatsDiff(team));
            return;
        }

        for (int i = startIdx; i < N; i++) {
            team[i] = true;
            backtracking(team, i + 1, count + 1);
            team[i] = false;
        }
    }

    private static int getStatsDiff(boolean[] team) {
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (team[i] && team[j]) sum1 += A[i][j] + A[j][i];
                else if (!team[i] && !team[j]) sum2 += A[i][j] + A[j][i];
            }
        }

        return Math.abs(sum1 / 2 - sum2 / 2);
    }
}

/* input 1                              output 1
4
0 1 2 3
4 0 5 6
7 1 0 2
3 4 5 0                                 0
 */

/* input 2                              output 2
6
0 1 2 3 4 5
1 0 2 3 4 5
1 2 0 3 4 5
1 2 3 0 4 5
1 2 3 4 0 5
1 2 3 4 5 0                             2
 */

/* input 3                              output 3
8
0 5 4 5 4 5 4 5
4 0 5 1 2 3 4 5
9 8 0 1 2 3 1 2
9 9 9 0 9 9 9 9
1 1 1 1 0 1 1 1
8 7 6 5 4 0 3 2
9 1 9 1 9 1 0 9
6 5 4 3 2 1 9 0                         1
 */