package _16_Class.WaterBottle;

import java.util.Scanner;

public class WaterBottleMain {
    /*
    * 문제)
    * WaterBottle 패키지 생성 -> 생성시 빈병
    * WaterBottle 클래스 명세
    * 필드 : currentWater => 병 안에 남아 있는 물의 양, 최대 용량 1000
    * 메소드 : fill => 병에 물 채우기, 1000 이상 불가
    * 메소드 : drink => 병에 물 마시기, 현재 용량 이상 불가
    * getter로 현재 물의 양 출력
    * */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WaterBottle bottle = new WaterBottle();
        bottle.getCurrentWater();

        while(true) {
            int w = 0;

            System.out.println("1. 물을 채웁니다.");
            System.out.println("2. 물을 마십니다.");
            System.out.println("0. 나갑니다.");
            System.out.println();

            System.out.print("어떻게 할까요? >>>>> ");

            int a = scanner.nextInt();

            switch (a) {
                case 1:
                    System.out.print("얼마나 채울까요? >>>>> ");
                    w = scanner.nextInt();
                    bottle.fill(w);
                    continue;
                case 2:
                    System.out.print("얼마나 마실까요? >>>>> ");
                    w = scanner.nextInt();
                    bottle.drink(w);
                    continue;
                case 0:
                    System.out.println("안녕히 가십시오.");
                    break;
                default:
                    System.out.println("잘못 입력 하셨습니다.");
            }
            break;
        }
    }
}
