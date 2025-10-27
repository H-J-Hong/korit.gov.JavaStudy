package _20_Casting.Shape;

/*
* 필드
* 1. double r (반지름)
* AllArgs
* area() => 원의 넓이 구하는 공식
* drawInternal() => 출력 ("원그리기 r = **")
* 원주율 3.14
* */

public class Circle implements Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return r*r*3.14;
    }

    @Override
    protected void drawInternal() {
        System.out.println("원그리기 r =" + this.r + " >>>>> " + this.area());
    }
}
