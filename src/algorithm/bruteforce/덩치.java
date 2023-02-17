package algorithm.bruteforce;

import java.util.Scanner;

public class 덩치 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Person[] people = new Person[N];
        for (int i = 0; i < N; i++) {
            people[i] = new Person(sc.nextInt(), sc.nextInt());
        }

        for (Person me : people) {
            for (Person you : people) {
                me.smallerThan(you);
            }
        }

        for (Person person : people) {
            System.out.print(person.rank + " ");
        }
    }

    static class Person {
        int height;
        int weight;
        int rank;

        public Person(int height, int weight) {
            this.height = height;
            this.weight = weight;
            rank = 1;
        }

        void smallerThan(Person you) {
            if (you.height > height && you.weight > weight) {
                rank++;
            }
        }
    }
}

/* input
5
55 185
58 183
88 186
60 175
46 155
 */

/* output
2 2 1 2 5
 */