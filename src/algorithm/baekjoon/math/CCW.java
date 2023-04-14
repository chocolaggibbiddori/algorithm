package algorithm.baekjoon.math;

import java.util.Scanner;

public class CCW {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] A = new int[4][2];
        for (int i = 0; i < 3; i++) {
            A[i][0] = sc.nextInt();
            A[i][1] = sc.nextInt();
        }
        A[3][0] = A[0][0];
        A[3][1] = A[0][1];

        int ccw = 0;
        for (int i = 0; i < 3; i++) {
            ccw += A[i][0] * A[i + 1][1];
            ccw -= A[i][1] * A[i + 1][0];
        }

        System.out.println(ccw > 0 ? 1 : ccw == 0 ? 0 : -1);
    }
}

/* input 1      output 1
1 1
5 5
7 3             -1
 */

/* input 2      output 2
1 1
3 3
5 5             0
 */

/* input 3      output 3
1 1
7 3
5 5             1
 */