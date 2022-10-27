package j09_클래스;

public class Student {
    //정답
    String schoolName;
    int studentCode;
    int studentYear;
    String name;

    void increaseStudentYear() {
        studentYear++;
        if (studentYear > 5) {
            System.out.println("더 이상 학년을 증가시킬 수 없습니다.");
            System.out.println();
            studentYear--; // -> 위에 증가시킨걸 감소 시킴
            return; // -> 흐름을 끊는다. (방법2)
        }
        showStudentInfo();
    }

//        }else{
//            showStudentInfo(); // -> 위의 코드를 호출하고 나면 밑으로 연결되어 호출된다. (방법1)
//        }
    void increaseStudentYear(int year){
        studentYear += year;
        if(studentYear > 5){
            System.out.println(year + "학년을 더하면 " + studentYear + "학년이 되어 5학년을 넘어섭니다.");
            System.out.println();
            studentYear -= year;
            return;
         }
        showStudentInfo();
    }


    void showStudentInfo(){
        System.out.println("학교: " + schoolName);
        System.out.println("학번: " + studentCode);
        System.out.println("학년: " + studentYear);
        System.out.println("이름: " + name);
        System.out.println();
    }



//My 문제 풀이
//    String schoolName;
//    int studentCode;
//    int studentYear;
//    String name;
//
//    Student(String schoolName, int studentCode, int studentYear, String name) {
//        this.schoolName = schoolName;
//        this.studentCode = studentCode;
//        this.studentYear = studentYear;
//        this.name = name;
//
//    } ->오답 1. 클래스에서 작성하지 않고 메인에 직접 작성
//
//    void increaseStudentYear(){
//        if (studentYear > 0 || studentYear < 5 ){
//            int year = studentYear +1;
//        } -> 오답 2. if를 잘못작성.
//    }
//    void showStudentInfo(){
//        System.out.println("학교: " + schoolName);
//        System.out.println("학번: " + studentCode);
//        System.out.println("학년: " + studentYear);
//        System.out.println("이름: " + name);
//       } -> 정답!
    }

