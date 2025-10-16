package _06_String;

public class String01 {
    public static void main(String[] args) {
        String s = "My name is Haejun Hong.";
        int len = s.length();                               // .length 문자열 길이 메서드
        System.out.println(len);
        String sUpper = s.toUpperCase();                    // .toUpperCase 대문자 변환
        System.out.println(sUpper);
        String sLower = s.toLowerCase();                    // .toLowerCase 소문자 변환
        System.out.println(sLower);
        boolean sContain = s.contains("name");              // .contains 포함 여부 확인 (boolean)
        boolean sContain2 = s.contains("age");
        System.out.println(sContain);
        System.out.println(sContain2);
        int sIndexof = s.indexOf("name");                   // .indexOf 위치정보 (인덱스)
        int sIndexof2 = s.indexOf("age");
        System.out.println(sIndexof);
        System.out.println(sIndexof2);                      // 없으면 -1

        s = "I like music and movie and travel.";
        int sLastindexof = s.lastIndexOf("and");        // 여러개중 마지막 위치
        int sLastindexof2 = s.lastIndexOf("name");
        System.out.println(sLastindexof);
        System.out.println(sLastindexof2);                  // 없으면 -1

        boolean sStartswith = s.startsWith("I like");       // 지정 문자열로 시작하는지 확인
        boolean sStartswith2 = s.startsWith("My name");
        System.out.println(sStartswith);
        System.out.println(sStartswith2);                   // 없으면 -1
        boolean sEndswith = s.endsWith("travel.");          // 지정 문자열로 끝나는지 확인
        System.out.println(sEndswith);




    }
}
