package algorithm.baekjoon.sort;

import java.util.*;

public class 통계학 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        double sum = 0;
        int max = -4000;
        int min = 4000;
        int[] arr = new int[N];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            sum += num;
            arr[i] = num;
            map.put(num, map.getOrDefault(num, 0) + 1);
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        System.out.println((int) Math.round(sum / N));

        Arrays.sort(arr);
        System.out.println(arr[N / 2]);

        PriorityQueue<Map.Entry<Integer, Integer>> que = new PriorityQueue<>((e1, e2) -> {
            if (e1.getValue().equals(e2.getValue())) return Integer.compare(e1.getKey(), e2.getKey());
            else return Integer.compare(e2.getValue(), e1.getValue());
        });
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            que.offer(entry);
        }
        Map.Entry<Integer, Integer> p = que.poll();
        if (!que.isEmpty() && p.getValue().equals(que.peek().getValue())) p = que.poll();
        System.out.println(p.getKey());

        System.out.println(max - min);
    }
}

/* input 1
5
1
3
8
-2
2
 */

/* output 1
2
2
1
10
 */

/* input 2
1
4000
 */

/* output 2
4000
4000
4000
0
 */

/* input 3
5
-1
-2
-3
-1
-2
 */

/* output 3
-2
-2
-1
2
 */

/* input 4
3
0
0
-1
 */

/* output 4
0
0
0
1
 */