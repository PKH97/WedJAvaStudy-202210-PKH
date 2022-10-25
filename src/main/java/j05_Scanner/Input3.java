package j05_Scanner;

import java.util.Scanner;

public class Input3 {

    /*
        <문제>
        이름: 홍길동     name
        나이: 29        age
        주소: 부산 동래구 사직동 address
        연락처: 010 9988 7766 phone

        사용자의 이름은 홍길동이고 나이는 29입니다.
        주소는 부산 동래구 사직동이며 연락처는 010 9988 7766입니다.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        <문제 풀이>
//        System.out.println("사용자의 이름은");
//        String name = scanner.next();
//        System.out.println("이고");
//
//        System.out.println("나이는 ");
//        int age = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("입니다.");
//
//        System.out.println("주소는 ");
//        String address = scanner.nextLine();
//        System.out.println("이며");
//
//        System.out.println("연락처는 ");
//        String phone = scanner.nextLine();
//        System.out.println("입니다.");

        // 문제 답
        String name = null;
        int age = 0;
        String address = null;
        String phone = null;

        System.out.println("이름:");
        name = scanner.next();

        System.out.println("나이:");
        age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("주소:");
        address = scanner.nextLine();

        System.out.println("연락처");
        phone = scanner.nextLine();

        System.out.println("사용자의 이름은" + name + "이고 나이는" + age + "입니다.");
        System.out.println("주소는" + address + "이며 연락처는 " + phone + "입니다.");

        /*
        이렇게 코드를 작성하면 버퍼가 생긴다.(?)
        nextInt()은 스페이스와 엔터를 인식하지만, nextLine()는 인식하지 않는다.
        따라서 next()나 nextInt()를 사용한 뒤 nextLine()를 사용할 때는
        반드시 next()나 nextInt()의 뒤에 scanner.nextLine();를 사용한다.
         */

    }

}
