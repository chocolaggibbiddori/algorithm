package algorithm.baekjoon.sort;

import java.util.PriorityQueue;
import java.util.Scanner;

public class 좌표_정렬하기_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        PriorityQueue<Point> que = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            que.offer(new Point(sc.nextInt(), sc.nextInt()));
        }

        while (!que.isEmpty()) {
            System.out.println(que.poll());
        }
    }

    static class Point implements Comparable<Point> {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point p) {
            if (y == p.y) return Integer.compare(x, p.x);
            else return Integer.compare(y, p.y);
        }

        @Override
        public String toString() {
            return x + " " + y;
        }
    }
}

/* input
5
0 4
1 2
1 -1
2 2
3 3
 */

/* output
1 -1
1 2
2 2
3 3
0 4
 */