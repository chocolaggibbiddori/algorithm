package algorithm.baekjoon.datastructure.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 요세푸스_문제_0 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        Queue<Integer> que = new LinkedList<>();
        for (int i = 1; i <= n; i++) que.add(i);

        int count = 1;
        while (!que.isEmpty()) {
            if (count == k) {
                sb.append(que.poll()).append(", ");
                count = 1;
            } else {
                que.add(que.poll());
                count++;
            }
        }

        sb.replace(sb.length() - 2, sb.length() - 1, ">");
        System.out.println(sb);
    }
}

/* input
7 3
 */

/* output
<3, 6, 2, 7, 5, 1, 4>
 */