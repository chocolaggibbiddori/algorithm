package algorithm.string;

import java.util.Scanner;

public class 크로아티아_알파벳 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.replaceAll("dz=|c=|c-|d-|lj|nj|s=|z=", "a");

        System.out.println(str.length());
    }
}

/*
ljes=njak       6
 */

/*
ddz=z=          3
 */

/*
nljj            3
 */

/*
c=c=            2
 */

/*
dz=ak           3
 */