package _35_StreamApi;

//1. 스캐너 객체 생성, product List하나 생성하면서
//"애플 아이폰 15 Pro",
//"애플 맥북 프로 M3",
//"애플 아이패드 에어 5세대",
//"애플 에어팟 프로 2세대",
//"삼성 갤럭시 S24 울트라",
//"삼성 갤럭시 Z 플립 5",
//"삼성 갤럭시탭 S9",
//"삼성 갤럭시 워치6",
//"삼성 노트북 갤럭시북4 프로",
//"엘지 울트라기어 게이밍 모니터" 제품들 넣기
//2. 브랜드 키워드 입력받기 => stream filter이용해서 키워드 브랜드 뽑아내고 List에 담기
//3. 뽑아온 브랜드 상품들 출력 없으면 없다고 출력


import java.util.*;

public class StreamApiEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> products = Arrays.asList(
                "애플 아이폰 15 Pro",
                "애플 맥북 프로 M3",
                "애플 아이패드 에어 5세대",
                "애플 에어팟 프로 2세대",
                "삼성 갤럭시 S24 울트라",
                "삼성 갤럭시 Z 플립 5",
                "삼성 갤럭시탭 S9",
                "삼성 갤럭시 워치6",
                "삼성 노트북 갤럭시북4 프로",
                "엘지 울트라기어 게이밍 모니터"
        );
        Map<String, String> bname = new HashMap<>();
        bname.put("apple", "애플");
        bname.put("samsung", "삼성");
        bname.put("lg", "엘지");

        System.out.print("검색하실 브랜드 명을 입력하세요. >>>>> ");
        String s = sc.nextLine();
        if ((s.toLowerCase().toCharArray()[0] >= 'a' && s.toLowerCase().toCharArray()[0] <= 'z'))
            s = bname.get(s.toLowerCase());
        System.out.println(s);

        String finalS = s;
        products.stream()
                .filter(a -> a.startsWith(finalS))
                .forEach(System.out::println);





    }
}
