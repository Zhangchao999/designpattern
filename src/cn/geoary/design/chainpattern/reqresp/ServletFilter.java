package cn.geoary.design.chainpattern.reqresp;

public class ServletFilter implements Filter {
    @Override
    public boolean doFilter(Request request, Response response, FilterChain chain) {
        request.setReqStr(request.getReqStr()+"request ServletFilter() ");
        chain.doFilter(request, response, chain);
        response.setRespStr(response.getRespStr()+"response ServletFilter ");
        return true;
    }
}
