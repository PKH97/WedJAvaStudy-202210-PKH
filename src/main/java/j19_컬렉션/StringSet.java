package j19_컬렉션;

import java.util.*;

public class StringSet {
    public static void main(String[] args) {
        Set<String> strSet = new HashSet<String>();
        List<String> strList = new ArrayList<String>();
        strList.add("이동빈");
        strList.add("이승아");
        strList.add("우예희");
        strList.add("이종준");
        strList.add("변상원");
        strList.add("김준일"); // strSet에 동일한 값이 존재

        //값 추가
        strSet.add("김준일"); // 동읽밧은 하나만 출력된다.
        strSet.add("장혜민");
        strSet.add("정순동");
        strSet.add("김완준");
        strSet.add("송아셀");

        System.out.println(strSet);

        strSet.addAll(strList);
        System.out.println(strSet);
        // set은 리스트 안에서 중복되는 값을 제거하기 위해 자주 사용된다.

        //값 조회
        String searchName = "김준이";
        /*
        문제1.
            strSet에 김준일이 있으면 true, 없으면 false.
         */

        /* 정답 */
        boolean isTrue = false;

        for(String name : strSet){
            if(name.equals(searchName)) {
                isTrue = true;
                break;
            }
        }
        System.out.println(isTrue);

        //값 수정
        /*
        문제2.
            송아셀 이름을 찾는다.
            있다면 남강석으로 바꿔라
         */

        /* 정답 */
        strSet.remove("송아셀");// set은 값 자체가 key값이기 때문에 직접 입력

        for(String name : strSet){
            if(name.equals(searchName)){
                strSet.remove(searchName);
                strSet.add("남강석");
                break;
            }
        }
        System.out.println(strSet);
//        ------------내가 쓴 풀이------------
//        Iterator<String> iterator = strSet.iterator();
//        while(iterator.hasNext()){
//            String name = iterator.next();
//            if (name.{
//                .setName("");
//                break;
//            }
//        }

        searchName = "김준일";

        System.out.println(strSet.contains(searchName));

        if(strSet.contains(searchName)){
            strSet.remove(searchName);
            strSet.add("김준이");
        }
        System.out.println(strSet);

    }
}
