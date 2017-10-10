package org.academiadecodigo.javabank.services;

import org.academiadecodigo.javabank.model.Customer;
import org.academiadecodigo.javabank.services.AccountService;
import java.util.HashMap;
import java.util.Set;

public class CustomerService {

    private AccountService accountService;
    private HashMap<Integer, Customer> customers;

    private int loginCustomer;

    public CustomerService() {
        this.customers = new HashMap<>();
    }

    public void addCustomer(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    public Set<Integer> getCustomerIds() {
        return customers.keySet();
    }

    public double getBalance() {

        double balance = 0;

        for (Customer customer : customers.values()) {
            balance += customer.getBalance();  //accountService.getBalance?
        }

        return balance;
    }

    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }

    public AccountService getAccountService() {
        return accountService;
    }

    public Customer getCustomer(int id) {return customers.get(id);}
}