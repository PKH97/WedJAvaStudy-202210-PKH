package j09_클래스;

public class Constructor {

    int num;
    String name;

    Constructor(){
        System.out.println("NoArgsConstructor(기본생성자)");
    }

    Constructor(int num){
        System.out.println("RequiredNoArgsConstructor(int 매개변수를 필수로 하는 생성자)");
        this.num = num;
    }

    Constructor(String name){
        System.out.println("RequiredNoArgsConstructor(String 매개변수를 필수로 하는 생성자)");
        this.name = name;
    }

    Constructor(int num, String name){
        System.out.println("AllArgsConstructor(전체 생성자)");
        this.num = num;
        this.name = name;
    }

    void showInfo(){
        System.out.println("num: " + num);
        System.out.println("name: " + name);
    }

}
/*
생성자를 통해 값을 미리 주입한다.
지역변수는 변역변수보다 우선도가 낮다??높다??? <- 먼말이야...
매개변수명을 바꾸면 지역변수 -> 변역변수로 영향
    but, 바뀐 변수명으로 인해 헷갈리고 보기 깔끔하지 못하다.
        -> 이에 대한 해결방안: this.을 사용
        -> 메인에서 간단한 정보만 입력하는 것으로 출력이 쉬워진다.


 */
