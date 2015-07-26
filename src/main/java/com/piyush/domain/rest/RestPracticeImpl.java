package com.piyush.domain.rest;

public class RestPracticeImpl implements RestPracticeService {

    @Override
    public String getName(String name) {
        return "My name is " + name;
    }

    @Override
    public User getNameInJson(String name) {
        User user = new User();
        user.setId("1");
        user.setName("Piyush");
        return user;
    }
}
