package algorithm.math;

import java.util.Scanner;

public class 윤년 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (N % 400 == 0 || (N % 4 == 0 && N % 100 != 0)) System.out.println(1);
        else System.out.println(0);
    }
}

/*
2000        1
 */

/*
1999        0
 */