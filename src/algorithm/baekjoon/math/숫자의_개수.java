package algorithm.baekjoon.math;

import java.util.Scanner;

public class 숫자의_개수 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int[] numbers = new int[10];
        String n = String.valueOf(A * B * C);
        for (int i = 0; i < n.length(); i++) {
            int c = n.charAt(i) - '0';
            numbers[c]++;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(numbers[i]);
        }
    }
}

/*
150
266
427
 */

/*
3
1
0
2
0
0
0
2
0
0
 */