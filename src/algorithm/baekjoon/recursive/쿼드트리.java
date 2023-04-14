package algorithm.baekjoon.recursive;

import java.util.Scanner;

public class 쿼드트리 {

    private static StringBuilder sb = new StringBuilder();
    private static int[][] A;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        A = new int[n][n];

        for (int i = 0; i < n; i++) {
            char[] chars = sc.next().toCharArray();
            for (int j = 0; j < n; j++) A[i][j] = chars[j] - '0';
        }

        recursive(n, 0, 0, n, n);
        System.out.println(sb);
    }

    private static void recursive(int n, int sr, int sc, int er, int ec) {
        if (isOneColor(sr, sc, er, ec)) {
            sb.append(A[sr][sc]);
            return;
        }

        n /= 2;
        sb.append("(");
        recursive(n, sr, sc, er - n, ec - n);
        recursive(n, sr, sc + n, er - n, ec);
        recursive(n, sr + n, sc, er, ec - n);
        recursive(n, sr + n, sc + n, er, ec);
        sb.append(")");
    }

    private static boolean isOneColor(int sr, int sc, int er, int ec) {
        int color = A[sr][sc];
        for (int i = sr; i < er; i++)
            for (int j = sc; j < ec; j++)
                if (A[i][j] != color) return false;

        return true;
    }
}

/* input                output
8
11110000
11110000
00011100
00011100
11110000
11110000
11110011
11110011                ((110(0101))(0010)1(0001))
 */