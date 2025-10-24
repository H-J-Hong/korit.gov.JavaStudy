package _17_Inheritance.Message;

/*
* Message 클래스
* 1. 필드 : String text
* 2. AllArgs 생성자
* 3. 메소드 : makePreFix() => 같은 패키지 또는 자식에서만 접근 가능, 문자열 "[MSG] " 반환.
* 4. 메소드 : format() => 모두 접근 가능. 문자열 "[MSG] " + text 반환
* 5. 메소드 : print() => 모두 접근 가능. 반환값 없음. format()의 반환값을 출력.
* */

public class Message {
     String text;

    public Message(String text) {
        this.text = text;
    }

    protected String makePreFix() {
        return "[MSG] ";
    }

    public String format() {
        return this.makePreFix() + text;
    }

    public void print() {
        System.out.println(this.format());
    }
}
