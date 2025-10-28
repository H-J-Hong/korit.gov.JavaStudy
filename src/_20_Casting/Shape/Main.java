package _20_Casting.Shape;

/*
*
* */

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(3, 4);
        Shape s3 = new Triangle(6, 4);

        s1.render();
        s2.render();
        s3.render();

        Shape[] shapes = { s1, s2, s3 };

        double sum = 0;
        for(Shape i : shapes) sum += i.area();
        System.out.println(sum);
    }
}
