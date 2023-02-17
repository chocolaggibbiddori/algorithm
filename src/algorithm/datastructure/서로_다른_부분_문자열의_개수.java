package algorithm.datastructure;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class 서로_다른_부분_문자열의_개수 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        Set<String> set = new HashSet<>();
        for (int length = 1; length <= str.length(); length++) {
            for (int i = 0; i <= str.length() - length; i++) {
                set.add(str.substring(i, i + length));
            }
        }

        System.out.println(set.size());
    }
}

/* input            output
ababc               12
 */