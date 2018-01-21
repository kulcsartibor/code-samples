package com.kdev.pattern.sctructural.filter;

import java.util.List;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
