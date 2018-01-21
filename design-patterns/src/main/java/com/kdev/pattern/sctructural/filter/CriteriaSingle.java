package com.kdev.pattern.sctructural.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public class CriteriaSingle implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();

        for (Person person : persons) {
            if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}