package algorithm.math;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 팩토리얼_0의_개수 {

    static Map<Integer, Integer> map;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        map = new HashMap<>();

        while (N > 0) {
            int M = N--;
            M = countNumberOfX(M, 2);
            countNumberOfX(M, 5);
        }

        System.out.println(Math.min(map.getOrDefault(2, 0), map.getOrDefault(5, 0)));
    }

    private static int countNumberOfX(int M, int x) {
        while (M % x == 0) {
            map.put(x, map.getOrDefault(x, 0) + 1);
            M /= x;
        }
        return M;
    }
}

/* input 1      output 1
   10           2
 */

/* input 2      output 2
   3            0
 */