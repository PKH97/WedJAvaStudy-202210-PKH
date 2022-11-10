package j19_컬렉션;

import java.security.KeyStore;
import java.util.*;

public class UserMap {
    public static void main(String[] args) {
        Map<String, String> userMap = new HashMap<String, String>();

        userMap.put("username", "junil");
        userMap.put("password", "1234");
        userMap.put("email", "skjil1218@naver.com");
        userMap.put("name", "김준일");
//      My 풀이
//        Set<Map.Entry<String, String>> entry = userMap.entrySet();
//        List<Map.Entry<String, String>> entry2 = new ArrayList<Map.Entry<String, String>>();
//
//        entry2.addAll(entry);
//        System.out.println(entry2);
/*        -->문제점: entry의 사용법과 지정이 잘못된다.
                    특히 문제의 전제 조건인 println부분을 거드리지 않고 출력할 수 없다.
 */

//      정답
        Set<String> keySet = userMap.keySet();
        List<String> keyList = new ArrayList<String>();
        keyList.addAll(keySet);

        String keyName1 = keyList.get(0);
        String keyName2 = keyList.get(1);
        String keyName3 = keyList.get(2);
        String keyName4 = keyList.get(3);

        String values1 =  userMap.get(keyName1);
        String values2 =  userMap.get(keyName2);
        String values3 =  userMap.get(keyName3);
        String values4 =  userMap.get(keyName4);

        System.out.println(keyName1 + " >> " + values1);
        System.out.println(keyName2 + " >> " + values2);
        System.out.println(keyName3 + " >> " + values3);
        System.out.println(keyName4 + " >> " + values4);

    }
}

