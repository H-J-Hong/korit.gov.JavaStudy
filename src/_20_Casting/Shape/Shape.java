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

public interface Shape {
    void render();
    void preDraw();
    void postDraw();

    void drawInternal();
    double area();
}
