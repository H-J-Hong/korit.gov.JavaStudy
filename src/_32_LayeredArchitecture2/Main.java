package _32_LayeredArchitecture2;


import _32_LayeredArchitecture2.dto.SignupReqDto;
import _32_LayeredArchitecture2.service.SignupService;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SignupService signupService = SignupService.getInstance();

        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("[회원관리 시스템]");
            System.out.println("1. 회원가입");
            System.out.println("2. 로그인");
            System.out.println("3. 가입된 회원 전체 조회");
            System.out.println("q. 종료");
            System.out.print(">>>>> ");
            String selectedMenu = scanner.nextLine();

            if ("q".equalsIgnoreCase(selectedMenu)) {
                System.out.println(">>>>> 프로그램 종료 <<<<<");
                break;
            } else if ("1".equals(selectedMenu)) {
                System.out.println("[ 회원가입 ]");
                SignupReqDto signupReqDto = new SignupReqDto();
//                아이디 중복 체크

                while(true) {
                    System.out.print("username >>>>> ");
                    signupReqDto.setUsername(scanner.nextLine());
                    if(signupService.isValidDuplicatedUsername(signupReqDto.getUsername())) {
                        break;
                    }
                    System.out.println("이미 사용중인 username 입니다.");
                }
//                비밀번호 유효성 체크
                while(true) {
                    System.out.print("password >>>>> ");
                    signupReqDto.setPassword(scanner.nextLine());
                    if(signupService.isValidPassword(signupReqDto.getPassword())) {
                        break;
                    }
                    System.out.println("올바른 비밀번호가 아닙니다.");
                }
//                비밀번호와 비밀번호 확인이 같은지 체크
                while(true) {
                    System.out.print("password confirm >>>>> ");
                    signupReqDto.setConfirmPassword(scanner.nextLine());
                    if (signupService.isValidConfirmPassword(signupReqDto.getConfirmPassword(),signupReqDto.getPassword())) {
                        break;
                    }
                    System.out.println("확인 비밀번호가 틀렸습니다.");
                }
                signupService.signup(signupReqDto);
                System.out.println("[[ 회원관리 완료 ]]");

            } else if ("2".equals(selectedMenu)) {
                System.out.println("[ 로그인 ]");
            } else if ("3".equals(selectedMenu)) {
                System.out.println("[ 가입된 회원 전체 조회 ]");
            } else {
                System.out.println("메뉴를 다시 선택해 주세요");
                continue;
            }
        }

    }
}

