package algorithm.dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RGB거리 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        int[][] dp = new int[n][3];
        st = new StringTokenizer(br.readLine());
        dp[0][0] = Integer.parseInt(st.nextToken());
        dp[0][1] = Integer.parseInt(st.nextToken());
        dp[0][2] = Integer.parseInt(st.nextToken());
        for (int i = 1; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int red = Integer.parseInt(st.nextToken());
            int green = Integer.parseInt(st.nextToken());
            int blue = Integer.parseInt(st.nextToken());

            dp[i][0] = Math.min(dp[i - 1][1] + red, dp[i - 1][2] + red);
            dp[i][1] = Math.min(dp[i - 1][0] + green, dp[i - 1][2] + green);
            dp[i][2] = Math.min(dp[i - 1][0] + blue, dp[i - 1][1] + blue);
        }

        System.out.println(Math.min(dp[n - 1][0], Math.min(dp[n - 1][1], dp[n - 1][2])));
    }
}

/* input 1                  output 1
3
26 40 83
49 60 57
13 89 99                    96
 */

/* input 2                  output 2
3
1 100 100
100 1 100
100 100 1                   3
 */

/* input 3                  output 3
3
1 100 100
100 100 100
1 100 100                   102
 */

/* input 4                  output 4
6
30 19 5
64 77 64
15 19 97
4 71 57
90 86 84
93 32 91                    208
 */

/* input 5                  output 5
8
71 39 44
32 83 55
51 37 63
89 29 100
83 58 11
65 13 15
47 25 29
60 66 19                    253
 */