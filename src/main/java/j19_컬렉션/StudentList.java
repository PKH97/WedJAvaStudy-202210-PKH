package j19_컬렉션;

import java.util.ArrayList;
import java.util.List;

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

//        for(int i = 0; i < students.size(); i++){
//            Student student = students.get(i);
//            if(students.get(i).equals(searchId)){
//                System.out.println(searchId + " 학번의 학생: " + students.get(i).getName());
//                break;
//            } -> 오답!
//        }
    }

}

