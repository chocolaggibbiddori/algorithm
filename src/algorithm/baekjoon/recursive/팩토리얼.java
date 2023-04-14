package algorithm.baekjoon.recursive;

import java.util.Scanner;

public class 팩토리얼 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(factorial(sc.nextInt()));
    }

    private static long factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }
}

/* input 1              output 1
   10                   3628800
 */

/* input 2              output 2
   0                    1
 */