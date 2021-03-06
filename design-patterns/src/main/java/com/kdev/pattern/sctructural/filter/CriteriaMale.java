package com.kdev.pattern.sctructural.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();

        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("MALE")){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
