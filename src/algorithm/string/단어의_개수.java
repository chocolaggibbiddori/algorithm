package algorithm.string;

import java.util.Scanner;

public class 단어의_개수 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();
        if (str.isBlank()) System.out.println(0);
        else System.out.println(str.split(" ").length);
    }
}

/*
The Curious Case of Benjamin Button         6
 */

/*
 The first character is a blank             6
 */

/*
The last character is a blank               6
 */