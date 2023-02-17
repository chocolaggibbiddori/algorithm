package algorithm.recursive;

import java.util.Scanner;

public class 별_찍기_10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(makeStar(N));
    }

    private static String makeStar(int n) {
        if (n == 1) return "*\n";

        StringBuilder sb = new StringBuilder();
        addStar(sb, makeStar(n / 3));
        addStarCenterBlank(sb, makeStar(n / 3));
        addStar(sb, makeStar(n / 3));

        return sb.toString();
    }

    private static void addStar(StringBuilder sb, String star) {
        String[] split = star.split("\n");

        for (String s : split) {
            sb.append(s).append(s).append(s).append("\n");
        }
    }

    private static void addStarCenterBlank(StringBuilder sb, String star) {
        String[] split = star.split("\n");

        for (String s : split) {
            sb.append(s).append(" ".repeat(split.length)).append(s).append("\n");
        }
    }
}

/* input
27
 */

/* output
 ***************************
 * ** ** ** ** ** ** ** ** *
 ***************************
 ***   ******   ******   ***
 * *   * ** *   * ** *   * *
 ***   ******   ******   ***
 ***************************
 * ** ** ** ** ** ** ** ** *
 ***************************
 *********         *********
 * ** ** *         * ** ** *
 *********         *********
 ***   ***         ***   ***
 * *   * *         * *   * *
 ***   ***         ***   ***
 *********         *********
 * ** ** *         * ** ** *
 *********         *********
 ***************************
 * ** ** ** ** ** ** ** ** *
 ***************************
 ***   ******   ******   ***
 * *   * ** *   * ** *   * *
 ***   ******   ******   ***
 ***************************
 * ** ** ** ** ** ** ** ** *
 ***************************
 */