package algorithm.math;

import java.util.Scanner;

public class 설탕_배달 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = N / 5; i >= 0; i--) {
            int rest = N - 5 * i;
            if (rest % 3 == 0) {
                System.out.println(i + rest / 3);
                return;
            }
        }

        System.out.println(-1);
    }
}

//18      4
//4       -1
//6       2
//9       3
//11      3