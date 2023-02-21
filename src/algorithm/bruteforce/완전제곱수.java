package algorithm.bruteforce;

import java.util.Scanner;

public class 완전제곱수 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();

        int sum = 0;
        int min = 100000;
        for (int i = M; i <= N; i++) {
            if (isSquareNumber(i)) {
                sum += i;
                if (min == 100000) min = i;
            }
        }

        if (sum == 0) System.out.println(-1);
        else {
            System.out.println(sum);
            System.out.println(min);
        }
    }

    private static boolean isSquareNumber(int num) {
        String s = String.valueOf(Math.sqrt(num));
        return s.indexOf(".") == s.length() - 2;
    }
}

/* input 1
60
100
 */

/* output 1
245
64
 */

/* input 2
75
80
 */

/* output 2
-1
 */