package cn.geoary.design.mediatorpattern;

/**
 * 功能描述:
 * 〈房东〉
 *
 * @author : zhangc
 * @date : 2019/12/25 21:27
 */
public class Landlord extends AbstractPerson{

    Landlord(String name, Mediator mediator){
        super(name, mediator);
    }

    public void contact(String message){
        mediator.contact(message, this);
    }
    @Override
    public void startMessage(String message) {
        System.out.println("房东："+name+"，获取信息："+message);
    }
}
