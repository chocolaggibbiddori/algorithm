package algorithm.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 병합_정렬_1 {

    static int answer = 0;
    static int K;
    static int[] tmp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        tmp = new int[A.length];
        merge_sort(A, 0, A.length - 1);

        System.out.println(answer == 0 ? -1 : answer);
    }

    private static void merge_sort(int[] A, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            merge_sort(A, p, q);
            merge_sort(A, q + 1, r);
            merge(A, p, q, r);
        }
    }

    private static void merge(int[] A, int p, int q, int r) {
        int i = p, j = q + 1, t = 0;

        while (i <= q && j <= r) {
            if (A[i] <= A[j]) tmp[t++] = A[i++];
            else tmp[t++] = A[j++];
        }

        while (i <= q) tmp[t++] = A[i++];
        while (j <= r) tmp[t++] = A[j++];

        i = p;
        t = 0;
        while (i <= r) {
            A[i++] = tmp[t++];
            if (--K == 0) answer = A[i - 1];
        }
    }
}

/* input 1              output 1
5 7
4 5 1 3 2               3
 */

/* input 2              output 2
5 13
4 5 1 3 2               -1
 */