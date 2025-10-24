package _17_Inheritance;

/*
* super를 사용하는 두가지 방식
* 1. super() : 부모 클래스의 생성자를 호출하는 키워드.
*               NoArgs =>super()
*               AllArgs =>super(필드속성값들...)
* 2. super.메소드명() : 부모 클래스의 메소드를 호출하는 키워드.
* 3. super.필드명 : 부모클래스의 필드 속성값을 불러오는 키워드.
* */

public class Tiger extends Animal {
//    선언한 적은 없지만 Animal의 필드와 메소드를 상속 받아서 모두 가지고 있다.
    public Tiger(String animalName, int animalAge, boolean isStriped) {
//        고유 필드 속성을 대입하기 전에 부모의 속성을 먼저 생성자에 호출해야 함.
        super(animalName, animalAge);                       // super => 부모에게 접근할 수 있는 keyword
        this.isStriped = isStriped;
    }
//    부모 클래스에는 없는 필드를 자식 클래스에 별도로 추가 - getter / setter도 함께 추가!
    private boolean isStriped;

    public boolean isStriped() {
        return isStriped;
    }

    public void setStriped(boolean striped) {
        isStriped = striped;
    }

//    오버라이딩 (Overriding)
//    상속 관계인 클래스에서 자식 클래스가 부모 클래스의 메소드를 재정의 하는 행위
//    부모로부터 물려받은 메소드를 자식이 "다르게" 실행되도록 바꾸는 것
//    동일한 이름, 매개변수, 리턴타입으로 다시 정의하는 것
//    사용하는 이유 => 자식클래스에 맞춘 동작 내용 변경
//    부모클래스의 접근 범위 보다 자식 클래스의 접근 범위가 같거나 더 넓어야 한다.

    /*
    * 어노테이션(시그니쳐)
    * 코드에 붙이는 꼬리표
    * 코드의 용도를 컴파일러가 더 잘 이해하도록 도움을 주는 용도
    * */
    @Override                                     // 어노테이션
    public void move() {
        super.move();
//        부모클래스인 Animal 클래스의 move 메소드를 명시해야 할 필요가 있는 경우 super. 를 붙여서 호출
        System.out.println("호랑이가 움직입니다.");  // 동작을 재정의 "움직입니다." => "호랑이가 움직입니다."
    }

    public void hunt() {
        System.out.println(getAnimalName() + " 호랑이가 사냥을 합니다.");
//        getAnimalName()은 자식 클래스 Tiger에 없으므로 부모클래스 Animal에서 가져온다!

        /*
        * 상속을 했을때 메소드 호출시 탐색하는 순서
        * 1. 자식 클래스에 해당 메소드가 있는지 탐색
        * 2. 자식 클래스에 메소드가 없으면 부모 클래스 탐색
        * */
    }

}
