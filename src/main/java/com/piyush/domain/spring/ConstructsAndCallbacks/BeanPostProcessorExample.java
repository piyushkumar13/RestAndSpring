package com.piyush.domain.spring.ConstructsAndCallbacks;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorExample implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(beanName);
        System.out.println("This is before initialization method of the bean postprocessor :::");

        if ("customer".equals(beanName)) {
            Customer customer = (Customer) bean;
            customer.setCompanyName("ABC company");
            customer.setName("XYZ name");

            System.out.println(customer);
        }
        if ("customerList".equals(beanName)) {
            CustomerList customerList = (CustomerList) bean;
            System.out.println(customerList);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(beanName);
        System.out.println("This is after initialization method of the bean postprocessor :::");

        if ("customer".equals(beanName)) {
            Customer customer = (Customer) bean;
            System.out.println(customer);
        }
        if ("customerList".equals(beanName)) {
            CustomerList customerList = (CustomerList) bean;
            System.out.println(customerList);
        }
        return bean;
    }
}
