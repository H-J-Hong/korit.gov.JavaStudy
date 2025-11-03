package _29_Collections.List;

/*
* Collection - 여러 객체를 모아놓은 것
* 사용법 : Wrapper Class를 Generic 형태로 명시
* */

import java.sql.SQLOutput;
import java.util.*;

public class StrList {
//    List - 순서가 있는 데이터의 집합, 중복된 요소를 허락함.
    public static void main(String[] args) {
        List<String> strList1 = new ArrayList<>();      // 크기 지정을 하지 않음.
        List<String> strList2 = new ArrayList<>();

        strList1.add("A");
        strList1.add("B");
        strList1.add("A");
        System.out.println(strList1);                       // 리스트에 값 추가 하는 방법

        List<String> strList1_1 = new ArrayList<>(Arrays.asList("A","B","C"));
        System.out.println(strList1_1);                     // 리스트에 값 추가 하는 방법 2


        String[] strArray1 = {"A", "B", "C"};
        System.out.println(strArray1);
        System.out.println(Arrays.toString(strArray1));     // 배열에 접근하는 방법 - 배열 내용 전체 출력 (비교1)

        strList2.add("java");
        strList2.add("python");
        strList2.add("C#");
        strList2.add("javascript");
        strList2.add("kotlin");

        System.out.println(strList2);                       // 리스트에 접근하는 방법 - 리스트 내용 전체 출력 (비교2)
        System.out.println(strList2.get(2));                // 리스트에 접근하는 방법 - 인덱스 사용

        String searchElem1 = "python";
        boolean containResult1 = strList2.contains(searchElem1);    // 리스트에서 내용을 찾는 방법 - contains() 메소드
        System.out.println(strList2 + " 에 \"" + searchElem1 + "\" 포함 여부 : " + containResult1);

        String searchElem2 = "py";
        boolean containResult2 = strList2.contains(searchElem2);
        System.out.println(strList2 + " 에 \"" + searchElem2 + "\" 포함 여부 : " + containResult2);

        String email = "example@naver.com";
        boolean containResult3 = email.contains("@");       // String에서 내용 찾는 법
        System.out.println(email + " 에 \"@\"" + " 의 포함 여부 : " + containResult3);

        String removeElem1 = "kotlin";
        boolean removeResult1 = strList2.remove(removeElem1);   // 리스트에서 요소 삭제 하는 방법 - remove() 메소드 활용
        System.out.println(strList2 + " 에 \"" + removeElem1 + "\" 삭제 여부 : " + removeResult1);

        Collections.sort(strList2);                         // 오름차순 정렬 - Collections 클래스의 sort() 메소드 활용
        System.out.println(strList2);

        Collections.sort(strList2,Collections.reverseOrder());
//        내림차순 정렬 - Collections 클래스의 오버로딩된 sort() 메소드에 reverseOrdered() 메소드의 반환값을 필드로 주입
        System.out.println(strList2);

        System.out.println(strList2.size());                // List의 길이 -> size() 메소드 활용
//        System.out.println(strList2.length);              // length 사용 불가

        System.out.println();
        for (int i = 0; i < strList2.size(); i++) {
            System.out.println(strList2.get(i) + " 언어");
        }
        System.out.println();

        for (String z : strList2) {
            System.out.println(z + " 언어");
        }
        System.out.println();


    }
}
