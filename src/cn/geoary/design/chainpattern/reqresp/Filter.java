package cn.geoary.design.chainpattern.reqresp;

public interface Filter {
    boolean doFilter(Request request, Response response, FilterChain chain);
}
