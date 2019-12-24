package cn.geoary.design.facadepattern;

/**
 * 功能描述:
 * 〈总开关〉
 *
 * @author : zhangc
 * @date : 2019/12/24 21:08
 */
public class ElectricBreak implements Electricity{
    Electricity bedroom = new Bedroom();
    Electricity kirchen = new Kitchen();
    Electricity toilet = new Toilet();

    @Override
    public void powerOn() {
        bedroom.powerOn();
        kirchen.powerOn();
        toilet.powerOn();
    }

    @Override
    public void powerOff() {
        bedroom.powerOff();
        kirchen.powerOff();
        toilet.powerOff();
    }
}
