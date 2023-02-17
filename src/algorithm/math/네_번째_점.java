package algorithm.math;

import java.util.Scanner;

public class 네_번째_점 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        int x4 = restPoint(x1, x2, x3);
        int y4 = restPoint(y1, y2, y3);
        System.out.println(x4 + " " + y4);
    }

    private static int restPoint(int p1, int p2, int p3) {
        if (p1 == p2) return p3;
        else if (p2 == p3) return p1;
        return p2;
    }
}

/* input 1          output 1
   5 5
   5 7
   7 5              7 7
 */

/* input 2          output 2
   30 20
   10 10
   10 20            30 10
 */