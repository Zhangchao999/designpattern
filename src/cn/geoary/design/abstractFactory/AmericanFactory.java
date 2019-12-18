package cn.geoary.design.abstractFactory;

/**
 * 功能描述:
 * 〈美国人 做火车上班 早餐吃面包〉
 *
 * @author : zhangc
 * @date : 2019/12/18 21:34
 */
public class AmericanFactory extends AbstractFactory {
    @Override
    public Transport createTransport() {
        return new Train();
    }

    @Override
    Food CreateFood() {
        return new Bread();
    }
}
