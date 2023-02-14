package algorithm.math;

import java.util.Scanner;

public class 벌집 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int count = 1;
        int end = 1;
        while (N > end) {
            end += 6 * count++;
        }

        System.out.println(count);
    }
}

/*
13              3
 */