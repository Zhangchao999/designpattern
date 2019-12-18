package cn.geoary.design.factory;

public class Train implements MoveAble {
    @Override
    public void go() {
        System.out.println("火车开动。。。");
    }
}
