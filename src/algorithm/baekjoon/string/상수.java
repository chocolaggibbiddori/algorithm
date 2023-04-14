package algorithm.baekjoon.string;

import java.util.Scanner;

public class 상수 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = new StringBuilder(sc.next()).reverse().toString();
        String second = new StringBuilder(sc.next()).reverse().toString();
        int firstNum = Integer.parseInt(first);
        int secondNum = Integer.parseInt(second);

        System.out.println(Math.max(firstNum, secondNum));
    }
}

/*
734 893         437
 */

/*
221 231         132
 */

/*
839 237         938
 */
