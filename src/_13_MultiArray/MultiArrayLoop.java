package _13_MultiArray;

import java.util.Arrays;

public class MultiArrayLoop {
    public static void main(String[] args) {
//        다차원 배열의 순회
        String[][] seats = {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}                  // 부호 없음 주의!!
        };                                                      // ; 부호 주의!!

        int k = 0;
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                k++;
                System.out.print(k + "   <" + i + ", ");
                System.out.println(j + ">   " + seats[i][j]);
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {                       // 고정값 입력
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {         // 배열의 길이로 대체
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }

        String[][] seats2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        for (int i = 0; i < seats2.length; i++) {
            for (int j = 0; j < seats2[i].length; j++) {
                System.out.print(seats2[i][j] + " ");
            }
            System.out.println();
        }

//        문제)
//        아이맥스 영화관
//        세로 10칸 가로 15칸
        String[][] imaxSeats = new String[10][15];
        String[] eng = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        for (int i = 0; i < imaxSeats.length; i++) {
            for (int j = 0; j < imaxSeats[i].length; j++) {
                imaxSeats[i][j] = eng[i] + Integer.toString(num[j]);
                System.out.print(imaxSeats[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < imaxSeats.length; i++) {
            for (int j = 0; j < imaxSeats[i].length; j++) {
                imaxSeats[i][j] = (char)('A' + i) + "" + (j+1); // (char)'A'의 ASCII code +1 = 'B' 성질 이용, "" 위치 주의!!!
//                imaxSeats[i][j] = String.valueOf((char)('A' + i)) + (j+1);
//                imaxSeats[i][j] = Integer.toString((char)('A' + i)) + (j+1);
//                toString => null 처리 불가 /  valueOf => null 처리 가능 ("null" 이라는 문자열로)
                System.out.print(imaxSeats[i][j] + " ");
            }
            System.out.println();
        }

        imaxSeats[3][7] = "__";
        imaxSeats[5][3] = "__";
        imaxSeats[7][5] = "__";
        imaxSeats[7][6] = "__";

        for (int i = 0; i < imaxSeats.length; i++) {
            for (int j = 0; j < imaxSeats[i].length; j++) {
                System.out.print(imaxSeats[i][j] + " ");
            }
            System.out.println();
        }

//        문제)
//        다차원 배열 합 구하기
//        3X3 크기 배열 1부터 홀수 차례로 넣고 출력해서 확인후 총합 구하기

        int[][] array33 = new int[9][7];
        int odd = 1;
        int sum = 0;

        for (int i = 0; i < array33.length; i++) {
            for (int j = 0; j < array33[i].length; j++) {
                array33[i][j] = odd;
                odd += 2;
                System.out.print((int)(array33[i][j]/10) == 0 ? " " : "");
                System.out.print((int)(array33[i][j]/100) == 0 ? " " : "");
                System.out.print(array33[i][j] + " ");

                sum += array33[i][j];
            }
            System.out.println();
        }

        System.out.println(Arrays.deepToString(array33));       // Arrays.deepToString() => 다차원 배열 출력!!
        System.out.println(sum);

//        문제)
//        각 행의 합, 각 열의 합, 전체 합
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int sumall = 0;
        int sumrow[] = new int[a.length];
        int sumcol[] = new int[a[0].length];
        boolean flag = true;


        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sumall += a[i][j];
                sumrow[i] += a[i][j];
                sumcol[j] += a[i][j];
            }
        }
        System.out.println("행합 >>>>> " + Arrays.toString(sumrow));
        System.out.println("열합 >>>>> " + Arrays.toString(sumcol));
        System.out.println("총합 >>>>> " + sumall);

        // AA+BB, AA-BB 값 구하기

        int[][] AA = {{1, 2},{3, 4}};
        int[][] BB = {{5, 6},{7, 8}};
        int[][] summ = new int[2][2];
        int[][] sump = new int[2][2];

        for (int i = 0; i < AA.length; i++) {
            for (int j = 0; j < AA[i].length; j++) {
                sump[i][j] += AA[i][j] + BB[i][j];
                summ[i][j] += AA[i][j] - BB[i][j];
            }
        }

        System.out.println("AA + BB = " + Arrays.deepToString(sump));
        System.out.println("AA - BB = " + Arrays.deepToString(summ));

    }

}
