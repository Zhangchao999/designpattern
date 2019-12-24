package cn.geoary.design.facadepattern;

/**
 * 功能描述:
 * 〈厨房通电状态〉
 *
 * @author : zhangc
 * @date : 2019/12/24 21:06
 */
public class Kitchen implements Electricity {
    @Override
    public void powerOn() {
        System.out.println("厨房--通电状态");
    }

    @Override
    public void powerOff() {
        System.out.println("厨房--断电状态");
    }
}
