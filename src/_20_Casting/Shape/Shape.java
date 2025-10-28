package _20_Casting.Shape;

/*
 * render() => preDraw(), drawInternal(), postDraw(); 호출
 * protected
 * preDraw => 출력(그리기 준비)
 * postDraw => 출력(그리기 마무리)
 *
 * 추상메소드
 * area() => double, drawInternal() protected => void
 * */

public abstract class Shape {
//    모든 도형에서 공통으로 사용되지만 도형마다 구하는 공식이 달라 각자 구현해야 하는 메소드
    public abstract double area();
    protected abstract void drawInternal();

//    모든 도형에서 공통으로 사용되고 기능도 같아서 미리 구현해놓는 메소드
    protected void preDraw() {
        System.out.println("그리기 준비");
    }

    protected void postDraw() {
        System.out.println("그리기 마무리");
    }

    void render() {
        this.preDraw();
        this.drawInternal();
        this.postDraw();
    }
}
