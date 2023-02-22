package algorithm.math;

import java.util.Scanner;

public class 최대공약수와_최소공배수 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int g = gcd(a, b);
        int l = a * b / g;

        System.out.println(g);
        System.out.println(l);
    }

    static int gcd(int a, int b) {
        if (a % b == 0) return b;
        return gcd(b, a % b);
    }
}

/* input
24 18
 */

/* output
6
72
 */