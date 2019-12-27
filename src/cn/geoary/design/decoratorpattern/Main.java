package cn.geoary.design.decoratorpattern;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();
        Shape triangle = new Triangle();
        triangle.draw();
        System.out.println("===========现在想画一个红色的圆===============");
        RedCircle redCircle = new RedCircle(circle);
        redCircle.draw();
    }
}
