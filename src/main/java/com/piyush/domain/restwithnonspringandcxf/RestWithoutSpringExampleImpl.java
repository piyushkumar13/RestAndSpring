package com.piyush.domain.restwithnonspringandcxf;

public class RestWithoutSpringExampleImpl implements RestWithoutSpringExample {
    @Override
    public String getName(String name) {
        return "Your name is " + name;
    }

    @Override
    public UserDetails queryName(String name) {
        UserDetails details = new UserDetails();
        details.setName(name);
        details.setCompany("Thermofisher Scientific");

        return details;
    }
}
