package com.piyush.domain.spring.ConstructsAndCallbacks;

import java.util.ArrayList;
import java.util.List;

public class CustomerList {
    List<Customer> customers;

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    void initCustomerList(){
        customers = new ArrayList<Customer>();
        Customer customer = new Customer();
        customer.setCompanyName("Thermofisher scientific");
        customer.setName("Piyush");
        customers.add(customer);
        System.out.println("this is the example for the int-method"+customers.get(0));
    }

    @Override
    public String toString() {
        return "CustomerList{" +
                "customers=" + customers +
                '}';
    }
}
