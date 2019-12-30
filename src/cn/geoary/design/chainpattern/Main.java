package cn.geoary.design.chainpattern;

import java.net.HttpCookie;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String str = "<script>欢迎访问我的个人博客geoaryblog.cn，我们上班从来都是996";
        /*str = str.replaceAll("<", "[");
        str = str.replaceAll(">", "]");
        str = str.replaceAll("996", "955");*/
        Msg msg = new Msg();
        msg.setMessage(str);

        // 实现各自的类，去执行
        /*new HtmlFilter().doFilter(msg);
        new SensitiveFilter().doFilter(msg);*/

        // 放到list中去循环执行
        /*List<Filter> filters = new ArrayList<>();
        filters.add(new HtmlFilter());
        filters.add(new SensitiveFilter());
        for(Filter filter: filters){
            filter.doFilter(msg);
        }*/

        // 放到 FilterChain中去执行 并且filterChain1 与 filterChain2 可以连到一起使用 filterChain2.add(filterChain1).add(new HtmlFilter())；
        FilterChain filterChain1 = new FilterChain();
        filterChain1.add(new HtmlFilter()).add(new SensitiveFilter()).doFilter(msg);
        FilterChain filterChain2 = new FilterChain();
        filterChain2.add(filterChain1).add(new HtmlFilter());
        System.out.println(msg);


    }
}
