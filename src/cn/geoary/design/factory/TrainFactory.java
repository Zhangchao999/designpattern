package cn.geoary.design.factory;

public class TrainFactory implements CreateAble{
    @Override
    public MoveAble create(){
        System.out.println("Train 创建成功");
        return new Train();
    }
}
