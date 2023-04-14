package algorithm.baekjoon.math;

import java.util.Scanner;

public class 베르트랑_공준 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] primeNumberArr = new boolean[246913];
        primeNumberArr[1] = true;

        for (int i = 2; i < primeNumberArr.length; i++) {
            if (!primeNumberArr[i]) {
                for (int j = i * 2; j < primeNumberArr.length; j += i) {
                    primeNumberArr[j] = true;
                }
            }
        }

        int N;
        while ((N = sc.nextInt()) != 0) {
            int count = 0;
            for (int i = N + 1; i <= N * 2; i++) {
                if (!primeNumberArr[i]) count++;
            }

            System.out.println(count);
        }
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