package algorithm.baekjoon.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 다이얼 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Map<Character, Integer> map = new HashMap<>();
        char c = 'A';
        for (int i = 0; c < 'Z'; i++) {
            map.put(c++, i / 3 + 3);
            if (c == 'S') i--;
        }
        map.put('Z', 10);
        System.out.println(map);

        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char alphabet = str.charAt(i);
            sum += map.get(alphabet);
        }

        System.out.println(sum);
    }
}

/*
WA          13
 */

/*
UNUCIC      36
 */