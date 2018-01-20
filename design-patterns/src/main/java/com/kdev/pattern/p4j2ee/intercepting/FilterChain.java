package com.kdev.pattern.p4j2ee.intercepting;

import java.util.ArrayList;
import java.util.List;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public class FilterChain {
    private List<Filter> filters = new ArrayList<Filter>();
    private Target target;

    public void addFilter(Filter filter){
        filters.add(filter);
    }

    public void execute(String request){
        for (Filter filter : filters) {
            filter.execute(request);
        }
        target.execute(request);
    }

    public void setTarget(Target target){
        this.target = target;
    }
}
