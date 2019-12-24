package cn.geoary.design.facadepattern;

/**
 * 功能描述:
 * 〈卧室通电状态〉
 *
 * @author : zhangc
 * @date : 2019/12/24 21:05
 */
public class Bedroom implements Electricity{
    @Override
    public void powerOn() {
        System.out.println("卧室--打开电源");
    }

    @Override
    public void powerOff() {
        System.out.println("卧室--断开电源");
    }
}
