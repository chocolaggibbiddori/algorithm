package algorithm.baekjoon.math;

import java.util.Scanner;

public class 최소공배수 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a * b / gcd(a, b));
        }
    }

    static int gcd(int a, int b) {
        if (a % b == 0) return b;
        return gcd(b, a % b);
    }
}

/* input
3
1 45000
6 10
13 17
 */

/* output
45000
30
221
 */