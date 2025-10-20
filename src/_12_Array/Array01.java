package _12_Array;

public class Array01 {
    public static void main(String[] args) {
//        배열 Array
//        의미 : 같은 자료형 데이터를 연속된 공간에 저장하는 고정 크기 컨테이너

//        배열을 사용하지 않는 경우 => 같은 역할의 변수가 늘어남 (비효율적)
        String country1 = "Hungary";
        String country2 = "Croatia";
        String country3 = "Slovenia";
        String country4 = "Austria";
        String country5 = "Czech";

//        배열을 사용하는 경우
//        {"Hungray","Croatia","Slovenia","Austria","Czech" };

//        선언방법 1) 선언 + 공간 할당
        String[] countries1 = new String[5];             // 5개의 공간 할당
//        선언방법 2) 선언 형태 변경
        String countries2[] = new String[5];             // 1) 과 동일한 내용
//        값 채우기 (인덱스)
        countries1[0] = "Hungary";
        countries1[1] = "Croatia";
        countries1[2] = "Slovenia";
        countries1[3] = "Austria";
        countries1[4] = "Czech";
//        countries1[5] = "korea";                      // 할당된 공간의 크기보다 더 넣게 되면 ArrayIndexOutOfBoundsException 발생!!

//        배열의 내용을 보고 싶다!
        System.out.println(countries1);                 // 잘못된 예) 배열의 메모리 주소가 출력된다!!

//        선언방법 3) 선언과 동시에 값 나열
        String[] countries3 = new String[] {"Hungray", "Croatia", "Slovenia", "Austria", "Czech"};

//        별도의 공간 할당량을 명시하지 않았으나, 나열된 값의 개수와 동일한 공간 할당됨

//        선언방법 3) 선언과 동시에 값 나열 (new 생략)
        String[] countries4 = {"Hungray", "Croatia", "Slovenia", "Austria", "Czech"};

//        배열의 값 변경
        System.out.println(countries4[2]);
        countries4[2] = "Swiss";                        // 2번 인덱스의 값 Slovenia -> Swiss로 변경
        System.out.println(countries4[2]);

//        배열의 길이 (할당한 공간의 갯수)
        System.out.println(countries4.length);          // 배열의 길이는 함수가 아니므로 () 붙이지 않는다!!
        System.out.println(countries4[2].length());     // 문자열의 길이는 함수이므로 () 붙여야 한다!!
//        String 자료형은 class - 여러가지 method를 활용 가능
        
//        여러가지 자료형 배열의 예
        int[] numbers = {1, 2, 3};                      // integer형 배열
        boolean[] booleans = {true, false, true, true}; // boolean형 배열
        double[] doubles = {12.3, 15.2, 3.14};          // double형 배열
        float[] floats = {3.14F, 5.12F, 5.2F};          // float형 배열
        long[] longs = {100L, 2000L, 99999L};           // long형 배열

    }
}
