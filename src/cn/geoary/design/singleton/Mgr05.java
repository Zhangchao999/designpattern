package cn.geoary.design.singleton;

/**
 * 功能描述:
 * 〈线程不安全〉
 *
 * @author : zhangc
 * @date : 2019/12/10 22:05
 */
public class Mgr05 {
    private static Mgr05 INSTANCE;
    private Mgr05(){

    }
    public static Mgr05 getInstance(){
        if (INSTANCE == null){
            synchronized (Mgr05.class){
                try {
                    Thread.sleep(1);
                }catch (Exception e){
                    e.printStackTrace();
                }
                INSTANCE = new Mgr05();
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i=0; i<100; i++){
            new Thread(()-> System.out.println(Mgr05.getInstance().hashCode())).start();
        }
    }
}
