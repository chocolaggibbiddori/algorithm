package algorithm.baekjoon.string;

import java.util.Scanner;

public class 알파벳_찾기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder();

        for (char c = 'a'; c <= 'z'; c++) {
            sb.append(s.indexOf(c)).append(" ");
        }

        System.out.println(sb);
    }
}

/* input
baekjoon
 */

/* output
1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1
 */