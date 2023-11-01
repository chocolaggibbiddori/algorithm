# Prime number

## 소수란?

&nbsp;&nbsp; 소수란, 자연수 중에서 약수가 2개인 수를 말한다.

<br>

## 에라토스테네스의 체

[에라토스테네스의 체 원리 - 나무위키](https://namu.wiki/w/%EC%97%90%EB%9D%BC%ED%86%A0%EC%8A%A4%ED%85%8C%EB%84%A4%EC%8A%A4%EC%9D%98%20%EC%B2%B4)

<br>

## 백준 1978(소수 찾기)

> 에라토스테네스의 체를 이용

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 소수_찾기 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());

        boolean[] A = new boolean[1001];
        Arrays.fill(A, true);
        A[1] = false;

        for (int i = 2; i <= Math.sqrt(A.length); i++) {
            if (A[i]) {
                for (int j = i * 2; j < A.length; j += i) {
                    A[j] = false;
                }
            }
        }

        st = new StringTokenizer(bf.readLine());
        int count = 0;
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (A[num]) count++;
        }

        System.out.println(count);
    }
}
```

<br>

> 단순 소수 판별 로직

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 소수_찾기 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(bf.readLine());
        int count = 0;
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (isPrimeNumber(num)) count++;
        }

        System.out.println(count);
    }

    private static boolean isPrimeNumber(int num) {
        if (num == 1) return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }

        return true;
    }
}
```