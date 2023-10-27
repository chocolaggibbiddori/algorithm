package algorithm.baekjoon.search;

import java.util.*;

public class DFS와_BFS {

    static List<Integer>[] A;
    static boolean[] visited;
    static StringBuilder sb;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int V = sc.nextInt();

        sb = new StringBuilder();
        visited = new boolean[N + 1];
        A = new List[N + 1];
        for (int i = 0; i < A.length; i++) {
            A[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            A[u].add(v);
            A[v].add(u);
        }

        for (List<Integer> list : A) {
            list.sort(Comparator.naturalOrder());
        }

        dfs(V);

        sb.append("\n");
        Arrays.fill(visited, false);

        bfs(V);

        System.out.println(sb);
    }

    static void dfs(int vertex) {
        if (visited[vertex]) {
            return;
        }

        visited[vertex] = true;
        sb.append(vertex).append(" ");

        for (Integer i : A[vertex]) {
            dfs(i);
        }
    }

    static void bfs(int vertex) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(vertex);

        while (!queue.isEmpty()) {
            Integer p = queue.poll();
            if (visited[p]) continue;

            visited[p] = true;
            sb.append(p).append(" ");

            queue.addAll(A[p]);
        }
    }
}

/* input 1
4 5 1
1 2
1 3
1 4
2 4
3 4
 */

/* output 1
1 2 4 3
1 2 3 4
 */

/* input 2
5 5 3
5 4
5 2
1 2
3 4
3 1
 */

/* output 2
3 1 2 5 4
3 1 4 2 5
 */

/* input 3
1000 1 1000
999 1000
 */

/* output 3
1000 999
1000 999
 */