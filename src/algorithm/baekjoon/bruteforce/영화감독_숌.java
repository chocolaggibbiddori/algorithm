package algorithm.baekjoon.bruteforce;

import java.util.Scanner;

public class 영화감독_숌 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int i = 665;
        while (N != 0) {
            if (isDevilNumber(++i)) N--;
        }

        System.out.println(i);
    }

    private static boolean isDevilNumber(int number) {
        return String.valueOf(number).contains("666");
    }
}

/* input            output
   2                1666
   3                2666
   6                5666
   187              66666
   500              166699
 */