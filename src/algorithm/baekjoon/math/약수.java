package algorithm.baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 약수 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int min = 10000000;
        int max = 0;
        for (int i = 0; i < N; i++) {
            int subMultiple = Integer.parseInt(st.nextToken());
            min = Math.min(min, subMultiple);
            max = Math.max(max, subMultiple);
        }

        System.out.println(min * max);
    }
}

/* input 1                                                      output 1
2
4 2                                                             8
 */

/* input 2                                                      output 2
1
2                                                               4
 */

/* input 3                                                      output 3
6
3 4 2 12 6 8                                                    24
 */

/* input 4                                                      output 4
14
14 26456 2 28 13228 3307 7 23149 8 6614 46298 56 4 92596        185192
 */