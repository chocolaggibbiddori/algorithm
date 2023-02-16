package algorithm.math;

import java.math.BigInteger;
import java.util.Scanner;

public class 큰_수의_합 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger A = sc.nextBigInteger();
        BigInteger B = sc.nextBigInteger();
        System.out.println(A.add(B));
    }
}

/* input
9223372036854775807 9223372036854775808
 */

/* output
18446744073709551615
 */