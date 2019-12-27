package cn.geoary.design.decoratorpattern;

public abstract class ShapeDecorator implements Shape {
    protected Shape shapeDescortor;

    public ShapeDecorator(Shape shapeDescortor) {
        this.shapeDescortor = shapeDescortor;
    }

    @Override
    public void draw() {
        shapeDescortor.draw();
    }
}
