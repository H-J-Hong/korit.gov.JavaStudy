package _26_Singleton;

import lombok.extern.java.Log;

public class Main {
    public static void main(String[] args) {
        LogManager logManager1 = LogManager.getInstance();
        System.out.println(logManager1.toString());
        LogManager logManager2 = LogManager.getInstance();
        System.out.println(logManager2.toString());

        logManager1.log("첫번째 로그 메세지");
        logManager2.log("두번째 로그 메세지");

        System.out.println(logManager1 == logManager2);
    }
}
