package cn.geoary.design.facadepattern;

/**
 * 功能描述:
 * 〈电的状态〉
 *
 * @author : zhangc
 * @date : 2019/12/24 21:02
 */
public interface Electricity {
    /**
     * 功能描述:
     * 〈通电〉
     *
     * @return : void
     * @author : zhangc
     * @date : 2019/12/24 21:03
     */
    void powerOn();

    /**
     * 功能描述:
     * 〈断电〉
     *
     * @return : void
     * @author : zhangc
     * @date : 2019/12/24 21:04
     */
    void powerOff();
}
