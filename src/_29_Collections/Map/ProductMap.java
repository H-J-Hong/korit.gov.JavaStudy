package _29_Collections.Map;

/*
* 1. 스캐너 객체 생성
* 2. hashMap인 productMap 선언 (Key는 String, Value는 Integer)
* 3. 상품 등록하기 라고 출력
* 4. for문 이용 5번 반복 입력받아 productMap에 값 입력
* 5. 전체 상품 출력하기 => 향상된 for문으로 순회, "- (제품명) => (가격)원" 형태로 출력
* 6. 상품 가격 수정 => 수정할 상품명 입력받음
* 6-1. 키 값이 존재하면 밸류 값을 입력 받고 "가격이 수정되었습니다." 출력후 수정
* 6-2. 키 값이 없으면 "해당 상품이 없습니다." 출력
* 7. 특정 상품 검색 => 키값을 입력받아 존재하면 키/값 출력, 없으면 "해당 상품이 없습니다." 출력
* 8. 키 기준 오름차순 정렬하기
* 9. 키 기준 내림차순 정렬하기
* */

import java.util.*;

public class ProductMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> productMap = new HashMap<>();
        System.out.println("상품 등록하기");
        for (int i = 0; i < 5; i++) {
            System.out.print("상품명 >>>>> ");
            String pn = scanner.nextLine();
            System.out.print("가격 >>>>> ");
            Integer pp = scanner.nextInt();
            scanner.nextLine();
            productMap.put(pn,pp);
        }

        for (String z : productMap.keySet()) {
            System.out.println("- " + z + " => " + productMap.get(z) + "원");
        }

        System.out.println("===== 상품 가격 수정 =====");
        while(true) {
            System.out.print("상품 이름 입력 >>>>> ");
            String rn = scanner.nextLine();
            if (productMap.get(rn)==null) {
                System.out.println("해당 상품이 없습니다.");
                continue;
            } else {
                System.out.println("상품 가격 입력 >>>>> ");
                Integer rp = scanner.nextInt();
                scanner.nextLine();
                if (productMap.replace(rn,rp)!=null) {
                    System.out.println("가격이 수정되었습니다.");
                    System.out.println("- " + rn + " => " + productMap.get(rn) + "원");
                }
                break;
            }
        }

        System.out.println("===== 특정 상품 검색 =====");
        while(true) {
            System.out.print("상품 이름 입력 >>>>> ");
            String sn = scanner.nextLine();
            if (productMap.get(sn)==null) {
                System.out.println("해당 상품이 없습니다.");
                continue;
            } else {
                System.out.println("- " + sn + " => " + productMap.get(sn) + "원");
                break;
            }
        }

        List<Map.Entry<String,Integer>> pl = new ArrayList<>(productMap.entrySet());

        pl.sort(Map.Entry.comparingByKey());                            // 리스트의 .sort() 메소드 활용
        System.out.println("키 기준 오름차순 정렬 : " + pl);
        pl.sort(Map.Entry.comparingByKey(Comparator.reverseOrder()));
        System.out.println("키 기준 내림차순 정렬 : " + pl);

    }
}
