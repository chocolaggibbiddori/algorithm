package algorithm.greedy;

import java.util.Scanner;
import java.util.StringTokenizer;

public class 주유소 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        StringTokenizer st = new StringTokenizer(sc.nextLine());
        int[] roads = new int[n];
        for (int i = 0; i < n - 1; i++) roads[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(sc.nextLine());
        int answer = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            int price = Integer.parseInt(st.nextToken());
            if (min > price) min = price;
            answer += min * roads[i];
        }

        System.out.println(answer);
    }
}

/* input 1          output 1
4
2 3 1
5 2 4 1             18
 */

/* input 2          output 2
4
3 3 4
1 1 1 1             10
 */