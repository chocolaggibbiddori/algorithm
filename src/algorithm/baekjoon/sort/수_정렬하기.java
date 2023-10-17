package algorithm.baekjoon.sort;

import java.util.Scanner;

public class 수_정렬하기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();

        for (int range = N - 1; range > 0; range--) {
            boolean swap = false;

            for (int i = 0; i < range; i++) {
                int val = arr[i];
                int nextVal = arr[i + 1];

                if (val > nextVal) {
                    arr[i] = nextVal;
                    arr[i + 1] = val;
                    swap = true;
                }
            }

            if (!swap) break;
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}

/* input
5
5
2
3
4
1
 */

/* output
1
2
3
4
5
 */