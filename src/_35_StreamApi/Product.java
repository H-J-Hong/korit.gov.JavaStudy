package _35_StreamApi;

/*
 * product => name, price
 * 브랜드 명을 입력받고 그리고 최대 가격을 입력받는다
 * 해당 브랜드의 상품중 최대 가격보다 아래인 제품 목록 출력
 * 만약 없다면 해당 조건에 맞는 제품이 없습니다. 출력
 * */

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Product {
    String pname;
    int price;
}
