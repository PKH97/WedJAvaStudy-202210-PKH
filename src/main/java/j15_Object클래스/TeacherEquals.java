package j15_Object클래스;

public class TeacherEquals {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("김준일", "코리아아이티");
        j15_Object클래스.equals.Teacher teacher2
                = new j15_Object클래스.equals.Teacher("김준일", "코리아아이티");

//        System.out.println(teacher1 == teacher2); -> 자료형이 안맞기 떄문에 사용불가
        System.out.println(teacher1.equals(teacher2)); // -> fals
        System.out.println(teacher1.hashCode() == teacher2.hashCode()); // -> true
    }
}
