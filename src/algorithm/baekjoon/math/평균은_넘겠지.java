package algorithm.baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 평균은_넘겠지 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(bf.readLine());
            int M = Integer.parseInt(st.nextToken());
            int[] arr = new int[M];
            double avg = 0.0;

            for (int j = 0; j < M; j++) {
                int x = Integer.parseInt(st.nextToken());
                arr[j] = x;
                avg += x;
            }
            avg /= M;

            int count = 0;
            for (int j = 0; j < M; j++) {
                if (arr[j] > avg) count++;
            }

            double percent = count * 100.0 / M;
            System.out.printf("%.3f", percent).println("%");
        }
    }
}

/*
5
5 50 50 70 80 100
7 100 95 90 80 70 60 50
3 70 90 80
3 70 90 81
9 100 99 98 97 96 95 94 93 91
 */

/*
40.000%
57.143%
33.333%
66.667%
55.556%
 */