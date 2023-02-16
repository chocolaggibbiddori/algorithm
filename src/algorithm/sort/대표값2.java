package algorithm.sort;

import java.util.Arrays;
import java.util.Scanner;

public class 대표값2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }
        Arrays.sort(numbers);
        System.out.println(sum / 5);
        System.out.println(numbers[2]);
    }
}

/* input
10
40
30
60
30
 */

/* output
34
30
 */