package cn.geoary.design.singleton;

/*
 * 功能描述:
 * 〈饿汉式单例模式
 * 类加载到内存后，就实例化一个单例，JVM保证线程安全
 * 简单实用，推荐使用
 * 缺点：不管用到与否，类装载时完成实例化。
 * 〉
 *
 * @author : zhangc
 * @date : 2019/12/10 21:33
 */
public class Mgr01 {
    private static final Mgr01 INSTANCE = new Mgr01();

    // 私有的构造函数
    private Mgr01(){

    }

    // 获取唯一对象实例
    public static Mgr01 getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {
        Mgr01 mgr01 = Mgr01.getInstance();
        Mgr01 mgr02 = Mgr01.getInstance();
        System.out.println(mgr01 == mgr02);

    }
}
