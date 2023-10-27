package algorithm.baekjoon.search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 수_찾기 {

    static int[] A;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        A = new int[N];
        for (int i = 0; i < N; i++) A[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(A);

        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int value = Integer.parseInt(st.nextToken());
            sb.append(binarySearch(value)).append("\n");
        }

        System.out.println(sb);
    }

    static int binarySearch(int value) {
        int startIdx = 0, endIdx = A.length - 1;
        int midIdx;

        do {
            midIdx = (startIdx + endIdx) / 2;
            int midValue = A[midIdx];

            if (value == midValue) {
                return 1;
            }

            if (value < midValue) endIdx = midIdx - 1;
            else startIdx = midIdx + 1;
        } while (midIdx != startIdx && midIdx != endIdx);

        return 0;
    }
}

/* input
5
4 1 5 2 3
5
1 3 7 9 5
 */

/* output
1
1
0
0
1
 */