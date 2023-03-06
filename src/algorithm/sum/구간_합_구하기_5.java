package algorithm.sum;

import java.io.*;
import java.util.StringTokenizer;

public class 구간_합_구하기_5 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] A = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) A[i][j] = Integer.parseInt(st.nextToken());
        }

        int[][] dp = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= n; j++)
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1] + A[i][j] - dp[i - 1][j - 1];

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (m-- > 0) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            int sum = dp[x2][y2] - dp[x1 - 1][y2] - dp[x2][y1 - 1] + dp[x1 - 1][y1 - 1];
            bw.write(sum + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}

/* input 1
4 3
1 2 3 4
2 3 4 5
3 4 5 6
4 5 6 7
2 2 3 4
3 4 3 4
1 1 4 4
 */

/* output 1
27
6
64
 */

/* input 2
2 4
1 2
3 4
1 1 1 1
1 2 1 2
2 1 2 1
2 2 2 2
 */

/* output 2
1
2
3
4
 */