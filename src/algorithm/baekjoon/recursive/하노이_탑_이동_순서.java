package algorithm.baekjoon.recursive;

import java.util.Scanner;

public class 하노이_탑_이동_순서 {

    static int count = 0;
    static StringBuilder sb;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sb = new StringBuilder();
        hanoi(N, 1, 3);

        System.out.println(count);
        System.out.println(sb);
    }

    private static void hanoi(int n, int from, int to) {
        int empty = 6 - from - to;

        if (n == 1) {
            sb.append(from).append(" ").append(to).append("\n");
            count++;
            return;
        }

        hanoi(n - 1, from, empty);
        hanoi(1, from, to);
        hanoi(n - 1, empty, to);
    }
}

/* input            output
3                   7
                    1 3
                    1 2
                    3 2
                    1 3
                    2 1
                    2 3
                    1 3
 */