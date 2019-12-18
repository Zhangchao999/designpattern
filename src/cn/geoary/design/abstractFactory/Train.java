package cn.geoary.design.abstractFactory;

public class Train extends Transport {
    @Override
    public void create() {
        System.out.println("乘坐火车去上班");
    }
}
