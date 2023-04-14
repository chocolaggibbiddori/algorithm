package algorithm.baekjoon.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 색종이_만들기 {

    private static int[][] A;
    private static int white = 0;
    private static int blue = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st;
        A = new int[n][n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) A[i][j] = Integer.parseInt(st.nextToken());
        }

        recursive(n, 0, 0, n, n);

        System.out.println(white);
        System.out.println(blue);
    }

    private static void recursive(int n, int sr, int sc, int er, int ec) {
        if (isOneColor(sr, sc, er, ec)) {
            if (A[sr][sc] == 0) white++;
            else blue++;
            return;
        }

        n /= 2;
        recursive(n, sr, sc, er - n, ec - n);
        recursive(n, sr, sc + n, er - n, ec);
        recursive(n, sr + n, sc, er, ec - n);
        recursive(n, sr + n, sc + n, er, ec);
    }

    private static boolean isOneColor(int sr, int sc, int er, int ec) {
        int color = A[sr][sc];
        for (int i = sr; i < er; i++)
            for (int j = sc; j < ec; j++)
                if (A[i][j] != color) return false;

        return true;
    }
}

/* input
8
1 1 0 0 0 0 1 1
1 1 0 0 0 0 1 1
0 0 0 0 1 1 0 0
0 0 0 0 1 1 0 0
1 0 0 0 1 1 1 1
0 1 0 0 1 1 1 1
0 0 1 1 1 1 1 1
0 0 1 1 1 1 1 1
 */

/* output
9
7
 */