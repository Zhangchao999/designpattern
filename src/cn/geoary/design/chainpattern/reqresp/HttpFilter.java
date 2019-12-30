package cn.geoary.design.chainpattern.reqresp;

public class HttpFilter implements Filter {
    @Override
    public boolean doFilter(Request request, Response response, FilterChain chain) {
        request.setReqStr(request.getReqStr()+"request HttpFilter() ");
        chain.doFilter(request, response, chain);
        response.setRespStr(response.getRespStr()+"response HttpFilter ");
        return true;
    }
}
