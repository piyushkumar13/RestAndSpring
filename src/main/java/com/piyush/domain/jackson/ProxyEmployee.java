package com.piyush.domain.jackson;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProxyEmployee {
    private String name;

    /*
    For the deserialization of the json
     */
    ProxyEmployee() {

    }

    ProxyEmployee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}
