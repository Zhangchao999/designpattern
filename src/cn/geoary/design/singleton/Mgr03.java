package cn.geoary.design.singleton;

/**
 * 功能描述:
 * 〈懒加载
 *  虽然达到了按需初始化的目的，但是带来了线程不安全问题
 * 〉
 *
 * @author : zhangc
 * @date : 2019/12/10 21:53
 */
public class Mgr03 {
    private static Mgr03 INSTANCE;

    private Mgr03() {

    }

    public static Mgr03 getInstance() {
        if (INSTANCE == null) {
            try {
                Thread.sleep(1);
            } catch (Exception e) {
                e.printStackTrace();
            }
            INSTANCE = new Mgr03();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            /*new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Mgr03.getInstance().hashCode());
                }
            }).start();*/

            new Thread(() -> System.out.println(Mgr03.getInstance().hashCode())).start();
        }
    }
}
