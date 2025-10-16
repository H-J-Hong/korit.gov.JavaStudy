package _06_String;

public class String02 {
    public static void main(String[] args) {
        String s = "I like music and movie and travel.";

//        특정 문자열 대체

        System.out.println(s.replace(" and",","));       // .replace : 문자열 대체
        System.out.println(s.replace(" ", ""));          // 공백 제거

//        인덱스 기준 특정 위치부터 출력
        System.out.println(s.substring(7));                     // .substring : 특정 위치부터 출력
        System.out.println(s.substring(7, 12));                           // 범위 지정시 마지막 번호 바로 앞까지 출력

//        특정 문자열이 있는 위치부터 출력
        System.out.println(s.indexOf("movie"));
        System.out.println(s.substring(s.indexOf(("movie"))));            // 메소드를 섞어서 적용
        System.out.println(s.substring(s.indexOf("movie"),s.indexOf(".")));

//        해당 문자열의 앞 뒤 공백제거
        s = "               I want go home.               ";
        System.out.println(s.trim());

//        문자열 병합 메소드 활용
        String s1 = "Hello";
        String s2 = "World!";
        System.out.println(s1 + s2);
        System.out.println(s1.concat(s2));
        System.out.println(s1.concat("!!").concat(s2));                 // 메소드 체이닝

    }


}
