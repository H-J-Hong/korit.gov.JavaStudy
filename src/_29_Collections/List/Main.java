package _29_Collections.List;

/*
 * 문제
 * TodoList
 * 1. todoList를 담을 리스트 생성
 * 2. 사용자에게 뚜두를 입력받을건데, 몇개 입력한건지 카운트 변수에 입력 받기.
 * 3. count 만큼 반복해서 사용자에게 뚜두 입력 받아 리스트에 추가
 * 4. 향상된 for문 사용하여 할 일 목록 쭉 출력
 * 5. 목록 출력 뒤, 특정 뚜두 포함 여부를 확인하기 위하여 searchTodo라는 변수에 찾을 뚜두 입력받기
 * 6. 포함여부 확인후 포함 여부 출력
 * 7. 포함여부 확인 후 삭제할 뚜두를 입력받아 삭제하기.
 * 8. 뚜두들을 오름차순 정렬후 전체 출력
 * 9. 뚜두들을 내림차순 정렬하여 전체 출력
 * 10. 전체 뚜두들의 갯수 출력하기.
 *
 * */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> todoList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("===== todo 리스트 관리 프로그램 =====");
            System.out.println("1. todo 입력");
            System.out.println("2. todo 출력");
            System.out.println("3. todo 찾기");
            System.out.println("4. todo 삭제");
            System.out.println("5. todo 오름차순 정렬");
            System.out.println("6. todo 내림차순 정렬");
            System.out.println("7. todo 현재 갯수 출력");
            System.out.println("0. 종료");
            System.out.print(">>>>> ");
            int menu = scanner.nextInt();
            scanner.nextLine();

            if (menu == 1) {
                System.out.print("입력할 갯수는? >>>>> ");
                int count = scanner.nextInt();
                scanner.nextLine();
                for (int i = 0; i < count; i++) {
                    System.out.print(i + " 번째 할일 입력 >>> ");
                    String todo = scanner.nextLine();
                    todoList.add(todo);
                }
                continue;
            }
            if (menu == 2) {
                System.out.println(">>>>> todo 목록 <<<<< ");
                for (String z : todoList) {
                    System.out.println(z);
                }
                continue;
            }
            if (menu == 3) {
                System.out.print("찾을 todo를 입력하세요. >>>>> ");
                String searchTodo = scanner.nextLine();
                scanner.nextLine();
                System.out.println(searchTodo + " 의 포함 여부 : " + todoList.contains(searchTodo));
            }
            if (menu == 4) {
                System.out.print("삭제할 todo를 입력하세요. >>>>> ");
                String removeTodo = scanner.nextLine();
                if (todoList.contains(removeTodo)) {
                    todoList.remove(removeTodo);
                    System.out.println(">>>>> 삭제 하였습니다. <<<<<");
                    System.out.println(todoList);
                    continue;
                } else {
                    System.out.println(">>>>> 입력하신 내용을 찾을수 없습니다. <<<<<");
                    continue;
                }
            }
            if (menu == 5) {
                Collections.sort(todoList);
                System.out.println(">>>>> 오름차순 정렬 <<<<<");
                System.out.println(todoList);
                continue;
            }
            if (menu == 6) {
                Collections.sort(todoList,Collections.reverseOrder());
                System.out.println(">>>>> 내림차순 정렬 <<<<<");
                System.out.println(todoList);
                continue;
            }
            if (menu == 7) {
                System.out.print("리스트 길이 >>>>> ");
                System.out.println(todoList.size());
                continue;
            }
            if (menu == 0) {
                System.out.println(">>>>> 프로그램을 종료 합니다. <<<<<");
                break;
            }
            System.out.println("잘못된 입력 입니다.");
        }
    }
}
