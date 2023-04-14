package algorithm.baekjoon.datastructure.set;

import java.io.*;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class 숫자_카드 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        TreeSet<Integer> set = new TreeSet<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            if (set.contains(Integer.parseInt(st.nextToken()))) bw.write(1 + " ");
            else bw.write(0 + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}

/* input                    output
5
6 3 2 10 -10
8
10 9 -5 2 3 4 5 -10         1 0 0 1 1 0 0 1
 */