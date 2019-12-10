package cn.geoary.design.singleton;

/**
 * 功能描述:
 * 〈与Mgr01类似
 *  静态代码块，在类加载时执行。
 * 〉
 *
 * @author : zhangc
 * @date : 2019/12/10 21:37
 */
public class Mgr02 {
    private static final Mgr02 INSTANCE;
    static {
        INSTANCE = new Mgr02();
    }
    private Mgr02(){

    }

    public static Mgr02 getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {
        Mgr02 mgr01 = Mgr02.getInstance();
        Mgr02 mgr02 = Mgr02.getInstance();
        System.out.println(mgr01 == mgr02);
    }
}
