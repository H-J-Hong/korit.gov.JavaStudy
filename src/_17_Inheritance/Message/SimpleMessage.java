package _17_Inheritance.Message;

/*
 * SimpleMessage 클래스 => Message 상속
 * 1. 부모필드 생성자사용해서 객체 생성하도록
 * 2. 메소드 : makePreFix() => 같은 패키지 또는 자식 클래스에서만 접근 가능, 문자열 "[SIMPLE] " 반환하도록 재정의
 * 3. 메소드 : format() => 모두 접근 가능, 문자열 "[SIMPLE] " +  "내용: " + text 반환
 * ex) [SIMPLE] 내용: 가나다라마바사
 * */

public class SimpleMessage extends Message {
    public SimpleMessage(String text) {
        super(text);
    }

    @Override
    protected String makePreFix() {
        return "[SIMPLE] ";
    }

    @Override
    public String format() {
        return this.makePreFix() + "내용 : " + text;
    }
}
