package j12_상속;

public class Human extends Animal { // extends(확장) + 상속받고자 하는 클래스명 => 상속완료

    public Human(String name){
        super(name);
        System.out.println("Human 생성");
        /*
       super(); -> 부모생성자 호출. (항상 존재하지만, 보기엔 생략이 되어있다.)
                -> 순서가 바뀌면 안된다. 항상 부모 생성자가 가장 위에 있어야 한다.
        */
    }

    @Override // @(어노테이션) : 해당 메소드가 '상위 객체로부터 재정의된 메소드입니다'를 표기
    public void move(){
        super.move(); // 상위객체의 변수를 호출. || super를 빼고 변수만 사용하면 재귀함수가 되어 무한 반복된다.
        System.out.println("두 발로 걷습니다.");
    }


/*
    public void runMove(){
        name; -> X : 상속을 해도 private은 사용이 불가하다.
        move();

 */
}