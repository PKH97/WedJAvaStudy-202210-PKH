package j10_접근지정자.캡슐화;
/*
캡슐화는 정보의 보호를 위해 사용되고 getter와 setter를 사용한다.

 */

public class StudentService {

    public void registerStudent(){
        System.out.println("[ 학생 정보 등록 메뉴 ]");
        System.out.println("먼저 중복된 학생 정보인지 확인합니다.");
        doubleCheckStudent("김준일");
        System.out.println("학생정보를 등록합니다.");

    }

    private boolean doubleCheckStudent(String studentName){

        if(studentName.equals("김준일")){
            return false;
        }  // -> equals는 문자열 간 비교 (예) 1 == 1 => true

        return true;
    }

}
