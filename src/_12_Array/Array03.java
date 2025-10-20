package _12_Array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Array03 {
    public static void main(String[] args) {
//        정렬 (sorting)
        int[] nums = {8, 4, 5, 1, 7, 10, 6, 2, 9, 3};
//        순회 없이 배열 내용 출력 방법 -> Arrays.toString(배열명)
        System.out.println(Arrays.toString(nums));
//        정렬 방법) Arrays.sort() -> "오름차순 정렬만 가능"
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        int temp = 0;
        for (int i = 0; i<(nums.length % 2 == 0 ? nums.length/2 : nums.length/2 + 1); i++) {
            temp = nums[i];
            nums[i] = nums[nums.length-1-i];
            nums[nums.length-1-i] = temp;
        }

        System.out.println(Arrays.toString(nums));

//        내림차순 정렬 -> int type 대신 Integer class 사용
        Integer[] nums2 = {8, 4, 5, 1, 7, 10, 6, 2, 9, 3};

        Arrays.sort(nums2, Comparator.reverseOrder());
        System.out.println(Arrays.toString(nums2));

        /*
        * int와 Integer의 차이점
        * int => primitive type - 단순 연산만 가능한 자료형
        * Integer => wrapper Class - 여러가지 메서드들이 포함된 클래스
        *
        * 대부분의 primitive type은 짝이 되는 wrapper class가 존재함
        * double <-> Double
        * float <-> Float
        * long <-> long 등등
        * */

//        평균 구하기
        int sum = 0;
        float average = 0F;
        int[] score = {100, 88, 100, 100, 90};

        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }

        average = (float) sum / score.length;

        System.out.println("총합 : " + sum);
        System.out.println("평균 : " + average);

//        최대/최소값 구하기
        int[] score2 = {79, 88, 91, 33, 100, 55, 95};
        int max = score2[0];
        int min = score2[0];

        for (int i = 0; i < score2.length; i++) {
            max = max < score2[i] ? score2[i] : max;
            min = min > score2[i] ? score2[i] : min;
        }

        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);

        Arrays.sort(score2);
        System.out.println("최대값 : " + score2[score2.length-1]);
        System.out.println("최소값 : " + score2[0]);

//        요일 출력
        char[] week ={'월', '화', '수', '목', '금', '토', '일'};
//        1~7사이의 숫자를 입력 받아 요일을 출력
//        범위를 벗어날 경우 "잘못 입력하셨습니다." 출력

        Scanner scanner = new Scanner(System.in);

        System.out.println(Arrays.toString(week));
        while(true) {
            System.out.print("1~7 사이의 정수를 입력하세요. >>>>> ");
            int day = scanner.nextInt();

            if (day > 7 || day < 1) {
                System.out.println("잘못 입력하셨습니다.");
                continue;
            } else {
                System.out.println(week[day-1]);
                break;
            }
        }

//        값 target이 처음 나타내는 인덱스를 찾고 없으면 -1을 출력하기
//        찾을 target은 1~10까지

        int[] a = {4, 2, 7, 2, 3, 7, 4};

        System.out.println(Arrays.toString(a));
        while (true) {
            System.out.println("1~10 사이의 정수를 입력하세요 >>>>> ");
            int target = scanner.nextInt();
            int flag = -1;

            if (target > 10 || target < 1) {
                System.out.println("잘못 입력하셨습니다.");
                continue;
            } else {
                int i = 1;
                for (int aa : a) {
                    if (target == aa) {
                        flag = i;
                        break;
                    }
                    i++;
                }
                System.out.println(flag);
                break;
            }

        }

    }
}
