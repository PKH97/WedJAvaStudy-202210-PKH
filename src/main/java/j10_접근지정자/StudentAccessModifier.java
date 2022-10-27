package j10_접근지정자;

public class StudentAccessModifier {

    private int code; //이해하기 어렵다면 >>멤버 변수들은 프라이빗이 디폴트<<라는걸 외워두자!
    private String name;

    // 앞에 아무런 접근지정자를 지정해 주지 않으면 디폴트가 기본으로 적용된다.
    public StudentAccessModifier(int code, String name) {
        this.code = code;
        this.name = name;
    }

    //set: 카멜표기법으로 작성된다, 밖으로부터 정보를 받아 안으로 넣는다.
    //get: 안에 있는 정보를 밖으로 끄집어 낸다
    // getter + setter의 단축키 : Alt + Ins
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void showInfo(){
        System.out.println("학번: " + this.code);
        System.out.println("이름: " + name);
    }

}
