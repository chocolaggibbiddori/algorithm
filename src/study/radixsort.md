# Radix Sort

## 기수 정렬이란?

&nbsp;&nbsp; 기수 정렬이란, 해당 자릿수에 있는 값들을 비교하면서 정렬하는 정렬 방식을 말한다.
기수 정렬의 시간 복잡도는 O(kn) (k는 최대 자릿수)으로 정렬 알고리즘 중에서 시간 복잡도가 가장 짧다.

<br>

## 기수 정렬 핵심 이론

![기수 정렬 1](images/radixsort/기수%20정렬%201.png)
![기수 정렬 2](images/radixsort/기수%20정렬%202.png)

https://visualgo.net/en/sorting

<br>

## 백준 10989(수 정렬하기 3)

```java
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 수_정렬하기_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Queue<String>[] queueArr = new Queue[10];
        for (int i = 0; i < queueArr.length; i++) {
            queueArr[i] = new LinkedList<>();
        }

        int maxRadix = 0;
        String[] A = new String[N];
        for (int i = 0; i < A.length; i++) {
            String next = sc.next();
            A[i] = next;

            int length = next.length();
            if (length > maxRadix) maxRadix = length;
        }

        int j = 1;
        while (maxRadix-- > 0) {
            for (String num : A) {
                int i;

                try { i = num.charAt(num.length() - j) - '0'; }
                catch (IndexOutOfBoundsException e) { i = 0; }

                queueArr[i].offer(num);
            }

            int idx = 0;
            for (Queue<String> queue : queueArr) {
                while (!queue.isEmpty()) {
                    A[idx++] = queue.poll();
                }
            }

            j++;
        }

        System.out.println(Arrays.toString(A));
    }
}
```