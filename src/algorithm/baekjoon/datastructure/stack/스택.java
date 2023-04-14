package algorithm.baekjoon.datastructure.stack;

import java.util.Scanner;
import java.util.Stack;

public class 스택 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            String command = sc.nextLine();
            switch (command.substring(0, 3)) {
                case "pus" -> stack.push(Integer.parseInt(command.substring(5)));
                case "pop" -> { if (stack.isEmpty()) sb.append(-1); else sb.append(stack.pop()); sb.append("\n"); }
                case "siz" -> { sb.append(stack.size()); sb.append("\n"); }
                case "emp" -> { sb.append(stack.isEmpty() ? 1 : 0); sb.append("\n"); }
                case "top" -> { if (stack.isEmpty()) sb.append(-1); else sb.append(stack.peek()); sb.append("\n"); }
            }
        }

        System.out.println(sb);
    }
}

/* input 1
14
push 1
push 2
top
size
empty
pop
pop
pop
size
empty
pop
push 3
empty
top
 */

/* output 1
2
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
7
pop
top
push 123
top
pop
top
pop
 */

/* output 2
-1
-1
123
123
-1
-1
 */