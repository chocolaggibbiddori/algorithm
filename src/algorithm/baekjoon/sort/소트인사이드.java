package algorithm.baekjoon.sort;

import java.util.Scanner;

public class 소트인사이드 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();

        for (int start = 0; start < arr.length - 1; start++) {
            int maxIdx = start;

            for (int i = start; i < arr.length; i++) {
                if (arr[i] > arr[maxIdx]) maxIdx = i;
            }

            char temp = arr[start];
            arr[start] = arr[maxIdx];
            arr[maxIdx] = temp;
        }

        System.out.println(String.valueOf(arr));
    }
}

/* input 1
2143
 */

/* output 1
4321
 */

/* input 2
999998999
 */

/* output 2
999999998
 */

/* input 3
61423
 */

/* output 3
64321
 */

/* input 4
500613009
 */

/* output 4
965310000
 */
