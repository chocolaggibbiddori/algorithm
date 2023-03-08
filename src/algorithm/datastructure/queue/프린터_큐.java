package algorithm.datastructure.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 프린터_큐 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int document = Integer.parseInt(st.nextToken());

            Queue<Print> que = new LinkedList<>();
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) que.add(new Print(i, Integer.parseInt(st.nextToken())));

            int count = 1;
            while (!que.isEmpty()) {
                Print print = que.poll();
                boolean canPrint = que.stream().noneMatch(p -> print.rank < p.rank);

                if (canPrint) {
                    if (print.order == document) {
                        sb.append(count).append("\n");
                        break;
                    } else count++;
                } else que.add(print);
            }
        }

        System.out.print(sb);
    }

    private static class Print {
        int order;
        int rank;

        public Print(int order, int rank) {
            this.order = order;
            this.rank = rank;
        }
    }
}

/* input
3
1 0
5
4 2
1 2 3 4
6 0
1 1 9 1 1 1
 */

/* output
1
2
5
 */