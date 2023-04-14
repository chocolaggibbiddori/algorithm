package algorithm.baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 행렬_덧셈 {

    static BufferedReader bf;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        bf = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(bf.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[][] A = new int[M][N];
        int[][] B = new int[M][N];

        createMatrix(A, M, N);
        createMatrix(B, M, N);

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(A[i][j] + B[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void createMatrix(int[][] matrix, int row, int col) throws IOException {
        for (int i = 0; i < row; i++) {
            st = new StringTokenizer(bf.readLine());
            for (int j = 0; j < col; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }
}

/* input                output
3 3                     4 4 4
1 1 1                   6 6 6
2 2 2                   5 6 100
0 1 0
3 3 3
4 4 4
5 5 100
 */