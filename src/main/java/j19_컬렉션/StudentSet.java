package j19_컬렉션;

import java.util.*;

public class StudentSet {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<Student>();
        students.add(new Student(20220001, "김준일"));
        students.add(new Student(20220002, "정빈"));
        students.add(new Student(20220003, "김규민"));
        students.add(new Student(20220004, "박경효"));
        students.add(new Student(20220005, "김혜진"));
        students.add(new Student(20220006, "김지향"));

        System.out.println(students);

        /*
        숙제1. 김혜지 학생의 학번을 출력하세요.
        숙제2. 20220004 학번을 가진 학생의 이름을 설민수로 변경하세요.
        숙제3. 20220001 학번이 존재하면 해당 학생을 삭제하세요.

        심화문제
            ste -> list 변환
            해당 list를 학번 순서에 맞게 정렬하시오.
         */
        /*  ※ 정답 풀이 ※  */
        //문제1
        String searchName = "김혜진";
        for (Student student : students) {
            if(student.getName().equals(searchName)){
                System.out.println(searchName + "학생의 학번: " + student.getId());
                break;
            }
        }

        //문제2
        int searchId = 20220004;
        for(Student student : students){
            if(student.getId() == searchId){
                student.setName("설민수");
                break;
            }
        }
        System.out.println(students);

        //문제3
        searchId = 20220001;
        for (Student student : students){
            if(student.getId() == searchId){
                students.remove(student);
                break;
            }
        }
        System.out.println(students);

        //심화문제
        int cmpId = 20220000;
        int j = 0;

        List<Student> sorStudents = new ArrayList<Student>();
        for(int i = 0; i < students.size() + 1; i++){
            for(Student student : students){
                if(student.getId() == cmpId){
                    sorStudents.add(student);
                }
            }
            cmpId++;
        }
        System.out.println(sorStudents);


    }
}
