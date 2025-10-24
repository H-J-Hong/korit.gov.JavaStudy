package _17_Inheritance.Message;

/*
 * FancyMessage 클래스 => Message 상속
 * 부모필드 생성자사용해서 객체 생성하도록
 * 메소드 : makePreFix() => 같은 패키지 또는 자식 클래스에서만 접근 가능, 문자열 "[FANCY] " 반환하도록 재정의
 * 메소드 : format() => 모두 접근 가능, 문자열 "[FANCY] " + "★ " + text + " ★" 반환
 * ex) [FANCY] ★ 가나다라마바사 ★
 * */

public class FancyMessage extends Message {
    public FancyMessage(String text) {
        super(text);
    }

    @Override
    protected String makePreFix() {
        return "[FANCY] ";
    }

    @Override
    public String format() {
        return this.makePreFix() + "★ " + text + " ★";
    }
}
