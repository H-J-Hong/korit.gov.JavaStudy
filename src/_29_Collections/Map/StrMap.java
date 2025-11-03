package _29_Collections.Map;

/*
* Map - Key + Value의 쌍으로 이루어진 데이터의 집합
* Key는 중복될 수 없고 Value는 중복이 가능하다.
* Map의 내용물은 순서가 없다.
* for-each문으로 직접 순회 불가 (HashMap은 Iterable 인터페이스를 상속한 Collection 클래스의 자식이 아님)
* */

import java.util.*;

public class StrMap {
    public static void main(String[] args) {
        Map<String, String> strMap1 = new HashMap<>();
        strMap1.put("kor2025001","이동윤");
//        strMap1.put("kor2025001","삼동윤");      // 키 중복 불가
        strMap1.put("kor2025002","이동윤");        // 밸류 중복 가능
        strMap1.put("kor2025003","삼동윤");
        strMap1.put("kor2025004","사동윤");
        strMap1.put("kor2025005","오동윤");

        System.out.println(strMap1);
        System.out.println(strMap1.keySet());       // Key만 Set 형태로 반환
        System.out.println(strMap1.entrySet());     // Key+Value를 Set 형태로 반환

        for (String z : strMap1.keySet()) {
            System.out.print("키 : " + z);
            System.out.println(" / 값 : " + strMap1.get(z));
        }

        for (Map.Entry<String, String> entry : strMap1.entrySet()) {
            System.out.print(entry + "  ");
            System.out.print(entry.getKey() + "  ");
            System.out.println(entry.getValue());
        }
//        Map의 동일한 Key에 다른 Value를 put() 한다면 덮어쓰기 된다.
        strMap1.put("kor2025005","배찬익");
        System.out.println(strMap1);

//        replace(Key, Value) 메소드도 같은 기능을 한다.
        strMap1.put("kor2025002","박윤호");
        System.out.println(strMap1);

//        Key의 존재 여부 containsKey / Value의 존재 여부 containsValue
        System.out.println(strMap1.containsKey("kor2025002"));
        System.out.println(strMap1.containsValue("심재원"));

//        Map을 List화 하기 위해서는 Set을 거쳐야 한다.
        Set<Map.Entry<String,String>> entrySet1 = new HashSet<>(strMap1.entrySet());
        System.out.println(entrySet1);
        List<Map.Entry<String,String>> entryList1 = new ArrayList<>(entrySet1);
        System.out.println(entryList1);

//        Map 의 정렬
//        1. Map은 Key를 기준으로 빠른 검색을 위해 만들어진 자료구조이므로 순서가 고려하지 않아 정상적인 방법으로는 정렬이 불가능.
//        2. 정렬을 위해 몇가지 공정을 필요로 함.
//        1) Map을 List화 한 후 Collection의 sort 메소드를 활용
//        2) 필드에 Map.Entry.comparingByValue(또는 Key) 메소드를 활용
        Collections.sort(entryList1, Map.Entry.comparingByValue());
        System.out.println("밸류 기준 정렬 : " + entryList1);
        Collections.sort(entryList1, Map.Entry.comparingByKey());
        System.out.println("키 기준 정렬 : " + entryList1);
        Collections.sort(entryList1, Map.Entry.comparingByKey(Comparator.reverseOrder()));  // 역순
        System.out.println("키 기준 정렬 : " + entryList1);

    }
}
