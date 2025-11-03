package _29_Collections.Set;

/*
* Set - 수학의 집합과 유사한 성질
*
* Set와 List의 차이점
* List는 순서가 있고 중복을 허용하나
* Set는 순서가 없고 중복을 허용하지 않는다.
*
* List -> Set -> List 형변환이 중요함. (특성 활용)
* */

import java.util.*;

public class StrSet {
    public static void main(String[] args) {
        Set<String> strSet1 = new HashSet<>();
        List<String> strList1 = new ArrayList<>();

        strSet1.add("Java");
        strSet1.add("Java");
        strSet1.add("Java");
        strSet1.add("Java");
        strSet1.add("Java");
        strSet1.add("Java");
        strSet1.add("Python");
        strSet1.add("Python");
        strSet1.add("Python");
        strSet1.add("Swift");
        strSet1.add("Swift");

        System.out.println(strSet1);                // 순서 없음, 중복 허용하지 않음.
//        System.out.println(strSet1.get(1));         // 인덱스가 없으므로 get()메소드로 접근 불가

        System.out.println(strSet1.size());

        for (String z : strSet1) {
            System.out.println(z);
        }

        strList1.addAll(strSet1);
        System.out.println(strList1);               // Set의 순서대로 List에 입력
        strList1.addAll(strSet1);
        System.out.println(strList1);               // Set의 순서대로 List에 추가로 입력
        Collections.sort(strList1);
        System.out.println(strList1);               // List 는 정렬 가능함.
        strSet1.addAll(strList1);
        System.out.println(strSet1);                // List를 Set으로 복사하면 중복된 값 모두 삭제, 순서 무작위

//        Collections.sort(strSet1);                // Set는 정렬할 수 없음.
    }
}
