package j22_람다;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        //Runnable  -> 매개변수() x, 반환값 {} x
        Runnable runnable1 = () -> {
            System.out.println("첫번째 프로그램을 실행합니다.");
        };
        Runnable runnable2 = () -> {
            System.out.println("두번째 프로그램을 실행합니다.");
        };
        runnable1.run();
        runnable2.run();

        /* Runnable은 쓰레드에서 가장 많이 사용된다.
           쓰레드는 순서와 상관없이 동시에 작동된다.
         */
        Thread thread1 = new Thread(()->{
            for(int i = 0; i< 100; i++){
                try {
                    Thread.sleep(100);
                    System.out.println("쓰레드1: " + i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread thread2 = new Thread(()->{
            for(int i = 0; i< 100; i++){
                try {
                    Thread.sleep(100);
                    System.out.println("쓰레드2: " + i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

//        thread1.start();
//        thread2.start();

        //Supplier  -> 매개변수() x, 반환값 {} o
        Supplier<String> supplier = () -> "공급";
        System.out.println(supplier.get());

        //Consumer  -> 매개변수() o, 반환값 {} x
        Consumer<String> consumer = name -> {
            System.out.println("이름: "+ name);
        }; // 매개젼수가 하나일때는 괄호 생략 가능
        consumer.accept("김준일");

        //Function  -> 매개변수() o, 반환값 {} o
        Function<Integer, String> function = age -> "나이: " + age;
        System.out.println(function.apply(29));

        //Predicate  -> 매개변수() o, 반환값 {} o (if대신에 자주 사용된다, boolean 형태를 띈다.)
        Predicate<Integer> leapMonth = year -> year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        System.out.println(leapMonth.test(2000));


    }
}
