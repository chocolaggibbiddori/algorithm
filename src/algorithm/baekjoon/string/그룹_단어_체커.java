package algorithm.baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class 그룹_단어_체커 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        int count = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            String str = bf.readLine();
            char now = 0;
            set.clear();
            count++;

            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);

                if (c != now) {
                    if (!set.contains(c)) {
                        now = c;
                        set.add(c);
                    } else {
                        count--;
                        break;
                    }
                }
            }
        }

        System.out.println(count);
    }
}

/*
3               3
happy
new
year
 */

/*
4               1
aba
abab
abcabc
a
 */

/*
5               4
ab
aa
aca
ba
bb
 */

/*
2               0
yzyzy
zyzyz
 */

/*
1               1
z
 */