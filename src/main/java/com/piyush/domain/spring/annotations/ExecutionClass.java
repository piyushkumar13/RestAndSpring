package com.piyush.domain.spring.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExecutionClass {

    public static void main(String[] args) {
//        Resource resource = new ClassPathResource("config/applicationContext-annotations.xml");
//        BeanFactory context = new XmlBeanFactory(resource);
        ApplicationContext context = new ClassPathXmlApplicationContext("config/applicationContext-annotations.xml");
        MyClass myClass = (MyClass) context.getBean("myClass");
        System.out.println(myClass.getStudent().size());
        System.out.println(myClass.getStudent().get(0));

    }
}
