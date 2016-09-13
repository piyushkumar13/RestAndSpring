package com.piyush.domain.restwithspringsandcxf;

import com.piyush.domain.restwithnonspringandcxf.UserDetails;

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

    @Override
    public UserDetails getDetails() {
        UserDetails details = new UserDetails();
        details.setName("Piyush Kumar");
        details.setCompany("Thermofisher Scientific");

        return details;
    }

}
