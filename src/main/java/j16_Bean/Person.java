package j16_Bean;

public class Person {
    private final String name;  // 멤버변수에 final를 선언하면 필수값이 된다.
    private int age;
    //필수 값▲

//    public Person(){} 노아규먼트는 생성 불가  NoAgeConstructor는 requiredAgeConstructor와 함께 쓸 수 없다

    public Person(String name){   // <-  requiredAgeConstructor
        this.name = name;
    }

    //필수 생성자▼
    public Person(String name, int age) {  // <- AllAgeConstructor
        this.name = name;
        this.age = age;
    }

}
