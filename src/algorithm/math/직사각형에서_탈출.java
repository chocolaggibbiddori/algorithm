package algorithm.math;

import java.util.Scanner;

public class 직사각형에서_탈출 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        System.out.println(Math.min(Math.min(x, w - x), Math.min(y, h - y)));
    }
}

/* input 1              output 1
   6 2 10 3             1
 */

/* input 2              output 2
   1 1 5 5              1
 */

/* input 3              output 3
   653 375 1000 1000    347
 */

/* input 4              output 4
   161 181 762 375      161
 */