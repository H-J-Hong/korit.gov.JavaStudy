package _13_MultiArray;

import java.util.Arrays;

public class MultiArray {
    public static void main(String[] args) {
//        다차원 배열 (2차원)

//        예) 영화관 좌석
//        A1 ~ A5
//        B1 ~ B5
//        C1 ~ C5
//        커서 여러개 생성 : "alt + shift + click"

        String[] seatA ={"A1", "A2", "A3", "A4", "A5"};
        String[] seatB ={"B1", "B2", "B3", "B4", "B5"};
        String[] seatC ={"C1", "C2", "C3", "C4", "C5"};

//        2차원 배열 선언 (3 X 5)
        String[][] seats1 = new String[3][5];
        String[][] seats2 = {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}                  // 부호 없음 주의!!
        };                                                      // ; 부호 주의!!

//        B3
        System.out.println(seats2[1][2]);
//        C4
        System.out.println(seats2[2][3]);

        System.out.println(Arrays.toString(seats2[0]));

//        A 3열 / B 4열 / C 5열일때
        String[][] seats3 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

//        잘못된 접근 => ArrayIndexOutOfBoundsException 발생!!
//        System.out.println(seats3[0][4]);                     // A는 3열까지인데 5열 접근시 에러 발생

        String[][][] multiArray = new String[][][] {
                {{}, {}, {}},
                {{}, {}, {}},
                {{}, {}, {}}
        };

    }
}
