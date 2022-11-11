package j21_익명클래스;

public class Main {
    public static void main(String[] args) {

        Interface1 interface1 = new Class1();
        Interface1 interface2 = new Class1();
        Interface1 interface3 = new Class1();
        Interface1 interface4 = new Class1();
        Interface1 interface5 = new Class1();

        interface1.methodName();
        interface2.methodName();
        interface3.methodName();
        interface4.methodName();
        interface5.methodName();

        Interface1 interface6 = new Interface1() {
            @Override
            public void methodName() {
                System.out.println("익명클래스로 정의한 메소드");
            }
            @Override
            public void methodName2(){
                System.out.println("재정의");
            }
        };

        Interface1 interface7 = new Interface1() {
            @Override
            public void methodName() {
                System.out.println("익명클래스로 정의한 메소드");
            }
        };

        interface6.methodName();
        interface6.methodName2();

        interface7.methodName();
        interface7.methodName2();



    }
}
