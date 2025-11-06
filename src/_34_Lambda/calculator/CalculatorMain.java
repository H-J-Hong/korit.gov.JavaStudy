package _34_Lambda.calculator;

import java.util.concurrent.Callable;
import java.util.function.Predicate;

public class CalculatorMain {
    static int operate(int a, int b, Calculator c) {
        return c.calculate(a,b);
    }
    public static void main(String[] args) {
        Calculator add = (x,y) -> x+y;
        Calculator sub = (x,y) -> x-y;
        Calculator mul = (x,y) -> x*y;
        Calculator div = (x,y) -> x/y;
        System.out.println(operate(2,3,add));
        System.out.println(add.calculate(2,3));

        Predicate<Integer> isZero = (num) -> (num == 0);

        Calculator div2 = (x,y) ->  {
            if (isZero.test(y)) {
                System.out.println("0으로 나눌 수 없습니다.");
                return 0;
            }
            return x/y;
        };

        System.out.println(div2.calculate(2,0));
    }
}
