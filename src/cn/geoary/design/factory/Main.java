package cn.geoary.design.factory;

public class Main {
    public static void main(String[] args) {
        // 创建Car
        MoveAble m = new CarFactory().create();
        m.go();
        // 创建Train
        MoveAble mm = new TrainFactory().create();
        mm.go();
    }
}
