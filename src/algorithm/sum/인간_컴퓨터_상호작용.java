package algorithm.sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 인간_컴퓨터_상호작용 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int q = Integer.parseInt(br.readLine());

        int[][] S = new int[s.length()][26];
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) - 'a';

            for (int j = i; j < s.length(); j++) S[j][c]++;
        }

        StringTokenizer st;
        while (q-- > 0) {
            st = new StringTokenizer(br.readLine());
            int alphabet = st.nextToken().charAt(0) - 'a';
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            if (start > 0) System.out.println(S[end][alphabet] - S[start - 1][alphabet]);
            else System.out.println(S[end][alphabet]);
        }
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