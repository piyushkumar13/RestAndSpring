package com.piyush.domain.spring.FactoryExample;

import org.springframework.beans.factory.FactoryBean;

public class PersonFactory implements FactoryBean<Person> {
    @Override
    public Person getObject() throws Exception {
        Person person = new Person("3","Kirad","New Delhi - PV");
        return person;
    }

    @Override
    public Class<?> getObjectType() {
        return Person.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
