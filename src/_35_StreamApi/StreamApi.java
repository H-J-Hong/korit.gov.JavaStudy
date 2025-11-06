package _35_StreamApi;

/*
* 컬렉션과 배열에 저장된 데이터를 선언형으로 처리하기 위한 추상화된 반복 프레임 워크
* 데이터로부터 메소드 체이닝 형태로 여러 연산을 연결해 수행
*
* 간결성 -> 메소드 체이닝을 활용한 가독성 향상 / 함수형 프로그래밍 사용
* stream 메소드 내부는 람다식을 활용 => 메소드((입력값, ...) -> 출력값)
* */

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

public class StreamApi {
    public static void main(String[] args) {

//        filter() - 조건을 통해 필터링(거름)

        List<String> names = Arrays.asList("김영","김일","김이","김삼","김사","최오","최육","박칠");
        List<String> namesWithKim = names.stream()
                .filter(name -> name.startsWith("김"))
                .toList();
        System.out.println("김씨들 : " + namesWithKim);

//        map() - 내부 요소들에 각각의 메소드를 적용하는 형태

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        List<Integer> mulNums = numbers.stream()
                .map(number -> number * 2)
                .toList();
        System.out.println("* 2 : " + mulNums);

//        스트림 중첩
        List<String> englishNames = Arrays.asList("anya", "alice", "smith", "pascal","bacon","harry","potter");

//        a로 시작하는 애들로 거르고 모두 다 대문자로 변경하면서 정렬
        List<String> result = englishNames.stream()
                .filter(name -> name.startsWith("a"))
                .map(String::toUpperCase)                       // (String::toUpperCase) == (name -> name.toUpperCase())
                .sorted()
                .toList();
//        :: 메소드 참조 -> 해당 타입 클래스의 메소드를 직접 호출해서 각각 요소에 적용
        System.out.println(result);

        System.out.println("람다식 for each");
        result.forEach(name -> System.out.println(name));
        System.out.println("메소드 참조 for each");
        result.forEach(System.out::println);

        System.out.println();
        System.out.println("예제");
        System.out.println();
//        englishNames에서 이름이 5글자 초과되는 이름의 갯수
        int z = 0;


        for(String a : englishNames) if (a.length() > 5) {
            System.out.println(a);
            z++;
        }
        System.out.println("이름 길이가 5초과인 사람의 숫자 : " + z);

        z = 0;

        z = (int)englishNames.stream()
                .filter(s -> s.length() > 5)
                .count();

        System.out.println(englishNames.stream()
                .filter(s -> s.length() > 5)
                .toList()
        );
        System.out.println("이름 길이가 5초과인 사람의 숫자 : " + z);
    }
}
