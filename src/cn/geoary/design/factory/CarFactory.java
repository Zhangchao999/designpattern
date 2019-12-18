package cn.geoary.design.factory;

public class CarFactory implements CreateAble {
    @Override
    public MoveAble create(){
        System.out.println("Car 创建成功");
        return new Car();
    }
}
