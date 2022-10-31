package j12_상속;

public class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal();
        Human human = new Human("김준일");
        Tiger tiger = new Tiger("무궁");

//        animal.move();
        human.move();
        tiger.move();

        System.out.println("사람의 이름: " + human.getName());
        System.out.println("호랑이의 이름: " + tiger.getName());

    }
}
/*
-부모클래스가 먼저 생성되고 자식클래스가 나중에 생성된다.

※중요!!※
method overriding(메소드 오버라이딩/오버라이드)
: [ 재정의 ]
-상위 객체(Animal)의 메소드를 하위 객체(Human)에서 다시 정의하는 행위
-구분을 위해 어노테이션을 달아주어야 한다.

 */