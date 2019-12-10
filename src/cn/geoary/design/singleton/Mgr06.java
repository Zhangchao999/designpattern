package cn.geoary.design.singleton;

/**
 * 功能描述:
 * 〈线程安全
 *  使用了 synchronized 效率下降〉
 *
 * @author : zhangc
 * @date : 2019/12/10 22:09
 */
public class Mgr06 {
    private static Mgr06 INSTANCE;
    private Mgr06(){

    }
    public static Mgr06 getInstance(){
        if (INSTANCE == null){
            synchronized (Mgr06.class){
                if (INSTANCE == null){
                    try {
                        Thread.sleep(1);
                    } catch (Exception e){
                        e.printStackTrace();
                    }
                    INSTANCE = new Mgr06();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i=0; i<100; i++){
            new Thread(()-> System.out.println(Mgr06.getInstance().hashCode())).start();
        }
    }
}
