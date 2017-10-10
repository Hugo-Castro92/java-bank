package org.academiadecodigo.javabank.services;

import org.academiadecodigo.javabank.model.Customer;

public class AuthService {

    private CustomerService customerService;
    private int

    public boolean authCustomer(int id, CustomerService customerService)
    {

        if(customerService.getCustomerIds().contains(id));{
            return true;
        }
    }

    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }




}
