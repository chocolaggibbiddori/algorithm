package algorithm.math;

import java.util.Scanner;

public class 베르트랑_공준 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;

        while ((N = sc.nextInt()) != 0) {
            int count = countPrimeNumber(N + 1, N * 2);
            System.out.println(count);
        }
    }

    private static int countPrimeNumber(int from, int to) {
        int count = 0;
        for (int i = from; i <= to; i++) {
            if (isPrimeNumber(i)) count++;
        }

        return count;
    }

    private static boolean isPrimeNumber(int num) {
        if (num == 1) return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }

        return true;
    }
}

/* input                output
1                       1
10                      4
13                      3
100                     21
1000                    135
10000                   1033
100000                  8392
0
 */