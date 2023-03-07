package algorithm.datastructure.set;

import java.util.Scanner;
import java.util.TreeSet;

public class 문자열_집합 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        TreeSet<String> set = new TreeSet<>();
        for (int i = 0; i < N; i++) {
            set.add(sc.next());
        }

        int count = 0;
        for (int i = 0; i < M; i++) {
            if (set.contains(sc.next())) count++;
        }

        System.out.println(count);
    }
}


/* input                output
5 11
baekjoononlinejudge
startlink
codeplus
sundaycoding
codingsh
baekjoon
codeplus
codeminus
startlink
starlink
sundaycoding
codingsh
codinghs
sondaycoding
startrink
icerink                 4
 */