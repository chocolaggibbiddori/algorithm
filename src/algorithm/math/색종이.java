package algorithm.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 색종이 {

    static BufferedReader bf;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        bf = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());

        boolean[][] whitePaper = new boolean[100][100];
        for (int t = 0; t < N; t++) {
            st = new StringTokenizer(bf.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for (int i = x; i < x + 10 && i < 100; i++) {
                for (int j = y; j < y + 10 && y < 100; j++) {
                    whitePaper[i][j] = true;
                }
            }
        }

        int sum = 0;
        for (boolean[] w : whitePaper) {
            for (boolean area : w) {
                if (area) sum++;
            }
        }

        System.out.println(sum);
    }
}

/* input
3
3 7
15 7
5 2
 */

/* output
260
 */