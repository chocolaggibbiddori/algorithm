package algorithm.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class 어린_왕자 {

    private static BufferedReader br;
    private static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            test(x1, y1, x2, y2);
        }
    }

    private static void test(int x1, int y1, int x2, int y2) throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        Set<Circle> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            Circle circle = new Circle(
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()));

            if (circle.isInCircle(x1, y1) ^ circle.isInCircle(x2, y2)) set.add(circle);
        }

        System.out.println(set.size());
    }

    static class Circle {
        int c1;
        int c2;
        int r;

        public Circle(int c1, int c2, int r) {
            this.c1 = c1;
            this.c2 = c2;
            this.r = r;
        }

        public boolean isInCircle(int x, int y) {
            return (c1 - x) * (c1 - x) + (c2 - y) * (c2 - y) < r * r;
        }

        @Override
        public int hashCode() {
            return c1 + c2 + r;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Circle) {
                Circle c = (Circle) obj;
                return c1 == c.c1 && c2 == c.c2 && r == c.r;
            }
            return false;
        }
    }
}

/* input 1
2
-5 1 12 1
7
1 1 8
-3 -1 1
2 2 2
5 5 1
-4 5 1
12 1 1
12 1 2
-5 1 5 1
1
0 0 2
 */

/* output 1
3
0
 */

/* input 2
3
-5 1 5 1
3
0 0 2
-6 1 2
6 2 2
2 3 13 2
8
-3 -1 1
2 2 3
2 3 1
0 1 7
-4 5 1
12 1 1
12 1 2
12 1 3
102 16 19 -108
12
-107 175 135
-38 -115 42
140 23 70
148 -2 39
-198 -49 89
172 -151 39
-179 -52 43
148 42 150
176 0 10
153 68 120
-56 109 16
-187 -174 8
 */

/* output 2
2
5
3
 */