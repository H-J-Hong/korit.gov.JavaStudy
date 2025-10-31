package _28_WildCard;

/*
* 비한정적 와일드카드 <?>
* 타입에 제한이 없음.
* 타입이 명시되지 않아 불명확 하므로 읽기만 가능하고 쓰기는 불가 (getter만 사용 가능하고 setter는 불가능함)
*
*
*  */

public class Unbounded {
    public static void inspect(Box<?> box) {        // <?> == <Object> 두개가 같은 의미
//        box.setValue(new Dog());      // 쓰기는 불가능
        System.out.println("박스의 내용물 : " + box.getValue());
    }
}
