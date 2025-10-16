package _06_String;

public class EscapeSequence {
    public static void main(String[] args) {
//        특수문자, 이스케이프 문자
//        \n , \t , \\ , \" , \'

//        \n  =>  개행
        System.out.println("집에\n너무\n가고싶어요");

//        \t  =>  탭 (공백 네칸)
//        1.    페이커
        System.out.println("1.\t페이커");
        System.out.println("2.\t손흥민");

//        \\  =>  \를 문자열로 포함시키고 싶을때
//        "C:\Program Files\java"
        System.out.println("C:\\Program Files\\java");

//        \"  ==>  큰따옴표를 문자열로 포함시키고 싶을때
//        "손흥민의 팀은 "LA FC" 이다."
        System.out.println("손흥민의 팀은 \"LA FC\" 이다.");

//        \'
//        "페이커는 '신'이다."
        System.out.println("페이커는 \'신\'이다.");      // 굳이 필요 없다

        char c = 'A';
        c = '\'';
        System.out.println(c);                          // 필요하다

//        문제 주민등록번호의 뒷번호 첫째자리까지
        String idNum = "801016-1234567";
        System.out.println(idNum.substring(0,idNum.indexOf("-")+2));

    }
}
