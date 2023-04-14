package algorithm.baekjoon.bruteforce;

import java.util.Scanner;

public class 한수 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int N = Integer.parseInt(str);

        if (N < 100) {
            System.out.println(N);
            return;
        }

        int count = 99;
        for (int i = 100; i <= N; i++) {
            if (isHanNumber(i)) count++;
        }

        System.out.println(count);
    }

    private static boolean isHanNumber(int x) {
        if (x == 1000) return false;

        int hundred = x / 100;
        int ten = (x % 100) / 10;
        int one = x % 10;

        return hundred + one == ten * 2;
    }
}

/*
110             99
 */

/*
1               1
 */

/*
210             105
 */

/*
1000            144
 */

/*
500             119
 */