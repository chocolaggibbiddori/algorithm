package algorithm.bruteforce;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class 셀프_넘버 {

    public static void main(String[] args) throws IOException {
        boolean[] arr = new boolean[10036];
        for (int a = 0; a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                for (int c = 0; c < 10; c++) {
                    for (int d = 0; d < 10; d++) {
                        arr[1001 * a + 101 * b + 11 * c + 2 * d] = true;
                    }
                }
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 1; i < 10000; i++) {
            if (!arr[i]) {
                bw.write(i + "\n");
            }
        }

        bw.flush();
        bw.close();
    }
}

/*
1
3
5
7
9
20
31
42
53
64
 |
 |       <-- a lot more numbers
 |
9903
9914
9925
9927
9938
9949
9960
9971
9982
9993
 */