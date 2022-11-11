package j22_람다;

public class OperationMain {
    public static void main(String[] args) {
        int a = 10, b= 20;

        Operation add= new Operation(){

            @Override
            public int calc(int x, int y) {
                return x + y;
            }
        };

        /* << 익명클래스가 람다식으로. >> */
        // 추상메소드(=구현할메소드)가 딱 하나만 있어야한다.
        Operation add2 = (int x, int y) -> {
            return x + y;
        };
        Operation sub = (x, y) -> x - y;
        // 이것과 같이 생략이 가능하다. ※중괄호를 반드시 지워줘야한다.
        System.out.println(sub.resultToString(sub.calc(b, a)));

        Operation multi = (x, y) -> x * y;
        System.out.println(multi.resultToString(multi.calc(b, a)));

        Operation div = (x, y) -> x / y;
        System.out.println(div.resultToString(div.calc(b, a)));



        int addResult = add.calc(a, b);
        System.out.println(a + "+" + b + "=" + addResult);

        int addResult2 = add2.calc(a, b);
        System.out.println(a + "+" + b + "=" + addResult2);
    }
}
