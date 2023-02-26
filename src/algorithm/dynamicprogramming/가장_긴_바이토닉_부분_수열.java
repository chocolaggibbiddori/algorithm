package algorithm.dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 가장_긴_바이토닉_부분_수열 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] A = new int[n];
        for (int i = 0; i < n; i++) A[i] = Integer.parseInt(st.nextToken());

        int[] dpLeft = new int[n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < i; j++)
                if (A[j] < A[i] && dpLeft[j] >= dpLeft[i]) dpLeft[i] = dpLeft[j] + 1;

        int[] dpRight = new int[n];
        for (int i = n - 1; i >= 0; i--)
            for (int k = n - 1; k > i; k--)
                if (A[k] < A[i] && dpRight[k] >= dpRight[i]) dpRight[i] = dpRight[k] + 1;

        int max = 0;
        for (int i = 0; i < n; i++) {
            int sum = dpLeft[i] + dpRight[i];
            if (sum > max) max = sum;
        }

        System.out.println(max + 1);
    }
}

/* input                    output
10
1 5 2 1 4 3 4 5 2 1         7
 */