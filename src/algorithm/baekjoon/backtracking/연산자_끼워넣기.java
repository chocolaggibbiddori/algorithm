package algorithm.baekjoon.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 연산자_끼워넣기 {

    static int N;
    static int[] A;
    static int[] operators;
    static int max;
    static int min;
    static BufferedReader br;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        AInit();
        operatorsInit();

        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;
        backtracking(1, A[0]);

        System.out.println(max);
        System.out.println(min);
    }

    private static void AInit() throws IOException {
        A = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) A[i] = Integer.parseInt(st.nextToken());
    }

    private static void operatorsInit() throws IOException {
        operators = new int[4];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) operators[i] = Integer.parseInt(st.nextToken());
    }

    private static void backtracking(int AIdx, int answer) {
        if (AIdx == N) {
            max = Math.max(max, answer);
            min = Math.min(min, answer);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (operators[i] > 0) {
                operators[i]--;
                switch (i) {
                    case 0 -> backtracking(AIdx + 1, answer + A[AIdx]);
                    case 1 -> backtracking(AIdx + 1, answer - A[AIdx]);
                    case 2 -> backtracking(AIdx + 1, answer * A[AIdx]);
                    case 3 -> backtracking(AIdx + 1, answer / A[AIdx]);
                }
                operators[i]++;
            }
        }
    }
}

/* input 1
2
5 6
0 0 1 0
 */

/* output 1
30
30
 */

/* input 2
3
3 4 5
1 0 1 0
 */

/* output 2
35
17
 */

/* input 3
6
1 2 3 4 5 6
2 1 1 1
 */

/* output 3
54
-24
 */