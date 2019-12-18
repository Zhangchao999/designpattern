package cn.geoary.design.abstractFactory;

public class Car extends Transport {
    @Override
    public void create() {
        System.out.println("开着小汽车去上班");
    }
}
