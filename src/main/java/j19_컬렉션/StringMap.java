package j19_컬렉션;

import java.util.*;

public class StringMap {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<String, String>();
        List<String> list = new ArrayList<String>();

        list.add("김준일");
        list.add("이동빈");
        list.add("도정민");
        list.add("최해혁");
        list.add("김준일");

        System.out.println(list);
        System.out.println(list.get(3));

        map.put("kor2022000-j", "김준일");
        map.put("kor2022000-l", "이동빈");
        map.put("kor2022000-d", "도정민");
        map.put("kor2022000-c", "최해혁");
        map.put("kor2022000-j2", "김준이");


        System.out.println(map);
        System.out.println(map.get("kor2022000-d"));
        /*
            map은 list와 달리 key값을 자유롭게 설정할 수 있다.
            map은 key값을 기준으로 정렬. hashset과 동일한 방식.
                => 이러한 특징을 이용해 get(값)으로 원하는 값을 검색할 수 있다.
         */

        /*
        문제
            kor2022000-c 학번의 학생의 이름을 김완준으로 바꿔라.
         */
        String searchID = "kor2022000-c";

        // put을 사용하여 값 변경
        map.put("kor2022000-c", "김완준");
        System.out.println(map);
        // map의 key는 set이기 때문에 동일한 key값을 뒤에 넣으면 앞의 값을 덮기 때문에 아래와 같이 풀이

        // 값 수정
        map.replace(searchID, "이성욱");
        System.out.println(map);

        //값 삭제
        map.remove(searchID);
        System.out.println(map);

        boolean searchSuccessflag = map.containsKey("kor2022000-j2");
        System.out.println(searchSuccessflag);

        searchSuccessflag = map.containsValue("김준이");
        System.out.println(searchSuccessflag);

        //Entry
        Set<Map.Entry<String, String>> entry = map.entrySet();
        List<Map.Entry<String, String>> entries = new ArrayList<Map.Entry<String, String>>();

        entries.addAll(entry); // <- set에 있는정보가 list로 이동.
        System.out.println("entry리스트: " + entries);

        Iterator<Map.Entry<String, String>> iterator = entry.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> e = iterator.next();
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set<String> keySet = map.keySet();
        System.out.println("keySet >>>> " + keySet);

        Collection<String> values = map.values();
        System.out.println("values >>>> " + values); // Collection, list 둘다 사용해도 무방.

    }
}
