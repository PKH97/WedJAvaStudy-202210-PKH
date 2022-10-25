package j08_메소드;

import java.util.Scanner;

public class Method2 {
    /*
    * 별찍기
    *
    * */
    public static String getStar(int select, int n){
        String result = ""; // ""을 입력 하는 이유 => 문자열이기 때문("" = null)

        if(select == 1){
            for(int i = 0; i < n; i++){
                for(int j = 0; j < i + 1; j++){
                    result += "*";
                }
                result += "\n";
            }
        } else if (select == 2) {
            for(int i = 0; i < n; i++){
                for(int j = 0; j < i - 1; j++){
                    result += "*";
                }
                result += "\n";
            }
            // = System.out.println("*\n**\n***~~");

        } else if (select == 3) {

        } else if (select == 4) {

        }else {
            System.out.println("입력오류!!!!");
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 입력
        int n = 0;
        int select = 0;

        System.out.print("별의 개수입력: ");
        n = scanner.nextInt();


        System.out.println("1. 왼쪽에 치우친 중가하는 별");
        System.out.println("2. 오른쪽에 치우친 중가하는 별");
        System.out.println("3. 왼쪽에 치우친 감소하는 별");
        System.out.println("4. 오른쪽에 치우친 감소하는 별");
        System.out.print("메뉴선택: ");
        select = scanner.nextInt();

        String star = getStar(select, n);

        System.out.println("[ 결과 ]");
        System.out.println(star);


    }

}
