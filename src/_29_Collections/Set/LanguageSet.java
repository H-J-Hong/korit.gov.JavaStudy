package _29_Collections.Set;

/*
* 1. "Java", "Python", "C", "Python", "Java", "Java", "C++", "C#", "C", "Java" 를 리스트에 넣기
* 2. 중복 제거한 후 출력하기
* 3. 오름차순 정렬된 상태 출력하기
* 4. 특정과목 변수에 Java 대입하고 맨 처음 만든 리스트에 몇개 있는지 출력 (검색)
* 5. 중복 제거한 뒤의 set을 이용하여 중복 제거된 후의 언어 갯수 출력하기.
* */

import java.util.*;

public class LanguageSet {
    public static void main(String[] args) {
        String[] a = { "Java", "Python", "C", "Python", "Java", "Java", "C++", "C#", "C", "Java" };
        List<String> list = Arrays.asList(a);
        System.out.println(list);
        Set<String> set = new HashSet<>();
        set.addAll(list);
        System.out.println(set);

        List<String> list3 = new ArrayList<>(set);
        Collections.sort(list3);
        System.out.println(list3);

        String cls = "Java";
        int z = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(cls)) z++;
        }
        System.out.println(z);
        System.out.println(Collections.frequency(list,cls));

        System.out.println(set.size());
    }
}
