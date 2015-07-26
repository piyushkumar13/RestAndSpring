package com.piyush.domain.spring.FactoryExample;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainClass {

    public static void main(String[] args) {

        Resource resource = new ClassPathResource("config/applicationContext-factory.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        SingletonClass singletonClass = (SingletonClass) beanFactory.getBean("singleObj");
        singletonClass.printSomeString();

        Person person = (Person) beanFactory.getBean("pObj");
        System.out.println(person);

        Person person1 = (Person) beanFactory.getBean("personObj");
        System.out.println(person1);

        Person person2 = (Person) beanFactory.getBean("pObj2");
        System.out.println(person2);

        SingletonClass singletonClass1 = (SingletonClass)beanFactory.getBean("singleObj1");
        singletonClass1.printSomeString();

        Person person3 = (Person)beanFactory.getBean("pObjFromFactory");
        System.out.println(person3);

    }
}
