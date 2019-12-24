package cn.geoary.design.facadepattern;

import javax.xml.crypto.dsig.keyinfo.KeyInfo;

public class Main {
    public static void main(String[] args) {
        // 准备去旅游，要把所有的电源拔掉 回来后 要把开关一个一个打开
        // 写法一：
        System.out.println("==========  写法一  ==========");
        System.out.println("==========  去旅游，准备出门  ==========");
        Bedroom bedroom = new Bedroom();
        Kitchen kitchen = new Kitchen();
        Toilet toilet = new Toilet();
        bedroom.powerOff();
        kitchen.powerOff();
        toilet.powerOff();
        System.out.println("==========  回来了，准备通电  ==========");
        bedroom.powerOn();
        kitchen.powerOn();
        toilet.powerOn();
        System.out.println("==============================");

        // 写法二： 通过电闸控制
        System.out.println("==========  写法二  ==========");
        System.out.println("==========  去旅游，准备出门  ==========");
        ElectricBreak electricBreak = new ElectricBreak();
        electricBreak.powerOff();
        System.out.println("==========  回来了，准备通电  ==========");
        electricBreak.powerOn();
        System.out.println("==============================");
    }
}
