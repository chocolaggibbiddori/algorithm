package algorithm.datastructure.stack;

import java.util.Scanner;
import java.util.Stack;

public class 제로 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Stack<Integer> stack = new Stack<>();
        while (n-- > 0) {
            int num = sc.nextInt();

            if (num == 0) stack.pop();
            else stack.push(num);
        }

        int sum = 0;
        while (!stack.isEmpty()) sum += stack.pop();
        System.out.print(sum);
    }
}

/* input 1  output 1
4
3
0
4
0           0
 */

/* input 2  output 2
10
1
3
5
4
0
0
7
0
0
6           7
 */