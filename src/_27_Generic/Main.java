package _27_Generic;

public class Main {
    public static void main(String[] args) {
//        ResponseData responseData = new ResponseData();
//        responseData.setData1("어떠한 데이터");
//        responseData.setMessage("String 데이터 메세지");
//        responseData.setData2(234234);
//        responseData.setData3(345.2545);
//        System.out.println(responseData.toStringStr());}

//        객체가 선언 될때 데이터 형이 결정됨.
        ResponseData<String> responseData1 = new ResponseData<>();
        responseData1.setData("asdfasdfasdf");
        ResponseData<Integer> responseData2 = new ResponseData<>();
        responseData2.setData(123222);
//        responseData2.setData("123222");      // <- Generic <Integer> 로 선언되어 String을 넣을 수 없으므로 에러 발생

//        AutoBoxing 프리미티브 자료형을 레퍼 클래스로 자동 변환 해줌
        System.out.println(GenericEx.identify("hello"));
        System.out.println(GenericEx.identify(123));
    }
}
