package algorithm.baekjoon.recursive;

import java.util.Scanner;

public class 곱셈 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(pow(a, b, c));
    }

    private static long pow(long a, int b, int c) {
        if (b == 1) return a % c;

        long temp = pow(a, b / 2, c);

        if (b % 2 == 1) return (((temp * temp) % c) * a) % c;
        else return (temp * temp) % c;
    }
}

/* input            output
10 11 12            4
 */