package algorithm.bruteforce;

import java.util.Scanner;

public class 체스판_다시_칠하기 {

    static String[] A;
    static final String FIRST_WHITE = "WBWBWBWB";
    static final String FIRST_BLACK = "BWBWBWBW";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        A = new String[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.next();
        }

        int min = 64;
        for (int i = 0; i < N - 7; i++) {
            for (int j = 0; j < M - 7; j++) {
                min = Math.min(min, minColor(i, j));
            }
        }

        System.out.println(min);
    }

    private static int minColor(int x, int y) {
        return Math.min(checkBoard(x, y, true), checkBoard(x, y, false));
    }

    private static int checkBoard(int x, int y, boolean isFirstWhite) {
        int count = 0;

        for (int i = x; i < x + 8; i++) {
            String s = A[i].substring(y, y + 8);
            if (isFirstWhite) count += getDiff(s, FIRST_WHITE);
            else count += getDiff(s, FIRST_BLACK);
            isFirstWhite = !isFirstWhite;
        }

        return count;
    }

    private static int getDiff(String s, String reference) {
        int count = 0;

        for (int i = 0; i < 8; i++) {
            if (s.charAt(i) != reference.charAt((i))) count++;
        }

        return count;
    }
}

/* input 1              output 1
8 8
WBWBWBWB
BWBWBWBW
WBWBWBWB
BWBBBWBW
WBWBWBWB
BWBWBWBW
WBWBWBWB
BWBWBWBW                1
 */

/* input 2              output 2
10 13
BBBBBBBBWBWBW
BBBBBBBBBWBWB
BBBBBBBBWBWBW
BBBBBBBBBWBWB
BBBBBBBBWBWBW
BBBBBBBBBWBWB
BBBBBBBBWBWBW
BBBBBBBBBWBWB
WWWWWWWWWWBWB
WWWWWWWWWWBWB           12
 */

/* input 3              output 3
8 8
BWBWBWBW
WBWBWBWB
BWBWBWBW
WBWBWBWB
BWBWBWBW
WBWBWBWB
BWBWBWBW
WBWBWBWB                0
 */

/* input 4              output 4
9 23
BBBBBBBBBBBBBBBBBBBBBBB
BBBBBBBBBBBBBBBBBBBBBBB
BBBBBBBBBBBBBBBBBBBBBBB
BBBBBBBBBBBBBBBBBBBBBBB
BBBBBBBBBBBBBBBBBBBBBBB
BBBBBBBBBBBBBBBBBBBBBBB
BBBBBBBBBBBBBBBBBBBBBBB
BBBBBBBBBBBBBBBBBBBBBBB
BBBBBBBBBBBBBBBBBBBBBBW 31
 */

/* input 5              output 5
10 10
BBBBBBBBBB
BBWBWBWBWB
BWBWBWBWBB
BBWBWBWBWB
BWBWBWBWBB
BBWBWBWBWB
BWBWBWBWBB
BBWBWBWBWB
BWBWBWBWBB
BBBBBBBBBB              0
 */

/* input 6              output 6
8 8
WBWBWBWB
BWBWBWBW
WBWBWBWB
BWBBBWBW
WBWBWBWB
BWBWBWBW
WBWBWWWB
BWBWBWBW                2
 */

/* input 7              output 7
11 12
BWWBWWBWWBWW
BWWBWBBWWBWW
WBWWBWBBWWBW
BWWBWBBWWBWW
WBWWBWBBWWBW
BWWBWBBWWBWW
WBWWBWBBWWBW
BWWBWBWWWBWW
WBWWBWBBWWBW
BWWBWBBWWBWW
WBWWBWBBWWBW            15
 */