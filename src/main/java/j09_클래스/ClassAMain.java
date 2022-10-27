package j09_클래스;

public class ClassAMain {

    public static void main(String[] args) {
        /*
        생성자가 항상 먼저 실행된다.
        생성자에 오버로딩이 되면 기본생성자는 사용X
         -> 다른 생성자를 만들면 기본도 사용가능.
         */
        System.out.println(new ClassA());
        System.out.println(new ClassA());
        System.out.println(new ClassA());
        System.out.println(new ClassA());

        ClassA a1 = new ClassA();
        ClassA a2 = new ClassA();

        a1.name = "김준일";
        System.out.println(a1.name);

        a2.name = "김준이";
        System.out.println(a1.name);
        System.out.println(a2.name);

        //System.out.println(a1.callName()); -> 반환할 수 있는게 없어 출력 X
        a1.callName();
        a2.callName();

    }

}
/*
ClassName Student
Propertiex(속성) = (멤버)변수
schoolname St
studentCode int
studentYear int
name St

Function(기능) = (멤버)메소드
increaseStudentYear() - 호출시에 현재 학년을 1학년 증가 (최대 5학년)
showStudentInfo() - 학생정보출력

---------------------------------
부산대학교
20220001
2
김준일

increaseStudentYear();
showStudentInfo();
부산대학교
20220001
3
김준일


 */