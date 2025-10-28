package _20_Casting.Shape;

/*
* 속성으로 밑변, 높이 double base, height
* allArgs
* area() => 삼각형 넓이 구하기
* drawInternal() => "삼각형 그리기 (밑변 - **, 높이 - **)"
* */

public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return (base*height)/2.0;
    }

    @Override
    protected void drawInternal() {
        System.out.println("삼각형 그리기 : 밑변 = " + this.base + ", 높이 = " + this.height + " >>>>> " + this.area());
    }
}
