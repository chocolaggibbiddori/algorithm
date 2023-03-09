package algorithm.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 종이의_개수 {

    private static int a = 0;
    private static int b = 0;
    private static int c = 0;
    private static int[][] A;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        A = new int[n][n];
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) A[i][j] = Integer.parseInt(st.nextToken());
        }

        recursive(n, 0, 0, n, n);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    private static void recursive(int n, int sr, int sc, int er, int ec) {
        if (isOneNumber(sr, sc, er, ec)) {
            switch (A[sr][sc]) {
                case -1 -> a++;
                case 0 -> b++;
                case 1 -> c++;
            }
            return;
        }

        n /= 3;
        recursive(n, sr, sc, er - n * 2, ec - n * 2);
        recursive(n, sr, sc + n, er - n * 2, ec - n);
        recursive(n, sr, sc + n * 2, er - n * 2, ec);

        recursive(n, sr + n, sc, er - n, ec - n * 2);
        recursive(n, sr + n, sc + n, er - n, ec - n);
        recursive(n, sr + n, sc + n * 2, er - n, ec);

        recursive(n, sr + n * 2, sc, er, ec - n * 2);
        recursive(n, sr + n * 2, sc + n, er, ec - n);
        recursive(n, sr + n * 2, sc + n * 2, er, ec);
    }

    private static boolean isOneNumber(int sr, int sc, int er, int ec) {
        int number = A[sr][sc];
        for (int i = sr; i < er; i++)
            for (int j = sc; j < ec; j++)
                if (A[i][j] != number) return false;

        return true;
    }
}

/* input
9
0 0 0 1 1 1 -1 -1 -1
0 0 0 1 1 1 -1 -1 -1
0 0 0 1 1 1 -1 -1 -1
1 1 1 0 0 0 0 0 0
1 1 1 0 0 0 0 0 0
1 1 1 0 0 0 0 0 0
0 1 -1 0 1 -1 0 1 -1
0 -1 1 0 1 -1 0 1 -1
0 1 -1 1 0 -1 0 1 -1
 */

/* output
10
12
11
 */