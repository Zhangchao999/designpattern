package cn.geoary.design.chainpattern;

public class HtmlFilter implements Filter {
    @Override
    public void doFilter(Msg msg) {
        String m = msg.getMessage();
        m = m.replaceAll("<", "[");
        m = m.replaceAll(">", "]");
        msg.setMessage(m);
    }
}
