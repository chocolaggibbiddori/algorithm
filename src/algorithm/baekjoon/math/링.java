package algorithm.baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 링 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int firstRing = Integer.parseInt(st.nextToken());
        for (int i = 0; i < N - 1; i++) {
            int nextRing = Integer.parseInt(st.nextToken());
            int gcd = gcd(firstRing, nextRing);
            System.out.println(firstRing / gcd + "/" + nextRing / gcd);
        }
    }

    static int gcd(int a, int b) {
        if (a % b == 0) return b;
        return gcd(b, a % b);
    }
}

/* input 1
3
8 4 2
 */

/* output 1
2/1
4/1
 */

/* input 2
4
12 3 8 4
 */

/* output 2
4/1
3/2
3/1
 */

/* input 3
4
300 1 1 300
 */

/* output 3
300/1
300/1
1/1
 */