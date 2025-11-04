package _30_Json;

/*
* Json (JavaScript Object Notation) Java와 Javascript는 유사하지도 않은 별개의 언어!!
* - 본래 자바스크립트 언어로부터 파생되어 자바스크립트 구문을 따랐지만, 언어 독립형 데이터 포맷으로 변화
* - 프로그래밍 언어나 플랫폼에 독립적이기 때문에 구문 분석 및 json 데이터 생성을 위한 코드는
*   Java / Python등 다양한 언어에서 쉽게 활용 가능.
* - Map(Key, Value) 형태로 구성 되어 있음.
* - 프론트엔드 - 백엔드 통신에 json 파일 형식 사용 (parsing하여 - 외부 라이브러리 활용)
* */

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class Json01 {
    /*
    * Gson - Google JSON의 합성어로 Java 객체를 Json 형태로 변환하거나 혹은 반대로 변환하는데 사용함
    * 주요 클래스
    * Gson - Java <-> Json 변환을 위해 사용되는 클래스
    * GsonBuilder - Gson 인스턴스에 대한 사용자 정의 구성을 허용
    * JsonObject - Json 형식의 객체를 나타냄
    *
    * */

    public static void main(String[] args) {
        JsonObject jsonObject1 = new JsonObject();
        jsonObject1.addProperty("username", "dongyoon");
        jsonObject1.addProperty("password","1q2w3e4r");
        jsonObject1.addProperty("email","someone@somewhere.com");
        jsonObject1.addProperty("name","이동윤");
        System.out.println(jsonObject1);

        jsonObject1.addProperty("job","코리아아이티아카데미국비강사");
        Gson gson1 = new GsonBuilder().setPrettyPrinting().create();
        String json1 = gson1.toJson(jsonObject1);
        System.out.println(json1);

//        중첩 내부 객체
        JsonObject address = new JsonObject();
        address.addProperty("city","부산시");
        address.addProperty("district","진구");
        address.addProperty("zipcode",12345);

        jsonObject1.add("address", address);

        String json2 = gson1.toJson(jsonObject1);
        System.out.println(json2);

//        Json -> JsonObject
        JsonObject jsonObject2 = gson1.fromJson(json2,JsonObject.class);
        System.out.println(jsonObject2);
    }
}
