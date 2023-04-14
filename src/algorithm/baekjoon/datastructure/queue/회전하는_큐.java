package algorithm.baekjoon.datastructure.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 회전하는_큐 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= n; i++) list.add(i);

        st = new StringTokenizer(br.readLine());
        Queue<Integer> que = new LinkedList<>();
        while (m-- > 0) que.add(Integer.parseInt(st.nextToken()));

        int count = 0;
        int head = 1;
        while (!que.isEmpty()) {
            Integer x = que.poll();
            int interval = Math.abs(list.indexOf(x) + 1 - head);
            int fast = Math.min(interval, list.size() - interval);

            count += fast;
            head = list.indexOf(x) + 1;
            list.remove(x);
        }

        System.out.println(count);
    }
}

/* input 1                      output 1
10 3
1 2 3                           0
 */

/* input 2                      output 2
10 3
2 9 5                           8
 */

/* input 3                      output 3
32 6
27 16 30 11 6 23                59
 */

/* input 4                      output 4
10 10
1 6 3 2 7 9 8 4 10 5            14
 */