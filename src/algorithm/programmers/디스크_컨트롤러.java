package algorithm.programmers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class 디스크_컨트롤러 {

    public int solution(int[][] jobs) {

        int answer = 0;
        Arrays.sort(jobs, Comparator.comparingInt(j -> j[0]));

        PriorityQueue<int[]> jobQueue = new PriorityQueue<>(Comparator.comparingInt(j -> j[1]));
        int time = jobs[0][0];
        int count = 0;
        int i = 0;
        while (count++ < jobs.length) {
            for (; i < jobs.length; i++) {
                if (jobs[i][0] <= time) jobQueue.offer(jobs[i]);
                else break;
            }

            if (!jobQueue.isEmpty()) {
                int[] job = jobQueue.poll();
                time += job[1];
                answer += time - job[0];
            } else {
                time = jobs[i][0];
                count--;
            }
        }

        return answer / jobs.length;
    }
}
