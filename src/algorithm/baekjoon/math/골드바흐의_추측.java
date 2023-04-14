package algorithm.baekjoon.math;

import java.util.Scanner;

public class 골드바흐의_추측 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        boolean[] primeNumberArr = new boolean[10000];

        primeNumberArr[1] = true;
        for (int i = 2; i < primeNumberArr.length; i++) {
            if (!primeNumberArr[i]) {
                for (int j = i * 2; j < primeNumberArr.length; j += i) {
                    primeNumberArr[j] = true;
                }
            }
        }

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();

            for (int j = N / 2; j >= 2; j--) {
                if (!primeNumberArr[j] && !primeNumberArr[N - j]) {
                    System.out.println(j + " " + (N - j));
                    break;
                }
            }
        }
    }
}

/* input                output
3
8                       3 5
10                      5 5
16                      5 11
 */