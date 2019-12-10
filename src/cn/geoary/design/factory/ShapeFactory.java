package cn.geoary.design.factory;

public class ShapeFactory {
    public Shape getShape(String str){
        if("".equals(str)){
            return null;
        }
        if("circle".equals(str)){
            return new Circle();
        }else if("rectangle".equals(str)){
            return new Rectangle();
        }else if("square".equals(str)){
            return new Square();
        }
        return null;
    }
}
