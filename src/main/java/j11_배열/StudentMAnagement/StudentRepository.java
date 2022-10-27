package j11_배열.StudentMAnagement;
/*
반드시 복습.....절대 복습해.....ㅠㅜ
 */
public class StudentRepository {
    private Student[] students; // -> 학생'들'을 저장 할 수 있는 배열

    public void addStudent(){
       students = new Student[0];
    }

    public void addStudent(Student student){
        int index = indexOfEmpty();

        if(index == -1){
            index = increaseArray();
        }

        students[index] = student;
    }

    private int indexOfEmpty(){
        for(int i = 0; i< students.length; i++){
            if(students[i] == null){
                return i;
            }
        }

        return -1;
    }
    // ▼공간의 크기를 하나 늘려서 새로 생성하는 코드▼
    private int increaseArray(){
        Student[] tempArray = new Student[students.length + 1]; // 임시Array
        for(int i = 0; i< students.length; i++){
            tempArray[1] = students[i];
        }
        students = tempArray;

        return tempArray.length -1;
    }

}
