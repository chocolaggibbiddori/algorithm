package algorithm.baekjoon.math;

import java.util.Scanner;

public class 택시_기하학 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double circleAreaAtEuclid = r * r * Math.PI;
        double circleAreaAtNonEuclid = 2 * r * r;
        System.out.println(circleAreaAtEuclid);
        System.out.println(circleAreaAtNonEuclid);
    }
}

/* input 1              output 1
   1                    3.141593
                        2.000000
 */

/* input 2              output 2
   21                   1385.442360
                        882.000000
 */

/* input 3              output 3
   42                   5541.769441
                        3528.000000
 */