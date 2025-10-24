package _17_Inheritance;

/*
* Human 클래스
* 1. Animal 클래스를 상속 받음
* 2. 고유 필드 속성으로 language 라는 속성 추가
* 3. setter들을 이용해서 각 속성의 값을 주입
* 4. getAnimalName을 호출했을때 "안녕하세요. 제 이름은 ***입니다." 라고 출력 할 수 있도록 재정의
* 5. getAnimalAge를 호출했을때 "올해 제 나이는 ***살 입니다. 내년에는 ***+1 살이 됩니다." 라고 출력
* 6. move를 "사람이 두 발로 걷습니다." 를 출력하도록 재정의
* 7. 고유 메소드로 bookName 파라미터를 받는 read()를 선언 - 호출시 "bookName을 읽는 중입니다." 출력
* */

public class Human extends Animal {
    private String language;

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    @Override
    public String getAnimalName() {
        System.out.println("안녕하세요. 제 이름은 " + super.getAnimalName() + " 입니다.");
        return super.getAnimalName();
    }

    @Override
    public int getAnimalAge() {
        System.out.println("올해 제 나이는 " + super.getAnimalAge() + " 살 입니다. 내년에는 " + (super.getAnimalAge()+1) + " 살이 됩니다.");
        return super.getAnimalAge();
    }

//     클래스 재정의 : alt + insert
    @Override
    public void move() {
        System.out.println("사람이 두 발로 걷습니다.");
    }

    public void read(String bookName) {
        System.out.println(bookName + " 을 읽는 중입니다.");
    }

}
