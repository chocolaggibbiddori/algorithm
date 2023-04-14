package algorithm.baekjoon.math;

import java.util.Scanner;

public class 달팽이는_올라가고_싶다 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();

        int movePerDay = A - B;
        int endLine = V - A;
        System.out.println((int) Math.ceil((double) endLine / movePerDay) + 1);
    }
}

//2 1 5                 4
//5 1 6                 2
//100 99 1000000000     999999901