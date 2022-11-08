package j19_컬렉션;

import java.util.*;

public class StudentList {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();
        students.add(new Student(2022001, "김준일"));
        students.add(new Student(2022002, "정빈"));
        students.add(new Student(2022003, "김규민"));
        students.add(new Student(2022004, "박경효"));
        students.add(new Student(2022005, "김혜진"));
        students.add(new Student(2022006, "김지향"));

        String searchName = "김규민";

        // 포이치방식
        for(Student student : students){
            if(student.getName().equals(searchName)){

                System.out.println(searchName + " 학생의 학번: " + student.getId());
                break;
            }
        }

        //일반 포문
        for(int i = 0; i < students.size(); i++){
            Student student = students.get(i);
            if(students.get(i).getName().equals(searchName)){
                System.out.println(searchName + " 학생의 학번: " + students.get(i).getId());
                break;
            }
        }

        //포이치방식
        int searchId = 2022002;
        for(Student student : students){
            if(student.getId() == searchId){
                students.remove(students.indexOf(student));
                break;
            }
        }
        System.out.println(students);

        //일반 포문
        for(int i = 0; i < students.size(); i++){
            Student student = students.get(i);
            if(student.getId() == searchId){
                students.remove(i);
                break;
            }
        }
        System.out.println(students);

        /*
        문제1.
        id = 2022003학생을 찾아서 그 학생의 이름이 김규민이면 김경민으로 바꿔라
         */
        searchId = 2022003;

        /* 정답 */
        for(Student student : students){
            if(student.getId() == searchId && student.getName().equals("김규민")){
                student.setName("김경민");
                break;
            }
        }
        System.out.println(students);
        System.out.println("----------------------------------------------");
        for(Student student : students){
            System.out.println(student);
        }

        System.out.println();
//        --- 내가 작성한 답 ---
//        for(Student student : students){
//            if(student.getId() == searchId){
//                students.remove(student.)
//                break;
//            }
//        }
        /*
        문제2.
        박경효를 박창우로 변경
         */
        searchId = 2022004;

        /* 정답 */
        Iterator<Student> iterator = students.iterator();
        while(iterator.hasNext()){
            Student student = iterator.next();
            if (student.getId() == searchId){
                student.setName("박창우");
                break;
            }
        }
        System.out.println(students);
        System.out.println();

//        --- 내가 작성한 답 ---
//        Iterator<Student> iterator = students.iterator();
//
//        while (iterator.hasNext()){
//            if(iterator.hasNext() == ){
//                student.setName("김경민");
//                break;
//            }
//        }
//        System.out.println(students);

        /*
        문제3.
        아래 배열을 거꾸로 출력하시오
         */
        List<Student> reverseStudents = new ArrayList<Student>();
        //방법1
        for(int i = 0; i < students.size(); i++){
           reverseStudents.add(students.get(students.size() - 1 - i));
        }
        System.out.println(reverseStudents);
        //방법2
        for(Student student : students){
            reverseStudents.add(0, student);
        }
        System.out.println(reverseStudents);

        //방법3
        Collections.reverse(reverseStudents);
        System.out.println(reverseStudents);

        /*
        문제4.
            idList
            nameList
            각각의 리스트를 출력하시오
         */

        List<Integer> idList = new ArrayList<Integer>();
        List<String> nameList = new ArrayList<String>();

        for(Student student : students){
            idList.add(student.getId());
            nameList.add(student.getName());
        }
        System.out.println(idList);
        System.out.println(nameList);

        /*
        문제5.
            비워진 students에 다시 값 넣기
         */
        students.clear();
        System.out.println(students);

        //정답
        for(int i = 0; i < idList.size(); i++){
            Student student = new Student(idList.get(i), nameList.get(i));
            students.add(student);
        }
        System.out.println(students);

//        --- 내가 작성한 답 ---
//        for(Student student : students){
//            students.add(student.getId(idList));
//            students.add(student.getName(nameList));
//        }
//        System.out.println(students);


        /*--------------------11.07----------------------*/
//        for(int i = 0; i < students.size(); i++){
//            Student student = students.get(i);
//            if(students.get(i).equals(searchId)){
//                System.out.println(searchId + " 학번의 학생: " + students.get(i).getName());
//                break;
//            } -> 오답!
//        }
    }

}

