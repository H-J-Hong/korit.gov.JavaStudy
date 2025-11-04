package _30_Json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.*;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@ToString
@Getter
@Setter
class User {
    private String username;
    private String password;
    private String email;
    private String name;
}

public class Json02 {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();

        String userJson = null;

//        Java Object -> Json
        User user1 = new User("dongyoon", "1q2w3e4r", "someone@somewhere.com", "이동윤");
        userJson = gson.toJson(user1);

        System.out.println("Gson 사용 결과");
        System.out.println(userJson);

        userJson = gsonBuilder.toJson(user1);
        System.out.println("GsonBuilder 사용 결과");
        System.out.println(userJson);

        User user2 = gson.fromJson(userJson, User.class);
        System.out.println(user2);
        System.out.println();

//        Map => Json
        Map<String, String> map1 = new HashMap<>();
        map1.put("productCode","NT960XHA-KD72G");
        map1.put("productName","삼성 갤럭시 북 프로 5");


        System.out.println("==========================================");
        System.out.println("Gson 사용 결과");
        System.out.println(gson.toJson(map1));
        System.out.println("GsonBuilder 사용 결과");
        System.out.println(gsonBuilder.toJson(map1));
        String productJson = gsonBuilder.toJson(map1);

        Map<String,String> map2 = gson.fromJson(productJson,Map.class);
        System.out.println(map2);
        System.out.println();




    }
}
