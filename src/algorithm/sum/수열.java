package algorithm.sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 수열 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] temperatures = new int[n];
        for (int i = 0; i < n; i++) temperatures[i] = Integer.parseInt(st.nextToken());

        int first = 0;
        int last = k;
        int sum = 0;
        for (int i = first; i < last; i++) sum += temperatures[i];

        int max = sum;
        while (last < n) {
            sum -= temperatures[first++];
            sum += temperatures[last++];

            if (sum > max) max = sum;
        }

        System.out.println(max);
    }
}

/* input 1                          output 1
10 2
3 -2 -4 -9 0 3 7 13 8 -3            21
 */

/* input 2                          output 2
10 5
3 -2 -4 -9 0 3 7 13 8 -3            31
 */