package algorithm.baekjoon.math;

import java.io.*;
import java.util.StringTokenizer;

public class 행렬_곱셈 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] A = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) A[i][j] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        st.nextToken();
        int k = Integer.parseInt(st.nextToken());
        int[][] B = new int[k][m];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < k; j++) B[j][i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                int answer = 0;
                for (int l = 0; l < m; l++) answer += A[i][l] * B[j][l];
                bw.write(answer + " ");
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }
}

/* input
3 2
1 2
3 4
5 6
2 3
-1 -2 0
0 0 3
 */

/* output
-1 -2 6
-3 -6 12
-5 -10 18
 */