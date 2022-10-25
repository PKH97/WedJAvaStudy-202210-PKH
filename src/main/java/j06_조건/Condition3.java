package j06_조건;

import java.util.Scanner;

public class Condition3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //문제 조건
        /*
        score가 0보다 작거나 100보다 크면 grade는 X
        score -> 90 ~ 100 grade = A
        score -> 80 ~ 89 grade = B
        score -> 70 ~ 79 grade = C
        score -> 60 ~ 69 grade = D
        score -> 0 ~ 59 grade = F

        입력한 점수는 __이며 학점은 _입니다
         */

        /* ----- MY문풀 ----- */
//        int score = 0;              //시험 점수
//        String grade = null;        //학점(등급)
//
//        System.out.print("점수를 입력하세요.");
//        score = scanner.nextInt();

//        if(score >= 90 && score <= 100){
//            grade = "A";
//        }else if(score >= 80 && score <= 89){
//            grade = "B";
//        }else if(score >= 70 && score <= 79){
//            grade = "C";
//        }else if(score >= 60 && score <= 69){
//            grade = "D";
//        }else{
//            grade = "F";
//        }
//
//        System.out.println("입력한 점수는 " + score +"이며 학점은" + grade +"입니다.");

        /* ----- 정답 ----- */
        int score = 0;              //시험 점수
        String grade = null;        //학점(등급)

        System.out.print("점수를 입력하세요.");
        score = scanner.nextInt();

        if(score < 0 || score > 100){   // 오답노트1 ---> 해당 조건식을 작성하지 않았음. (문제를 잘 읽을것!!)
            grade = "X";
        }else if (score > 89){        // 오답노트2 ---> 더욱 간결하게 조건식을 작성 할 수 있다.
            grade = "A";
        }else if (score > 79){
            grade = "B";
        }else if (score > 69){
            grade = "C";
        }else if (score > 59){
            grade = "D";
        }else{
            grade = "F";
        }

        System.out.println("입력한 점수는 " + score +"이며 학점은" + grade +"입니다.");





    }

}
