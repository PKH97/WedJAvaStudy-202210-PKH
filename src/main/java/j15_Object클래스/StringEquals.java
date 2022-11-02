package j15_Object클래스;

public class StringEquals {
    public static void main(String[] args) {
        int i = 10;// 리터럴 상수: 어딘가에 있는 상수

        String name1 = "김준일";
        String name2 = "김준일";
        String name3 = new String("김준일");
        String name4 = new String("김준일");

        System.out.println(name1 + ", " + name2 + ", " + name3);

        System.out.println(name1 == name2); // -> true
        System.out.println(name1 == name3); // -> false
        System.out.println(name3 == name4); // -> false : ==는 값의 비교가 아닌 주소의 비교이다.
        System.out.println(name1.equals(name3)); // -> true : equals는 문자열의 값 비교에 사용(주소가 달라도 가능)
                                                // 객체간 비교에 사용가능

    }
}
