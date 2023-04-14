package algorithm.baekjoon.math;

import java.util.PriorityQueue;
import java.util.Scanner;

public class 약수들의_합 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        while ((n = sc.nextInt()) != -1) {
            int sum = 1;
            StringBuilder sb = new StringBuilder();
            PriorityQueue<Integer> que = new PriorityQueue<>();

            sb.append(n).append(" = ").append(1);

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    sum += i;
                    sum += n / i;
                    que.offer(i);
                    que.offer(n / i);
                }
            }

            if (sum == n) {
                while (!que.isEmpty()) {
                    sb.append(" + ").append(que.poll());
                }

                System.out.println(sb);
            } else {
                System.out.println(n + " is NOT perfect.");
            }
        }
    }
}

/* input
6
12
28
-1
 */

/* output
6 = 1 + 2 + 3
12 is NOT perfect.
28 = 1 + 2 + 4 + 7 + 14
 */