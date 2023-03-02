package algorithm.sum;

import java.io.*;
import java.util.StringTokenizer;

public class 인간_컴퓨터_상호작용 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int q = Integer.parseInt(br.readLine());

        int[][] S = new int[s.length()][26];
        S[0][s.charAt(0) - 'a']++;
        for (int i = 1; i < s.length(); i++) {
            int c = s.charAt(i) - 'a';
            System.arraycopy(S[i - 1], 0, S[i], 0, 26);
            S[i][c]++;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        while (q-- > 0) {
            st = new StringTokenizer(br.readLine());
            int alphabet = st.nextToken().charAt(0) - 'a';
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            if (start == 0) bw.write(S[end][alphabet] + "\n");
            else bw.write(S[end][alphabet] - S[start - 1][alphabet] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}

/* input
seungjaehwang
4
a 0 5
a 0 6
a 6 10
a 7 10
 */

/* output
0
1
2
1
 */