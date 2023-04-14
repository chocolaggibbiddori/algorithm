package algorithm.baekjoon.bruteforce;

import java.util.Arrays;
import java.util.Scanner;

public class 일곱_난쟁이 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] heights = new int[9];

        int total = -100;
        for (int i = 0; i < heights.length; i++) {
            heights[i] = sc.nextInt();
            total += heights[i];
        }
        Arrays.sort(heights);

        int first = -1;
        int second = -1;
        for (int i = 0; i < heights.length; i++) {
            for (int j = i + 1; j < heights.length; j++) {
                if (heights[i] + heights[j] == total) {
                    first = i;
                    second = j;
                    break;
                }
            }
        }

        for (int i = 0; i < heights.length; i++) {
            if (i == first || i == second) continue;
            System.out.println(heights[i]);
        }
    }
}

/* input
20
7
23
19
10
15
25
8
13
 */

/* output
7
8
10
13
19
20
23
 */