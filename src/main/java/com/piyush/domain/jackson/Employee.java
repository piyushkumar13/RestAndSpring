package com.piyush.domain.jackson;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonMethod;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(value = JsonMethod.ALL, fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Employee {

    private String name;
    private String company;

     String getName() {
        return name;
    }

     String getCompany() {
        return company;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

}
