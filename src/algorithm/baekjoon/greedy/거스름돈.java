package algorithm.baekjoon.greedy;

import java.util.Scanner;

public class 거스름돈 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int money = 1000;
        int[] A = {500, 100, 50, 10, 5, 1};

        int change = money - input;
        int count = 0;
        for (int i : A) {
            count += change / i;
            change = change % i;
        }

        System.out.println(count);
    }
}

/* input 1
380
 */

/* output 1
4
 */

/* input 2
1
 */

/* output 2
15
 */