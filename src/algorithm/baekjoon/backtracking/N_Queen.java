package algorithm.baekjoon.backtracking;

import java.util.Scanner;

public class N_Queen {

    static boolean[][] board;
    static int count;
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        board = new boolean[n][n];
        count = 0;
        backtracking(0, 0);

        System.out.println(count);
    }

    static void backtracking(int row, int queenCount) {
        if (row == n) {
            if (queenCount == n) count++;
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isNonAttack(row, col)) {
                board[row][col] = true;
                backtracking(row + 1, ++queenCount);
                board[row][col] = false;
                queenCount--;
            }
        }
    }

    static boolean isNonAttack(int row, int col) {
        if (row == 0) return true;
        return checkUp(row, col) && checkLeftUp(row, col) && checkRightUp(row, col);
    }

    static boolean checkUp(int row, int col) {
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col]) return false;
        }
        return true;
    }

    static boolean checkLeftUp(int row, int col) {
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j]) return false;
        }
        return true;
    }

    static boolean checkRightUp(int row, int col) {
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j]) return false;
        }
        return true;
    }
}

/* input        output
   8            92
 */