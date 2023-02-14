package algorithm.math;

import java.util.Scanner;

public class 분수찾기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int r = 1;
        int c = 1;
        boolean rightUp = true;
        while (--N > 0) {
            if (rightUp) {
                if (r == 1) rightUp = false;
                else r--;
                c++;
            } else {
                r++;
                if (c == 1) rightUp = true;
                else c--;
            }
        }

        System.out.println(r + "/" + c);
    }
}

//1         1/1
//2         1/2
//14        2/4