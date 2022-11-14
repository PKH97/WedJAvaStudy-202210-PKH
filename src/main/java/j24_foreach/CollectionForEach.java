package j24_foreach;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

public class CollectionForEach {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("김준일");
        list.add("김경민");
        list.add("김완준");
        list.add("이동빈");
        list.add("이종준");

        //Collection메소드들은 forEach를 가지고 있다.
        for(String name : list) {
            System.out.println(name);
        }
        list.forEach(name -> {
            System.out.println(name);
        }); // 아래의 로직을 한 줄로 정리한것.

        /*-----------------------------------------------------------------*/
        Consumer<String> c = new Consumer<String>(){
            @Override
            public void accept(String name){
                System.out.println(name);
            }
        };
        Consumer<String> consumer = name -> {System.out.println(name);};

        for(String name : Objects.requireNonNull(list)) {
            consumer.accept(name);
        }
        /*-----------------------------------------------------------------*/
        //위의 로직을 줄인것.
        list.forEach (name -> {
            System.out.println(name);
            /*여기는 구현부, 원하는 로직 입력*/
        });
//        위와 같이 이렇게 길게 작성하는 걸 forEach의 형태로 요약해서 작성할 수 있다.

        /*-----------------------------------------------------------------*/
        // set, AtomicInteger
        Set<Integer> numbers = new HashSet<Integer>();
        for(int i = 0; i < 100; i++){
            numbers.add(i + 1);
        }
        AtomicInteger result = new AtomicInteger();

        numbers.forEach(num -> {
            result.addAndGet(num);
            //+= 이 연산자와 동일한 작동을 한다.
        });
        System.out.println(result.get());

        //Map (TreeMap을 사용하면 값 정렬이된다.)
        Map<Integer, String> students = new TreeMap<Integer, String>();
        for(int i = 0; i < 10; i++){
            students.put(20220001 + i, "김준" +(i + 1));
        }
        students.forEach((key, value) -> {
            System.out.println("학번: " + key + ", 이름: " + value);
        });
    }
}
