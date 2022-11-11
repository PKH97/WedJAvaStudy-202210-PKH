package j20_JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@Data
class User{
    private String username;
    private String password;
    private String email;
    private String name;
}

public class JSON2 {
    public static void main(String[] args) {
        /* Gson으로 변환 할 수 있는 객체의 종류
             -> JsonObject, Object, Map
        */
        // 이 두개는 동일하다.
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
        Gson gson = new Gson();

        String userJson = null;
        String studentJson = null;
        String productJson = null;

        //Object(객체) -> JSON
        User user = new User("junil", "1234", "skjil1218@gmail.com", "김준일");
        System.out.println(gson.toJson(user));//단순 json으로만 출력
        System.out.println(gsonBuilder.toJson(user));//setPrettyPrinting() 적용
        userJson = gsonBuilder.toJson(user);

        //JsonObject -> JSON
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("StudentCode", "20220001");
        jsonObject.addProperty("StudentName", "김준일");
        jsonObject.addProperty("StudentYear", "2");
        System.out.println(gsonBuilder.toJson(jsonObject));
        studentJson = gsonBuilder.toJson(jsonObject);

        //Map -> JSON
        Map<String, Object> map = new HashMap<String,Object>();
        map.put("ProductCode", "P-20220001");
        map.put("ProductName", "삼성 노트북");
        System.out.println(gsonBuilder.toJson(map));
        productJson = gsonBuilder.toJson(map);

        //Json -> Map
        Map<String, Object> jsonData = convertJsonToMap(userJson);
        System.out.println(jsonData);

        jsonData = convertJsonToMap(studentJson);
        System.out.println(jsonData);

        jsonData = convertJsonToMap(productJson);
        System.out.println(jsonData);
        System.out.println();

        //Json -> JsonObject
        JsonObject jsonObj = convertJsonToMapObject(userJson);
        System.out.println(jsonObj);

        jsonObj = convertJsonToMapObject(studentJson);
        System.out.println(jsonObj);

        jsonObj = convertJsonToMapObject(productJson);
        System.out.println(jsonObj);
        System.out.println();

        //Json -> User 객체
        User userObj = convertJsonToUser(userJson);
        System.out.println(userObj);


    }
    public static Map convertJsonToMap(String json){
        Gson gson = new Gson();
        return gson.fromJson(json, Map.class);
    }

    public static JsonObject convertJsonToMapObject(String json){
        Gson gson = new Gson();
        return gson.fromJson(json, JsonObject.class);
    }

    public static User convertJsonToUser(String json){
        Gson gson = new Gson();
        return gson.fromJson(json, User.class);
    }

}
