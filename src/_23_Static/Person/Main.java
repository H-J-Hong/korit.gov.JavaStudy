package _23_Static.Person;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person.showPopulation();
        Person person2 = new Person();
        Person.showPopulation();
        Person person3 = new Person();
        Person.showPopulation();
        System.out.println(Person.population);

        System.out.println(person1.COUNTRY1==person2.COUNTRY1);
        System.out.println(person1.COUNTRY2==person2.COUNTRY2);
        /*
        * 제시하신 코드에서 System.out.println(person1.COUNTRY1==person2.COUNTRY1);의 출력 결과가 **true**인 이유는
        * $String$ 리터럴의 동작 방식 때문입니다.
        *
        * 1. $final$ 키워드와 인스턴스 변수 ($`COUNTRY1`$)COUNTRY1은 다음과 같이 선언되어 있습니다:
        * final String COUNTRY1 = "korea";
        * final: 이 변수의 값은 한 번 할당되면 변경할 수 없습니다.
        * 인스턴스 변수 (static이 아님): $Person$ 클래스의 인스턴스가 생성될 때마다 메모리에 별도로 공간이 할당되어야 합니다.
        *
        * 2. 문자열 상수 풀 ($`String`\text{ Constant Pool}$)
        * Java에서 문자열 리터럴 (예: "korea", "US")을 사용할 경우, 이들은 String 상수 풀이라는 특별한 메모리 영역에 저장됩니다.
        * Person 클래스가 로드될 때, "korea" 문자열 리터럴이 상수 풀에 생성됩니다.
        * person1 객체를 생성할 때, $person1.COUNTRY1$은 상수 "korea"를 참조합니다.
        * person2 객체를 생성할 때, $person2.COUNTRY1$ 또한 같은 리터럴 값인 "korea"를 할당받습니다.
        * Java는 메모리 효율성을 위해 동일한 문자열 리터럴에 대해서는 상수 풀에 새로운 객체를 만들지 않고
        * >>>>>>>>>>>>>>>>>>>> 기존 객체의 참조를 재사용합니다. <<<<<<<<<<<<<<<<<<<<<<<
        *
        * 3. 비교 연산자 ($`==`$)의 의미
        * Java에서 $==$ 연산자는 객체를 비교할 때 **주소값 (참조값)**이 같은지 비교합니다.
        * person1.COUNTRY1은 상수 풀에 있는 "korea" 객체의 주소를 참조합니다.
        * person2.COUNTRY1도 상수 풀에 있는 같은 "korea" 객체의 주소를 참조합니다.
        * 따라서 두 변수가 동일한 메모리 주소를 가리키고 있으므로 $person1.COUNTRY1 == person2.COUNTRY1$의
        * 결과는 **true**가 됩니다.참고: $COUNTRY2$도 $true$인 이유System.out.println(person1.COUNTRY2==person2.COUNTRY2);
        * 역시 **true**를 출력합니다.이는 COUNTRY2가 static final로 선언되어 상수 풀에 있는 "US" 리터럴을 참조하며,
        * static 변수는 인스턴스에 관계없이 클래스 레벨에서 오직 하나만 존재하기 때문입니다.
        * 인스턴스 $person1$과 $person2$ 모두 클래스 $Person$이 가진 하나의 $COUNTRY2$ 변수를 공유하며,
        * 그 변수는 상수 풀의 "US" 주소를 가리키므로 주소 비교 결과는 항상 true입니다.
        *
        * */
    }
}
