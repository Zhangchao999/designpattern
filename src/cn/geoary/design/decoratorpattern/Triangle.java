package cn.geoary.design.decoratorpattern;

public class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("画了一个三角形");
    }
}
