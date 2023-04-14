package algorithm.baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 직각삼각형 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == 0) return;

            boolean isRightTriangle1 = a * a + b * b == c * c;
            boolean isRightTriangle2 = b * b + c * c == a * a;
            boolean isRightTriangle3 = c * c + a * a == b * b;
            boolean isRightTriangle = isRightTriangle1 || isRightTriangle2 || isRightTriangle3;
            System.out.println(isRightTriangle ? "right" : "wrong");
        }
    }
}

/* input
6 8 10
25 52 60
5 12 13
0 0 0
 */

/* output
right
wrong
right
 */