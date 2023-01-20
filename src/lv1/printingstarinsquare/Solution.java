package lv1.printingstarinsquare;

import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
            //방법 1 : 제일 느림
//        StringBuilder star = new StringBuilder("");
//        for(int i = 1 ; i <= a ; i++) {
//            star.append("*");
//        }
//
//        for(int i = 1 ; i <= b ; i++) {
//        System.out.println(star.toString());
//        }
//
        //방법 2 : 느림
//        String s = "*";
//        s= s.repeat(a);
//        for(int i = 1 ; i <= b ; i++) {
//            System.out.println(s);
//        }
        //방법 3 : 제일 빠름. 단순하게 갈것.
        for(int i = 1 ; i <= b ; i++) {
            for(int j = 1 ; j <= a ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
