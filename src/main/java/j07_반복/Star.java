package j07_반복;

import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //문제) 거꾸로 만드시오
//        Scanner scanner = new Scanner(System.in);
//        int n = 0;
//
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < i + 1; j++) {
//
//                System.out.print("*");
//            }
//            System.out.println();

        //문제 풀이
        for(int i = 0; i < 10; i++) {
                for (int j = 0; j < 10 - i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        //문제2) 역별찍기
//            for(int i = 10; i < 0; i++){
//                for(int j = 10; j > 0; j++){
//                    System.out.print("*");
//                }
//                System.out.println();
//            }

        //문제2 풀이
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10 -i -1; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 0; i < 10; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }

            for(int j = 0; j < 10 - i; j++){
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
