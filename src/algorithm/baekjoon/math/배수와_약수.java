package algorithm.baekjoon.math;

import java.util.Scanner;

public class 배수와_약수 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            if (A == 0) break;

            if (A % B == 0) System.out.println("multiple");
            else if (B % A == 0) System.out.println("factor");
            else System.out.println("neither");
        }
    }
}

/* input
8 16
32 4
17 5
0 0
 */

/* output
factor
multiple
neither
 */