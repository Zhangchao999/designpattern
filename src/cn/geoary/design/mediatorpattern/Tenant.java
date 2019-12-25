package cn.geoary.design.mediatorpattern;

public class Tenant extends AbstractPerson {
    Tenant(String name, Mediator mediator){
        super(name, mediator);
    }

    public void contact(String message){
        mediator.contact(message, this);
    }
    @Override
    public void startMessage(String message) {
        System.out.println("租客："+name+"， 获取信息："+message);
    }
}
