package j13_추상화.인터페이스;
/*
;가 붙은 메소드는 추상

Interface(인터페이스) :
1. 기본적으로 모든 메소드가 추상메소드로 정의된다.
2. 일반 메소드를 정의하기 위해서는 default 키워드를 사용하여야한다.
3. 생성자 정의가 불가능하다.
4. 일반 변수 선언이 불가능하다.
5. 상수는 선언이 가능하다(접근지정자 public 사용, private은 불가)

 */

public interface Press {
    public final String NAME = "Button"; // [상수선언, 초기화]
    public void onPressed();

/*
    private String name;  -> [변수선언]
    public Switch(){}  -> [생성자]
    public default void pop(){}  -> [일반메소드]
*/

}

