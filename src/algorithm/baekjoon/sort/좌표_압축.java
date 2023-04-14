package algorithm.baekjoon.sort;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class 좌표_압축 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        TreeSet<Integer> set = new TreeSet<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
            set.add(num);
        }

        Map<Integer, Integer> map = new HashMap<>();
        int idx = 0;
        for (int s : set) {
            map.put(s, idx++);
        }

        for (int a : arr) {
            bw.write(map.get(a) + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}

/* input 1
5
2 4 -10 4 -9
 */

/* output 1
2 3 0 3 1
 */

/* input 2
6
1000 999 1000 999 1000 999
 */

/* output 2
1 0 1 0 1 0
 */