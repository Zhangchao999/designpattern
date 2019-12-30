package cn.geoary.design.chainpattern;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter{
    List<Filter> filters = new ArrayList<>();

    FilterChain add(Filter filter){
        this.filters.add(filter);
        return this;
    }

    @Override
    public void doFilter(Msg msg) {
        for (Filter filter: filters){
            filter.doFilter(msg);
        }
    }
}
