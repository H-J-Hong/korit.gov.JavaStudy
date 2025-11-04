package _31_StringBuilder;

public class StringBuilder01 {
    public static void main(String[] args) {
//        String, StringBuffer, StringBuilder
        String str = "abcdefg";         // 선언과 동시에 상수 취급 - 연산을 하고 나서도 불변 <비효율적>
        System.out.println("String => " + str);

//        String => 메모리 관리 및 연산 속도 측면에서 비효율적
//        StringBuffer / StringBuilder => 차이점은 거의 없음, StringBuilder가 성능상으로 약간 더 좋지만 약간 불안정.

        StringBuilder sb = new StringBuilder("abcdefg");
        StringBuilder sb2 = new StringBuilder("abcdefg");
        System.out.println("StringBuilder => " + sb);
        System.out.println("StringBuilder => " + sb2);
        System.out.println(sb == sb2);
        System.out.println(sb.equals(sb2));         // StringBuilder에는 equals가 오버라이딩이 되어 있지 않음.
        System.out.println(sb.toString().equals(sb2.toString()));         // String으로 바꿔서!!

        System.out.println("차지하는 용량의 크기 => " + sb.capacity());
//        StringBuilder -> String 변환 : toString()
        String str2 = sb.toString();
        System.out.println("StringBuilder 에서 String으로 변환 => " + str2);
//        문자열 추출 => substring(int, int)
        System.out.println("문자열 추출 => " + sb.substring(2,4));       // c~d까지 추출
//        문자열 추가 => insert(int, String)
        System.out.println("문자열 삽입 => " + sb.insert(2, "추가"));  // b~c 사이에 "추가"추가
//        문자열 삭제 => delete(int, int)
        System.out.println("문자열 삭제 => " + sb.delete(2,4));
//        문자열 연결 (덧셈 연산) => append(String)
        System.out.println("문자열 연결 => " + sb.append("hijk"));
//        문자열 길이 => length()
        System.out.println("문자열 길이 => " + sb.length());
//        메모리 공간에서 차지하는 용량의 크기 => capacity()
        System.out.println("차지하는 용량의 크기 => " + sb.capacity());
//        문자열 뒤집기 => reverse();
        System.out.println("문자열 뒤집기 => " + sb.reverse());
    }
}
