package algorithm.baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ACM_호텔 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int T = Integer.parseInt(st.nextToken());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(bf.readLine());
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            printRoomNumber(H, N);
        }
    }

    private static void printRoomNumber(int h, int n) {
        int floor = n % h == 0 ? h : n % h;
        int order = (n - 1) / h + 1;
        System.out.println(floor * 100 + order);
    }
}

/* input
2
6 12 10
30 50 72
 */

/* output
402
1203
 */