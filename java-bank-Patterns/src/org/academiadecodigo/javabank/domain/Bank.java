package org.academiadecodigo.javabank.domain;


import org.academiadecodigo.javabank.managers.AccountManager;

import java.util.HashSet;
import java.util.*;

public class Bank {


    private AccountManager accountManager;
    private Map<Integer, Customer> customers = new HashMap<>();
    private int numberCustomers;

    public Bank(AccountManager accountManager) {
        this.accountManager = accountManager;
    }

    public void addCustomer(Customer customer) {
        numberCustomers ++;
        customers.put(numberCustomers, customer);
        customer.setAccountManager(accountManager);
        customer.setNumberCustomers(numberCustomers);

    }

    public double getBalance() {

        double balance = 0;

        for (Customer customer : customers.values()) {
            
            balance += customer.getBalance();
        }

        return balance;
    }

    public Customer whatCustomer (int id) {

        return customers.get(id);

    }

    public Set<Integer> getCustomerNr(){

       return customers.keySet();

    }
}
