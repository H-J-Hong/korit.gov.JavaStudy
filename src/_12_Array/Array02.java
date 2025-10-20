package _12_Array;

public class Array02 {
    public static void main(String[] args) {
//        배열 순회
        String[] countries = {"Hungray", "Croatia", "Slovenia", "Austria", "Czech"};

//        반복문 for를 이용한 순회
        for (int i = 0; i < 5; i++) {                           // 미리 알고 있는 배열 길이 사용
            System.out.println(countries[i]);
        }

        for (int i = 0; i < countries.length; i++) {            // 배열 길이를 모를때 배열에서 직접 구함
            System.out.println(countries[i]);
        }

//        enhanced for (for-each) / 향상된 for 반복문
        System.out.println("===== enhanced for =====");
        for (String country : countries) {                      // 배열의 요소를 배열의 길이만큼 반복하여 변수로 가져옴
            System.out.println(country);
        }

//        본인이 좋아하는 음식 5가지를 배열에 저장
//        향상된 for 반복문을 활용하여 출력하기
//        "내가 좋아하는 음식 n번 : ***"

        int i = 0;
        String[] foods = {"비빔밥", "라면", "김밥", "삼겹살", "순두부찌개"};

        for (String food : foods) {
            System.out.println("내가 좋아하는 음식 " + ++i +"번 : " + food);
        }

    }
}
