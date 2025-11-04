package _30_Json;

//{
//    "orderId": "ORD123456",
//    "customer": "곽두팔",
//    "product": "에어팟 프로 2세대",
//    "quantity": 1,
//    "price": 349000,
//    "address": {
//        "receiver": "곽두팔",
//        "phone": "010-5678-1234",
//        "city": "서울",
//        "district": "마포구",
//        "zipCode": "04123"
//    }
//}
// jsonObject객체를 만들고 gsonBuilder를 이용해 json 형태로 변환후 위와 같이 출력 하시오

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class OrderJson {
    public static void main(String[] args) {
        JsonObject orderJson = new JsonObject();
        System.out.println();
        orderJson.addProperty("orderId", "ORD123456");
        orderJson.addProperty("customer", "곽두팔");
        orderJson.addProperty("product", "에어팟 프로 2세대");
        orderJson.addProperty("quantity", 1);
        orderJson.addProperty("price", 349000);
        System.out.println(orderJson);
        System.out.println();

        JsonObject orderJsonAddress = new JsonObject();
        orderJsonAddress.addProperty("receiver", "곽두팔");
        orderJsonAddress.addProperty("phone", "010-5678-1234");
        orderJsonAddress.addProperty("city", "서울");
        orderJsonAddress.addProperty("district", "마포구");
        orderJsonAddress.addProperty("zipCode", "04123");
        orderJson.add("address",orderJsonAddress);

        System.out.println(orderJsonAddress);
        System.out.println();
        System.out.println(orderJson);
        System.out.println();

        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
        System.out.println(gsonBuilder.toJson(orderJson));
        System.out.println();
        System.out.println(gsonBuilder.fromJson(gsonBuilder.toJson(orderJson),JsonObject.class));
        System.out.println();
        System.out.println(orderJson.equals(gsonBuilder.fromJson(gsonBuilder.toJson(orderJson),JsonObject.class)));


    }
}
