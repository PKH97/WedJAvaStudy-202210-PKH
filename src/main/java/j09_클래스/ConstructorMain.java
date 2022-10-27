package j09_클래스;

public class ConstructorMain {
    public static void main(String[] args) {

        // 생성시 정보가 없어 null 표시됨
        Constructor c1 = new Constructor();
        c1.showInfo();

        Constructor c2 = new Constructor(10);
        c2.showInfo();

        Constructor c3 = new Constructor(10, "홍길동");
        c3.showInfo();

    }

}
