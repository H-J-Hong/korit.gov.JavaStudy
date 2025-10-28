package _20_Casting.Shape;

/*
* 필드
* 1. double w (가로)
* 2. double h (세로)
* 메소드
* area() => 직사각형 넓이 구하는 공식
* drawInternal => "직사각형 그리기 (가로 - **, 세로 - **)"
* */

public class Rectangle extends Shape {
    private double w;
    private double h;

    public Rectangle(double w, double h) {
        this.w = w;
        this.h = h;
    }

    @Override
    public double area() {
        return w*h;
    }

    @Override
    protected void drawInternal() {
        System.out.println("직사각형 그리기 : 가로 = " + this.w + ", 세로 = " + this.h + " >>>>> " + this.area());
    }

}
