package algorithm.baekjoon.math;

import java.util.Scanner;

public class 구구단 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 9; i++) {
            sb.append(N).append(" * ").append(i).append(" = ").append(N * i).append("\n");
        }

        System.out.print(sb);
    }
}

/*
2
 */

/*
2 * 1 = 2
2 * 2 = 4
2 * 3 = 6
2 * 4 = 8
2 * 5 = 10
2 * 6 = 12
2 * 7 = 14
2 * 8 = 16
2 * 9 = 18
 */