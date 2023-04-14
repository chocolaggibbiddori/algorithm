package algorithm.baekjoon.math;

import java.util.Scanner;

public class 더하기_사이클 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;

        int number = N;
        do {
            int oneDigit = getOneDigit(number);
            int tenDigit = number % 10;
            number = tenDigit * 10 + oneDigit;
            count++;
        } while (number != N);

        System.out.println(count);
    }

    private static int getOneDigit(int number) {
        return ((number / 10) + (number % 10)) % 10;
    }
}

/*
26      4
 */

/*
55      3
 */

/*
1       60
 */

/*
0       1
 */

/*
71      12
 */