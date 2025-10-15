package _04_TypeCasting;

public class TypeCasting {
    public static void main(String[] args) {
//        Type casting? 형 변환!

//        정수 -> 실수
        int scoreInt = 98;
        System.out.println(scoreInt);
        System.out.println((float)scoreInt);
        System.out.println((double)scoreInt);
        System.out.println(scoreInt);           // (자료형)변수명 -> 임시 변환임

        float scoreFloat = (float)scoreInt;
        System.out.println(scoreFloat);

//        실수 -> 정수
        float scoreFloat2 = 97.3F;
        System.out.println((int)scoreFloat2);   // 소수점 아래는 버려짐

        double scoreDouble = 88.4;
        System.out.println((int)scoreDouble);   // 소수점 아래는 버려짐

        double sum1 = 98 + 77.3;
//        double sum1 = (double)98 + 77.3;      // 실제로 일어나는 일
        System.out.println(sum1);

//        int sum2 = 98 + 77.3;                 // 잘못된 예 - 수동으로 변환 해줘야 함
        int sum2 = 98 + (int)77.3;
        System.out.println(sum2);

        float sum3 = 98+ 77.3F;

        double convertedScoreDouble = scoreInt; // 자동으로 형변환 적용
        System.out.println(convertedScoreDouble);
//        byte가 큰 자료형으로 자동으로 형변환 : int -> long / int -> float / int -> double
//        byte가 같거나 작은 자료형으로 수동으로 형변환 : double -> int / long -> int / long -> float / float -> int

        int convertedScoreInt = (int)scoreDouble;
        long scoreLong = 87L;
        convertedScoreInt = (int)scoreLong;

        float convertedScoreFloat = scoreInt;
        System.out.println(convertedScoreFloat);

//        숫자를 문자열로 변환
        int _Num1 = 55;
        String strNum1 = String.valueOf(_Num1); // 첫번째 방법
        System.out.println(strNum1);
        strNum1 = Integer.toString(_Num1);      // 두번째 방법
        System.out.println(strNum1);

        double _Num2 = 55.55;
        String strNum2 = String.valueOf(_Num2);
        System.out.println(strNum2);
        strNum2 = Double.toString(_Num2);
        System.out.println(strNum2);

        float _Num3 = 56.34F;
        String strNum3 = String.valueOf(_Num3);
        System.out.println(strNum3);
        strNum3 = Float.toString(_Num3);
        System.out.println(strNum3);

//        문자열을 숫자로
        int _Int = Integer.parseInt("34");
        System.out.println(_Int);
        double _Double = Double.parseDouble("34.44");
        System.out.println(_Double);
        float _Float = Float.parseFloat("34.1234F");
        System.out.println(_Float);

//        _Int = Integer.parseInt("숫자");    // 잘못된 예

        float floatNumber = 3.141592F;
        System.out.println((int) floatNumber);

    }
}
