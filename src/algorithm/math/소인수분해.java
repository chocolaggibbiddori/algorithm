package algorithm.math;

import java.util.Scanner;

public class 소인수분해 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        if (N == 1) return;

        int i = 2;
        while (!isPrimeNumber(N)) {
            while (N % i == 0) {
                N /= i;
                sb.append(i).append("\n");
            }
            i++;
        }
        if (N != 1) sb.append(N);

        System.out.println(sb);
    }

    private static boolean isPrimeNumber(int num) {
        if (num == 1) return true;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }

        return true;
    }
}

/* input 1              output 1
72                      2
                        2
                        2
                        3
                        3
 */

/* input 2              output 2
3                       3
 */

/* input 3              output 3
6                       2
                        3
 */

/* input 4              output 4
2                       2
 */

/* input 5              output 5
9991                    97
                        103
 */