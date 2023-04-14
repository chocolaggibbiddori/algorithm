package algorithm.baekjoon.math;

import java.util.Scanner;

public class 곱셈 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = Integer.parseInt(sc.nextLine());
        String B = sc.nextLine();

        for (int i = B.length() - 1; i >= 0; i--) {
            int number = B.charAt(i) - '0';
            System.out.println(A * number);
        }
        System.out.println(A * Integer.parseInt(B));
    }
}

/*
472
385
 */

/*
2360
3776
1416
181720
 */