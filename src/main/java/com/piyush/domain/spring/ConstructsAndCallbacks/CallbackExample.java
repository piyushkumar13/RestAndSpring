package com.piyush.domain.spring.ConstructsAndCallbacks;

import org.springframework.beans.factory.InitializingBean;

public class CallbackExample implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("This is the example of the initializing bean");
    }
}
