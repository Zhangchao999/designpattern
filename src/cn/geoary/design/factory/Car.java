package cn.geoary.design.factory;

public class Car implements MoveAble {
    @Override
    public void go() {
        System.out.println("汽车开动。。。");
    }
}
