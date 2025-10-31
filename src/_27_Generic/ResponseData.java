package _27_Generic;

import lombok.Data;
/*
* @Data => lombok annotation set!
* => getter, setter, toString, RequiredArgs
* */

/*
* Generic
* 클래스나 메소드가 다룰 데이터 타입을 미리 명시하여 재사용성과 유연성을 높이는 기술
* 타입 매개변수
* 클래스나 메소드에서 사용할 실제 타입을 대신해서 사용하는 매개 변수
* T(type) - 일반적으로 클래스 타입을 나타낼때 사용
* E(element) - 컬렉션의 요소를 나타낼 때 사용
* K(key) - 컬렉션 중 map의 key를 나타낼때 사용
* V(value) - map의 value 또는 Generic 타입의 반환값으로 사용
*
* 재사용성
* Generic을 사용하면 다양한 자료형에 대해 하나의 클래스나 메소드만 정의하는것이 가능하고
* 중복을 줄여서 코드의 재사용성을 높일 수 있다.
* 타입 안정성
* 타입 캐스팅이나 instanceof 확인 절차가 필요 없고 명시적인 형변환 (Casting)을 줄일 수 있음.
* Generic 방식으로 선언후 컴파일 단계에서 바로 타입 체크가 가능하고 잘못된 타입이 들어갈 수 없으므로 실수가 줄어듬.
* 컴파일 시점에서 체크를 할 수 있어 프로그램의 안정성을 높일 수 있다.
* */

@Data
public class ResponseData<T> {
    private String message;
    private T data;

    @Override
    public String toString() {
        return message + data;
    }
}

//    public T toStringStr() {
//        return this.data;
//    }
//
//    public T toStringInt() {
//        return this.data;
//    }
//
//    public T toStringDouble() {
//        return this.data;
//    }
