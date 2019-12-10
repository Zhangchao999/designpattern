package cn.geoary.design.singleton;

/**
 * 功能描述:
 * 〈懒加载
 *  通过 synchronized 解决线程问题，但是效率下降
 * 〉
 *
 * @author : zhangc
 * @date : 2019/12/10 21:59
 */
public class Mgr04 {
    private static Mgr04 INSTANCE;

    private Mgr04(){

    }
    public static synchronized Mgr04 getInstance(){
        if (INSTANCE == null){
            try {
                Thread.sleep(1);
            }catch (Exception e){
                e.printStackTrace();
            }
            INSTANCE = new Mgr04();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i=0;i<100;i++){
            new Thread(()-> System.out.println(Mgr04.getInstance().hashCode())).start();
        }
    }
}
