package algorithm.math;

import java.util.Scanner;

public class ěë_ěęł {

    static int h;
    static int m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        h = sc.nextInt();
        m = sc.nextInt();
        calMinute(45);
        System.out.println(h + " " + m);
    }

    private static void calMinute(int preM) {
        if (m < preM) {
            m = m - preM + 60;
            calHour(1);
        } else {
            m -= preM;
        }
    }

    private static void calHour(int preH) {
        h = h < preH ? h - preH + 24 : h - preH;
    }
}

/*
10 10       9 25
 */

/*
0 30        23 45
 */

/*
23 40       22 55
 */