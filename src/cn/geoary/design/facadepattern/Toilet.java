package cn.geoary.design.facadepattern;

/**
 * 功能描述:
 * 〈卫生间通电状态〉
 *
 * @author : zhangc
 * @date : 2019/12/24 21:07
 */
public class Toilet implements Electricity{
    @Override
    public void powerOn() {
        System.out.println("卫生间--通电状态");
    }

    @Override
    public void powerOff() {
        System.out.println("卫生间--断电状态");
    }
}
