package j09_클래스;

public class ClassA {

    int num;
    String name;
    double score;

    /*▼생성자▼ -> 생성자는 반환 자료형 X, 클래스명과 동일.
                 생성자는 항상 반환되는 주소가 있다.(int, String 같은건 안됨)
                 메소드처럼 사용 가능(오버로딩 등 가능)
                 생성자에 오버로딩이 되면 기본의 생성자는 사용X
     */
    ClassA (){
        // 기본 생성자도 사용할려면 두가지로 오버로딩이 필요
    }

    ClassA(int a){
        System.out.println("a: " + a);
        System.out.println("Class를 생성합니다.");
    }

    void callName(){
        System.out.println(name + "을(를) 부릅니다.");
    }

}
