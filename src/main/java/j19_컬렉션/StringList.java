package j19_컬렉션;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class StringList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        printCollection(list);

        // 값 추가
        list.add("문자열1");
        list.add("문자열2");
        list.add("문자열3");
        list.add("문자열4");
        printCollection(list);

        list.add(1, "문자열5");
        System.out.println(list);

        ArrayList<String> addAllList = new ArrayList<String>();
        addAllList.addAll(list);
        addAllList.addAll(2, list);
        printCollection(addAllList);

        // 값 조회
        String str1 = list.get(0);
        System.out.println("str1 : " + str1);

        // 반복을 사용한 값 조회(for, forEach, )
        for(int i = 0; i < list.size(); i++){
            System.out.println("일반 for - str : " + list.get(i));
        }
        System.out.println();

        for(String str : list){ // 처음부터 끝까지 반복되게 한다.
            System.out.println("forEach - str : " + str);
        }
        System.out.println();

        Iterator<String> iterator = list.iterator(); // list를 iterator로 바꿈
        System.out.println("iterator 첫 생성시 : " + "문자열1");

        while (iterator.hasNext()){ // hasNext: iterator 안에서 다음이 있는지-> o/x 결과 반영
            System.out.println("iterator - str : " + iterator.next());
        }// iterator는 hasNext와 항상 같이 사용해 주어야 한다.
//        System.out.println(iterator.next()); -> iterator 안에는 이제 더이상 데이터가 없다.

        // 값 수정
        list.set(1, "문자열6");
        System.out.println(list);

        // 값 삭제
        list.remove(0); // 보통 remove(int index)의 형태를 사용한다.
        printCollection(list);

        for(int i = 0; i < list.size(); i++){
            if(list.get(i).equals("문자열3")){
                list.remove(i);
                break; // list에서 삭제는 뒤에 걸 앞으로 밀기 때문에 이 식을 사용하면 오류가 발생할 수 있다. 그러니 break의 사용 필수!
            }
        }
        /*값의 위치 찾기를 위한 값 변환*/
        list.add("문자열2");
        printCollection(list);

        // 값의 위치 찾기
        int index = list.indexOf("문자열2");
        System.out.println("문자열2의 위치: " + index);

        int lastIndex = list.lastIndexOf("문자열2");
        System.out.println("뒤에서 부터 찾은 문자열의 위치: " + lastIndex);

        // 값을 포함하고 있는지
        boolean isTrue = list.contains("문자열5");
        System.out.println("list에 문자열5가 포함되어 있는가?: " + isTrue);

        // 리스트를 배열로 변환
        Object[] objects = list.toArray();
        System.out.println(objects[0]);
        System.out.println();

        for(Object object : objects){
            System.out.println(object);
        }

    }
    public static void printCollection(Collection collection){
        System.out.println(collection);
        System.out.println();
    }
}
