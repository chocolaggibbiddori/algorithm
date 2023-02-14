package algorithm.math;

import java.util.Scanner;

public class 손익분기점 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fixedCost = sc.nextInt();
        int variableCost = sc.nextInt();
        int price = sc.nextInt();

        if (price <= variableCost) {
            System.out.println(-1);
            return;
        }

        int profit = price - variableCost;
        int amount = fixedCost / profit + 1;
        System.out.println(amount);
    }
}

/*
1000 70 170             11
 */

/*
3 2 1                   -1
 */

/*
2100000000 9 10         2100000001
 */