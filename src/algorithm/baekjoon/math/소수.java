package algorithm.baekjoon.math;

import java.util.Scanner;

public class 소수 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        boolean hasFirstPrime = false;
        int min = N;
        int sum = 0;

        for (int i = M; i <= N; i++) {
            if (isPrimeNumber(i)) {
                sum += i;
                if (!hasFirstPrime) {
                    min = i;
                    hasFirstPrime = true;
                }
            }
        }

        if (hasFirstPrime) {
            System.out.println(sum);
            System.out.println(min);
        } else {
            System.out.println(-1);
        }
    }

    private static boolean isPrimeNumber(int num) {
        if (num == 1) return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }

        return true;
    }
}

/* input 1
60
100
 */

/* output 1
620
61
 */

/* input 2
64
65
 */

/* output 2
-1
 */