package algorithm.sort;

import java.util.Arrays;
import java.util.Scanner;

public class 나이순_정렬 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Member[] members = new Member[N];
        for (int i = 0; i < N; i++) {
            members[i] = new Member(i, sc.nextInt(), sc.next());
        }

        Arrays.sort(members);
        for (Member member : members) {
            System.out.println(member);
        }
    }

    static class Member implements Comparable<Member> {
        int order;
        int age;
        String name;

        public Member(int order, int age, String name) {
            this.order = order;
            this.age = age;
            this.name = name;
        }

        @Override
        public int compareTo(Member m) {
            if (age == m.age) return Integer.compare(order, m.order);
            else return Integer.compare(age, m.age);
        }

        @Override
        public String toString() {
            return age + " " + name;
        }
    }
}

/* input
3
21 Junkyu
21 Dohyun
20 Sunyoung
 */

/* output
20 Sunyoung
21 Junkyu
21 Dohyun
 */