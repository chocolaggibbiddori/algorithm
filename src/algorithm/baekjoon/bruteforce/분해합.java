package algorithm.baekjoon.bruteforce;

import java.util.Scanner;

public class 분해합 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(minConstructor(N));
    }

    private static int minConstructor(int n) {
        for (int i = 1; i < n; i++) {
            int decompositionSum = i;
            String str = String.valueOf(i);

            for (int j = 0; j < str.length(); j++) {
                decompositionSum += str.charAt(j) - '0';
            }

            if (decompositionSum == n) return i;
        }

        return 0;
    }
}

/* input
216
 */

/* output
198
 */