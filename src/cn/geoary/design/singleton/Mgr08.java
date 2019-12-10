package cn.geoary.design.singleton;

/**
 * 功能描述:
 * 〈不仅可以解决线程同步，还可以防止反序列化。
 *  号称是最完美的单例
 * 〉
 *
 * @author : zhangc
 * @date : 2019/12/10 22:17
 */
public enum  Mgr08 {
    INSTANCE;

    public static void main(String[] args) {
        for (int i=0; i<100; i++){
            new Thread(()-> System.out.println(Mgr08.INSTANCE.hashCode())).start();
        }
    }
}
