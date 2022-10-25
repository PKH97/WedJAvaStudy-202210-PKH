package j05_Scanner;

import java.util.Scanner;

public class Input1 {
    public static void main(String[] args) {
        /* Scanner class */
        String name = "김준일";

        Scanner scanner = new Scanner(System.in);
        /* new Scanner(System.out)의 선언은 최초의 한번만 한다.*/

        String s = scanner.nextLine();
        String s2 = scanner.nextLine();
        String s3 = scanner.nextLine();
        /**
         * 문자열 입력
         *   next()      -> 띄어쓰기 포함x
         *   nextLine()  -> 띄어쓰기 포함o
         */


        System.out.println("입력 받은 값1: " + s);
        System.out.println("입력 받은 값2: " + s2);
        System.out.println("입력 받은 값3: " + s3);

    }

}
