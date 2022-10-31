package j12_상속;

public class Tiger extends Animal {
    public Tiger(String name) {
        super(name);
    }

    @Override
    public void move() {
        super.move();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
}
// ctrl + o -> 오버라이드/임플리먼트 창이 뜬다.
//          -> shift + 방향키로 원하는 메소드를 정해 오버라이딩/임플리먼트 를 할 수있다.