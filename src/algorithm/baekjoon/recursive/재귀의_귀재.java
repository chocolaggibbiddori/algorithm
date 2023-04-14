package algorithm.baekjoon.recursive;

import java.util.Scanner;

public class 재귀의_귀재 {

    static int count;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            String next = sc.next();
            count = 0;
            int isPalindrome = isPalindrome(next, 0, next.length() - 1);
            System.out.println(isPalindrome + " " + count);
        }
    }

    private static int isPalindrome(String str, int start, int end) {
        count++;
        if (start >= end) return 1;
        if (str.charAt(start) != str.charAt(end)) return 0;
        return isPalindrome(str, start + 1, end - 1);
    }
}

/* input
5
AAA
ABBA
ABABA
ABCA
PALINDROME
 */

/* output
1 2
1 3
1 3
0 2
0 1
 */