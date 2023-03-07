package algorithm.greedy;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ATM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        StringTokenizer st = new StringTokenizer(sc.nextLine());
        int[] A = new int[n];
        for (int i = 0; i < n; i++) A[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(A);

        int sum = 0;
        for (int a : A) sum += n-- * a;

        System.out.println(sum);
    }
}

/* input        output
5
3 1 4 3 2       32
 */