package com.piyush.domain.spring.ConstructsAndCallbacks;

import org.springframework.beans.factory.DisposableBean;

public class DisposableBeanExample implements DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("This is the example of the disposable bean");
    }
}
