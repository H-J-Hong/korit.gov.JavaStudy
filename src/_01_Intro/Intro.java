package _01_Intro;

public class Intro {
    public static void main(String[] args) {
//        변수명 짓는 법
        /*
        * 1. 저장되는 데이터에 어울리는 이름. 즉, 직관적이고 한눈에 파악 가능한 이름
        * 2. 언더바(_), 문자, 또는 숫자 사용 가능 / 단, 공백이 없어야 하며 숫자가 맨 처음 올 수 없다.
        * 3. 언더바 또는 문자로는 시작 가능.
        * 4. 하나의 단어 또는 두개 이상의 단어의 연속
        * 5. 첫 단어는 소문자로 시작하고, 두번째 단어 부터 대문자로 시작 (단봉낙타 표기법)
        * 6. 예약어 사용 불가 (ex) public, static, void, String, int, double, float, char, etc.)
        * 7. 예약어의 조합은 사용 가능 (ex) publicstatic, voidString, etc.)
        * */

//        좋은 예
        String carBrandName = "KIA";
        String carModelName = "EV6";
        String carEngineType = "electric";
        String carColor = "red";
        int carPassengerCapacity = 5;
        int carModelYear = 2025;

//        예외 : boolean - 예/아니오로 답할 수 있는 의문형으로 만드는 것이 좋음, 부정형은 헷갈릴 가능성 있으므로 안쓰는것이 좋다.
        boolean isEmpty = false;

//        상수 : 고유한 값, 모든 캐릭터를 대문자로 쓰고 단어는 언더바로 구분
        final String COUNTRY_CODE ="KR";
//        COUNTRY_CODE = "US";            잘못된 코드

//        생년월일 => 상수선언, 이름 => 변수선언
//        제 이름은 *** 입니다. 생년월일은 ****** 입니다.

        final int BIRTH_YYMMDD = 801016;
        String myName = "홍해준";

        System.out.println("제 이름은 "+myName+" 입니다. 생년월일은 "+BIRTH_YYMMDD+" 입니다.");

    }
}
