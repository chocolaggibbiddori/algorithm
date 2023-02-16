package algorithm.sort;

import java.util.PriorityQueue;
import java.util.Scanner;

public class 단어_정렬 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        PriorityQueue<String> que = new PriorityQueue<>((s1, s2) -> {
            int length1 = s1.length();
            int length2 = s2.length();
            if (length1 == length2) return String.CASE_INSENSITIVE_ORDER.compare(s1, s2);
            else return Integer.compare(length1, s2.length());
        });
        for (int i = 0; i < N; i++) {
            String str = sc.next();
            if (!que.contains(str)) que.offer(str);
        }

        while (!que.isEmpty()) {
            System.out.println(que.poll());
        }
    }
}

/* input
13
but
i
wont
hesitate
no
more
no
more
it
cannot
wait
im
yours
 */

/* output
i
im
it
no
but
more
wait
wont
yours
cannot
hesitate
 */