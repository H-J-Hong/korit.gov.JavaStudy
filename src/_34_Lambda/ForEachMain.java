package _34_Lambda;

import java.util.Arrays;
import java.util.List;

public class ForEachMain {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("사과","딸기","블루베리","수박","포도");

        System.out.println("fori 구문");
        for (int i = 0; i < fruits.size(); i++) System.out.println("과일 : " + fruits.get(i));

        System.out.println("향상된 for구문");
        for (String fruit : fruits) System.out.println("과일 : " + fruit);

        System.out.println("람다식 for-each");
        fruits.forEach(fruit -> System.out.println("과일 : " + fruit));

        List<Integer> nums = Arrays.asList(1,2,3,4,5);
        nums.forEach(num -> System.out.println(num + " * 2 = " + num*2));
    }
}
