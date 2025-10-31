package _28_WildCard;

/*
* <? extends U> - 상한 경계 와일드카드
* 상위 클래스 제한 (U를 포함해서 그 자손들만 가능) - 상한선이 U
* 읽기는 가능하지만 쓰기는 불가능함 (읽기 전용)
* */

public class UpperBounded {
    public static void inspect(Box<? extends Dog> box) {
//        Dog corgi = new Corgi();
//        corgi.toString();
        Dog d = box.getValue();
//        Corgi c = box.getValue();
//        box.setValue(new Dog());
        Animal a = box.getValue();
        System.out.println(d);
        System.out.println(a);
        System.out.println("개만 가능한 박스 " + box.getClass());
    }
}
