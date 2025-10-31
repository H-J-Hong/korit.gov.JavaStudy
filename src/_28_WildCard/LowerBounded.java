package _28_WildCard;

/*
* <? super U> => 하한 경계 와일드 카드
* 하위 클래스 제한 (U와 그의
* 쓰기는 가능은 하지만 안전하지 않은 방식이다.
* */

public class LowerBounded {
    public static void putDog(Box<? super Animal> box) {
        box.setValue(new Dog());
        box.setValue(new Corgi());
//        Dog d = box.getValue();                   실행 불가
        Object o = box.getValue();
        System.out.println(o);
    }

}
