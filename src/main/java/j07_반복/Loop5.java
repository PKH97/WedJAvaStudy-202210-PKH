package j07_반복;

import java.util.Scanner;

public class Loop5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // for를 이용해서 구구단 출력하기
//        int dan = 0;
//
//        System.out.print("단 입력:");
//        dan = scanner.nextInt();
//
//        //문제. 2단에서 9단까지 출력도록 만드시오
//        //1.
//        for (int i = 0; i < 2 && i >9; i++) {
//            int num = i + 1;
//            System.out.println(dan + "x" + num + "=" + (dan * num));
//        }
//        //2.
//        for (int i = 0; i < 9; i++) {
//            int num = i + 1 && num - i;
//            System.out.println(dan + "x" + num + "=" + (dan * num));
//        }

        //문제 해설
        for (int i = 0; i < 8; i++) {
            int dan = i + 2;
            for (int j = 0; j < 9; j++) {
                int num = j + 1;
                System.out.println(dan + "x" + num + "=" + (dan * num));
            }

        }


    }
}
