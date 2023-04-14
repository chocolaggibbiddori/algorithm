package algorithm.baekjoon.sort;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class 단어_정렬 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        TreeSet<String> set = new TreeSet<>(Comparator.comparingInt(String::length).thenComparing(String::compareTo));
        for (int i = 0; i < N; i++) set.add(sc.next());

        set.forEach(System.out::println);
    }
}

/* input
13
but
i
wont
hesitate
no
more
no
more
it
cannot
wait
im
yours
 */

/* output
i
im
it
no
but
more
wait
wont
yours
cannot
hesitate
 */