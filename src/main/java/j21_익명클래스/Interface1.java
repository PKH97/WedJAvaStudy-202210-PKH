package j21_익명클래스;

public interface Interface1 {
    public void methodName();
    public default void methodName2(){
        System.out.println("디폴트 메소드");
    }
}
