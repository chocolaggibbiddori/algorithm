package algorithm.baekjoon.bruteforce;

import java.util.Scanner;

public class 약수_구하기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            if (N % i == 0 && --K == 0) {
                System.out.println(i);
                return;
            }
        }

        System.out.println(0);
    }
}

/* input 1          output 1
   6 3              3
 */

/* input 2          output 2
   25 4             0
 */

/* input 3          output 3
   2735 1           1
 */