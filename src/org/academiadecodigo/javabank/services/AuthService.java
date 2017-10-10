package org.academiadecodigo.javabank.services;

import org.academiadecodigo.javabank.model.Customer;

public class AuthService {

    private CustomerService customerService;
    private int logInCustomer;

    public boolean authCustomer(int id)
    {
        if(customerService.getCustomerIds().contains(id));{
            logInCustomer = id;
            return true;
        }
        return false;
    }

    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    public int getLogInCustomer() {
        return logInCustomer;
    }
}
