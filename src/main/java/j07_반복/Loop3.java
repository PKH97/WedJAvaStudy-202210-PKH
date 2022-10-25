package j07_반복;

import java.util.Scanner;

public class Loop3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 0;

        System.out.println("몇번 반복할지 입력하세요: ");
        n = scanner.nextInt();

        //문1) 1~5까지 순서대로 나오도록 작성하시오
        for (int i = 0; i < n; i++) {
            System.out.println("i: " + (i + 1));
        }

        //문2) 1~5까지 역순서대로 나오도록 작성하시오
        for (int i = 0; i < n; i++) {
            System.out.println("i: " + (n - i));
        }

    }
}
