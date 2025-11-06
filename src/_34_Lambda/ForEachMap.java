package _34_Lambda;

//1. 스캐너 객체선언과 입력받아 저장할 Map선언(String, Integer)
//2. 상품을 입력할 갯수를 count로 입력받기(nextInt로)
//3. count만큼 반복하며 상품명(키)과 가격(값)으로 각각 입력받고 Map변수에 추가
//4. [상품 목록] 출력 후 람다식을 이용해서 forEach로 [상품명]: ***, [가격]: ***원 이런식으로 출력

import java.util.*;

public class ForEachMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> product = new HashMap<>();

        System.out.print("입력할 수량 >>>>> ");
        int count = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < count; i++) {
            System.out.print("상품 이름을 입력하세요 >>> ");
            String name = sc.nextLine();
            System.out.print("상품 가격을 입력하세요 >>> ");
            Integer price = sc.nextInt();
            sc.nextLine();
            product.put(name,price);
        }

        System.out.println(product);

        product.keySet().forEach(a -> System.out.println("상품명 : " + a + " , 가격 : " + product.get(a)));
        product.forEach((a,b) -> System.out.println("상품명 : " + a + " , 가격 : " + b));




    }

}
