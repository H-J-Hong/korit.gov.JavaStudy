package _30_Json;

// Book 클래스 만들고 객체 생성
// 필드 : isbn,title,author,price,publisher => String
// "978-1234567890","자바의 정석","남궁성","38000","도우출판"
// 1. Object -> Json
// 2. Json -> Map
// 3. Map -> pretty Json
// 4. Json -> Book

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@ToString
class Book {
    private String isbn;
    private String title;
    private String author;
    private String price;
    private String publisher;
}

public class BookJson {
    public static void main(String[] args) {
        Book book1 = new Book(
                "978-1234567890",
                "자바의 정석",
                "남궁성",
                "38000",
                "도우출판"
        );
        Gson gson = new Gson();
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();

        String bookJson = null;

        System.out.println();
        bookJson = gson.toJson(book1);
        System.out.println(bookJson);

        System.out.println();
        Map<String,String> bookMap = new HashMap<>();
        bookMap = gson.fromJson(bookJson,Map.class);
        System.out.println(bookMap);

        System.out.println();
        String bookPrettyJson = null;
        bookPrettyJson = gsonBuilder.toJson(bookMap);
        System.out.println(bookPrettyJson);

        System.out.println();
        Book book2 = gson.fromJson(bookPrettyJson,Book.class);
        System.out.println(book2);

    }
}
