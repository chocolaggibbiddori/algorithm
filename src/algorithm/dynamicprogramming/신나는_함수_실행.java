package algorithm.dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 신나는_함수_실행 {

    public static void main(String[] args) throws IOException {
        int[][][] A = new int[21][21][21];
        for (int x = 0; x < 21; x++) {
            for (int y = 0; y < 21; y++) {
                for (int z = 0; z < 21; z++) {
                    if (x == 0 || y == 0 || z == 0) A[x][y][z] = 1;
                    else if (x < y && y < z) A[x][y][z] = A[x][y][z - 1] + A[x][y - 1][z - 1] - A[x][y - 1][z];
                    else A[x][y][z] = A[x - 1][y][z] + A[x - 1][y - 1][z] + A[x - 1][y][z - 1] - A[x - 1][y - 1][z - 1];
                }
            }
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        while (true) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());

            if (x == -1 && y == -1 && z == -1) break;

            sb.append("w(")
                    .append(x).append(", ")
                    .append(y).append(", ")
                    .append(z).append(") = ");

            if (x <= 0 || y <= 0 || z <= 0) {
                x = 0;
                y = 0;
                z = 0;
            } else if (x > 20 || y > 20 || z > 20) {
                x = 20;
                y = 20;
                z = 20;
            }

            sb.append(A[x][y][z]).append("\n");
        }

        System.out.print(sb);
    }
}

/* input
1 1 1
2 2 2
10 4 6
50 50 50
-1 7 18
-1 -1 -1
 */

/* output
w(1, 1, 1) = 2
w(2, 2, 2) = 4
w(10, 4, 6) = 523
w(50, 50, 50) = 1048576
w(-1, 7, 18) = 1
 */