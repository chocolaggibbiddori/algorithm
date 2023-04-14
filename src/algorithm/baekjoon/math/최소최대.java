package algorithm.baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최소최대 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        int min = 1000000;
        int max = -1000000;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(st.nextToken());
            min = Math.min(min, n);
            max = Math.max(max, n);
        }

        System.out.println(min + " " + max);
    }
}

/*
5
20 10 35 30 7
 */

/*
7 35
 */