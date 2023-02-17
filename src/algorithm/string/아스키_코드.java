package algorithm.string;

import java.util.Scanner;

public class 아스키_코드 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println((int) s.charAt(0));
    }
}

/* input        output
   A            65
   C            67
   0            48
   9            57
   a            97
   z            122
 */