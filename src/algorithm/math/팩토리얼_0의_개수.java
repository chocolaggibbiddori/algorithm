package algorithm.math;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 팩토리얼_0의_개수 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Map<Integer, Integer> map = new HashMap<>();
        while (N > 0) {
            int M = N--;
            while (M % 2 == 0) {
                map.put(2, map.getOrDefault(2, 0) + 1);
                M /= 2;
            }
            while (M % 5 == 0) {
                map.put(5, map.getOrDefault(5, 0) + 1);
                M /= 5;
            }
        }

        System.out.println(Math.min(map.getOrDefault(2, 0), map.getOrDefault(5, 0)));
    }
}

/* input 1      output 1
   10           2
 */

/* input 2      output 2
   3            0
 */