package algorithm.dynamicprogramming;

import java.util.Scanner;

public class 피보나치_수_1 {

    static int countRecur;
    static int countDp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        countRecur = 0;
        fib(n);

        countDp = 0;
        fibonacci(n);

        System.out.println(countRecur + " " + countDp);
    }

    private static int fib(int n) {
        if (n == 1 || n == 2) {
            countRecur++;
            return 1;
        }

        return fib(n - 1) + fib(n - 2);
    }

    private static void fibonacci(int n) {
        for (int i = 3; i <= n; i++) countDp++;
    }
}

/* input 1          output 1
   5                5 3
 */

/* input 2          output 2
   30               832040 28
 */