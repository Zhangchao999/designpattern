package cn.geoary.design.abstractFactory;

/**
 * 功能描述:
 * 〈中国人 开小汽车上班 早餐吃油条〉
 *
 * @author : zhangc
 * @date : 2019/12/18 21:34
 */
public class ChineseFactory extends AbstractFactory {
    @Override
    public Transport createTransport() {
        return new Car();
    }

    @Override
    Food CreateFood() {
        return new Fritter();
    }
}
