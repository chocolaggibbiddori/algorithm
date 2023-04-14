package algorithm.baekjoon.string;

import java.util.Scanner;

public class 문자열_반복 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            String str = sc.next();

            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < str.length(); j++) {
                sb.append(str.substring(j, j + 1).repeat(n));
            }

            System.out.println(sb);
        }
    }
}

/* input
2
3 ABC
5 /HTP
 */

/* output
AAABBBCCC
/////HHHHHTTTTTPPPPP
 */