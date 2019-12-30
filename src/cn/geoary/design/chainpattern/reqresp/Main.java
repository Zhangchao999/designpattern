package cn.geoary.design.chainpattern.reqresp;

public class Main {
    public static void main(String[] args) {
        Request request = new Request("request 开始 ");
        Response response = new Response("response 开始 ");
        FilterChain chain = new FilterChain();
        chain.add(new HttpFilter()).add(new ServletFilter());
        chain.doFilter(request, response, chain);
        System.out.println(request.getReqStr());
        System.out.println(response.getRespStr());
    }
}
