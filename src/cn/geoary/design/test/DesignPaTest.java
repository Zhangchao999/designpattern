package cn.geoary.design.test;

import java.util.Date;
/*
 * 功能描述:
 * 〈创建时间：
 *  1、静态块
 *  2、构造代码块
 *  3、构造函数
 * 〉
 *
 * @author : zhangc
 * @date : 2019/12/10 21:45
 */
public class DesignPaTest {
    private static final String NAME = "123";
    public DesignPaTest(){
        System.out.println("构造函数 创建时间:"+new Date());
    }
    {
        System.out.println("构造代码块 创建时间："+new Date());
    }
    static {
        System.out.println("静态块 创建时间："+new Date());
    }
    public String getName(){
        return NAME;
    }

}
