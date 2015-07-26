package com.piyush.domain.spring.ConstructsAndCallbacks;

public class Customer {
    private String name;
    private String companyName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
