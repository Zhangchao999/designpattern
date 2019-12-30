package cn.geoary.design.chainpattern;

public class SensitiveFilter implements Filter {
    @Override
    public void doFilter(Msg msg) {
        String m = msg.getMessage();
        m = m.replaceAll("996", "955");
        msg.setMessage(m);
    }
}
