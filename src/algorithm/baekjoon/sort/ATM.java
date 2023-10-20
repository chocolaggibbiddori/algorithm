package algorithm.baekjoon.sort;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ATM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        StringTokenizer st = new StringTokenizer(sc.nextLine());

        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int start = 1; start < arr.length; start++) {
            int temp = arr[start];
            int prevIdx = start - 1;

            while (prevIdx >= 0) {
                int target = arr[prevIdx];
                if (temp >= target) break;
                arr[prevIdx + 1] = target;
                prevIdx--;
            }

            arr[prevIdx + 1] = temp;
        }

        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            answer += (arr[i] * (arr.length - i));
        }

        System.out.println(answer);
    }
}

/* input
5
3 1 4 3 2
 */

/* output
32
 */
