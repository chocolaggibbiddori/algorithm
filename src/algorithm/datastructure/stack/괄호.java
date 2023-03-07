package algorithm.datastructure.stack;

import java.util.Scanner;
import java.util.Stack;

public class 괄호 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        Label:
        while (t-- > 0) {
            Stack<Character> stack = new Stack<>();
            String s = sc.next();

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                if (c == '(') stack.push(c);
                else {
                    if (!stack.isEmpty()) stack.pop();
                    else {
                        sb.append("NO").append("\n");
                        continue Label;
                    }
                }
            }

            if (stack.isEmpty()) sb.append("YES");
            else sb.append("NO");
            sb.append("\n");
        }

        System.out.println(sb);
    }
}

/* input 1
6
(())())
(((()())()
(()())((()))
((()()(()))(((())))()
()()()()(()()())()
(()((())()(
 */

/* output 1
NO
NO
YES
NO
YES
NO
 */

/* input 2
3
((
))
())(()
 */

/* output 2
NO
NO
NO
 */