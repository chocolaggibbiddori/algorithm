package algorithm.dynamicprogramming;

import java.util.Scanner;

public class 부녀회장이_될테야 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            int K = sc.nextInt();
            int N = sc.nextInt();
            int[][] apartment = new int[K + 1][N + 1];

            for (int floor = 0; floor <= K; floor++) {
                apartment[floor][1] = floor + 1;
            }

            for (int room = 1; room <= N; room++) {
                apartment[0][room] = room;
            }

            for (int floor = 1; floor <= K; floor++) {
                for (int room = 1; room <= N; room++) {
                    apartment[floor][room] = apartment[floor - 1][room] + apartment[floor][room - 1];
                }
            }

            System.out.println(apartment[K][N]);
        }
    }
}

/* input
2
1
3
2
3
 */

/* output
6
10
 */