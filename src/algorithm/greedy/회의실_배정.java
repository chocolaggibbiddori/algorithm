package algorithm.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class 회의실_배정 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int max = 0;
        Meeting[] meetings = new Meeting[n];
        for (int i = 0; i < n; i++) {
            int startTime = sc.nextInt();
            int endTime = sc.nextInt();
            meetings[i] = new Meeting(startTime, endTime);

            if (endTime > max) max = endTime;
        }

        Arrays.sort(meetings,(m1, m2) -> {
            if (m1.endTime == m2.endTime) return Integer.compare(m1.startTime, m2.startTime);
            return Integer.compare(m1.endTime, m2.endTime);
        });

        int now = 0;
        int count = 0;
        for (Meeting meeting : meetings) {
            if (meeting.startTime < now) continue;
            count++;
            now = meeting.endTime;
        }

        System.out.println(count);
    }

    private static class Meeting {
        int startTime;
        int endTime;

        public Meeting(int startTime, int endTime) {
            this.startTime = startTime;
            this.endTime = endTime;
        }
    }
}

/* input        output
11
1 4
3 5
0 6
5 7
3 8
5 9
6 10
8 11
8 12
2 13
12 14           4
 */