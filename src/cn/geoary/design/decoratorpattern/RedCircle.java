package cn.geoary.design.decoratorpattern;

public class RedCircle extends ShapeDecorator {
    public RedCircle(Shape shapeDescortor) {
        super(shapeDescortor);
    }

    @Override
    public void draw() {
        super.draw();
        setColor(shapeDescortor);
    }

    private void setColor(Shape shape){
        System.out.println("这个圆是红色的");
    }
}
