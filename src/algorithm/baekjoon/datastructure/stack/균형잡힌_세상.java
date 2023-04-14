package algorithm.baekjoon.datastructure.stack;

import java.util.Scanner;
import java.util.Stack;

public class 균형잡힌_세상 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        Label:
        while (true) {
            String s = sc.nextLine();

            if (s.equals(".")) break;

            stack.clear();

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                if (c == '(' || c == '[') stack.push(c);
                else if (c == ')') {
                    if (!stack.isEmpty() && stack.peek() == '(') stack.pop();
                    else {
                        sb.append("no").append("\n");
                        continue Label;
                    }
                } else if (c == ']') {
                    if (!stack.isEmpty() && stack.peek() == '[') stack.pop();
                    else {
                        sb.append("no").append("\n");
                        continue Label;
                    }
                }
            }

            if (stack.isEmpty()) sb.append("yes");
            else sb.append("no");
            sb.append("\n");
        }

        System.out.println(sb);
    }
}

/* input
So when I die (the [first] I will see in (heaven) is a score list).
[ first in ] ( first out ).
Half Moon tonight (At least it is better than no Moon at all].
A rope may form )( a trail in a maze.
Help( I[m being held prisoner in a fortune cookie factory)].
([ (([( [ ] ) ( ) (( ))] )) ]).
 .
.
 */

/* output
yes
yes
no
no
no
yes
yes
 */