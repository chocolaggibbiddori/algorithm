package algorithm.string;

import java.util.Scanner;

public class 세로읽기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxLength = 0;
        char[][] arr = new char[5][];
        for (int i = 0; i < 5; i++) {
            String nextLine = sc.nextLine();
            arr[i] = nextLine.toCharArray();
            maxLength = Math.max(maxLength, nextLine.length());
        }

        StringBuilder sb = new StringBuilder();
        for (int col = 0; col < maxLength; col++) {
            for (int row = 0; row < 5; row++) {
                try {
                    sb.append(arr[row][col]);
                } catch (IndexOutOfBoundsException ignored) {}
            }
        }

        System.out.println(sb);
    }
}

/* input 1                  output 1
ABCDE
abcde
01234
FGHIJ
fghij                       Aa0FfBb1GgCc2HhDd3IiEe4Jj
 */

/* input 2                  output 2
AABCDD
afzz
09121
a8EWg6
P5h3kx                      Aa0aPAf985Bz1EhCz2W3D1gkD6x
 */