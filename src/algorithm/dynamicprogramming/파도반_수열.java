package algorithm.dynamicprogramming;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class 파도반_수열 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        long[] P = new long[101];
        P[1] = P[2] = P[3] = 1;
        for (int i = 4; i < 101; i++) P[i] = P[i - 3] + P[i - 2];

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < T; i++) bw.write(P[sc.nextInt()] + "\n");

        bw.flush();
        bw.close();
    }
}

/* input
2
6
12
 */

/* output
3
16
 */