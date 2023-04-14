package algorithm.baekjoon.datastructure.queue;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class 덱 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Deque<Integer> deque = new LinkedList<>();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (n-- > 0) {
            switch (sc.next()) {
                case "push_front" -> deque.addFirst(sc.nextInt());
                case "push_back" -> deque.addLast(sc.nextInt());
                case "pop_front" -> bw.write((deque.isEmpty() ? -1 : deque.pollFirst()) + "\n");
                case "pop_back" -> bw.write((deque.isEmpty() ? -1 : deque.pollLast()) + "\n");
                case "size" -> bw.write(deque.size() + "\n");
                case "empty" -> bw.write((deque.isEmpty() ? 1 : 0) + "\n");
                case "front" -> bw.write((deque.isEmpty() ? -1 : deque.peekFirst()) + "\n");
                case "back" -> bw.write((deque.isEmpty() ? -1 : deque.peekLast()) + "\n");
            }
        }

        bw.flush();
        bw.close();
    }
}

/* input 1
15
push_back 1
push_front 2
front
back
size
empty
pop_front
pop_back
pop_front
size
empty
pop_back
push_front 3
empty
front
 */

/* output 1
2
1
2
0
2
1
-1
0
1
-1
0
3
 */

/* input 2
22
front
back
pop_front
pop_back
push_front 1
front
pop_back
push_back 2
back
pop_front
push_front 10
push_front 333
front
back
pop_back
pop_back
push_back 20
push_back 1234
front
back
pop_back
pop_back
 */

/* output 2
-1
-1
-1
-1
1
1
2
2
333
10
10
333
20
1234
1234
20
 */