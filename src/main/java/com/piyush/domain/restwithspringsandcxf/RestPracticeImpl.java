package com.piyush.domain.restwithspringsandcxf;

import java.util.ArrayList;
import java.util.List;

public class RestPracticeImpl implements RestPracticeService {

    @Override
    public String getName(String name) {
        return "My name is " + name;
    }

    @Override
    public User getNameInJson(String name) {
        User user = new User();
        user.setId("1");
        user.setName(name);

        List<String> degrees = new ArrayList<String>();
        degrees.add("Mtech");
        degrees.add("Btech");
        user.setDegrees(degrees);

        return user;
    }

}
