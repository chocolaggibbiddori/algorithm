package algorithm.datastructure.queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class AC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        Test:
        while (t-- > 0) {
            char[] commands = sc.next().toCharArray();
            int n = sc.nextInt();

            Deque<Integer> deque = new LinkedList<>();
            String[] arr = sc.next().replaceAll("[\\[\\]]", "").split(",");
            for (int i = 0; i < n; i++) deque.addLast(Integer.parseInt(arr[i]));

            boolean isReverse = false;
            for (char command : commands) {
                if (command == 'R') isReverse = !isReverse;
                else {
                    if (deque.isEmpty()) {
                        sb.append("error").append("\n");
                        continue Test;
                    }

                    if (isReverse) deque.pollLast();
                    else deque.pollFirst();
                }
            }

            if (deque.isEmpty()) sb.append("[]\n");
            else {
                sb.append("[");
                if (isReverse) while (!deque.isEmpty()) sb.append(deque.pollLast()).append(",");
                else while (!deque.isEmpty()) sb.append(deque.pollFirst()).append(",");
                sb.deleteCharAt(sb.lastIndexOf(","));
                sb.append("]").append("\n");
            }
        }

        System.out.print(sb);
    }
}

/* input
4
RDD
4
[1,2,3,4]
DD
1
[42]
RRD
6
[1,1,2,3,5,8]
D
0
[]
 */

/* output
[2,1]
error
[1,2,3,5,8]
error
 */