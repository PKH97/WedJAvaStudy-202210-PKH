package j09_클래스;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.schoolName = "부산대학교";
        s1.studentCode = 20220001;
        s1.studentYear = 1;
        s1.name = "홍길동";

        s2.schoolName = "부경대학교";
        s2.studentCode = 20220002;
        s2.studentYear = 2;
        s2.name = "황진이";

        s1.showStudentInfo();
        s2.showStudentInfo();

//        System.out.println("<<<<<<<<<<학년증가 반복>>>>>>>>>");
//        for(int i = 0; i < 10; i++) {
//            s1.increaseStudentYear();
//        }

        s1.increaseStudentYear(2);
        s1.increaseStudentYear(2);
        s1.increaseStudentYear(2);

        s1.showStudentInfo();

        s2.increaseStudentYear(5);

        s2.showStudentInfo();


//        s1.increaseStudentYear(); -> increaseStudentYear()사용하고
//        s1.showStudentInfo();     -> showStudentInfo()를 사용하면 증가.

/*
        My 문제 풀이
        Student student1 = new Student("부산대학교", );
        Student student2 = new Student();

        -> 오답 1.직접 정보를 입력해야한다.

        student1.showStudentInfo();
        System.out.println();
        student2.showStudentInfo();
        System.out.println();




        //이 뒤를 모르겠다.....ㅠ
*/
    }

}
