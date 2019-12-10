package cn.geoary.design.factory;

public class FactoryMain {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("rectangle");
        shape.draw();
    }
}
