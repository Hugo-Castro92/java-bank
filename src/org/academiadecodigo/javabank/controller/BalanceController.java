package org.academiadecodigo.javabank.controller;

import org.academiadecodigo.javabank.model.Customer;
import org.academiadecodigo.javabank.model.account.AccountType;
import org.academiadecodigo.javabank.services.CustomerService;
import org.academiadecodigo.javabank.model.account.Account;

import java.util.Set;

public class BalanceController extends AbstractController {


    private CustomerService customerService;
    private Customer customer;
    private Account account;

    public String getCustomerName(){
        return customer.getName();
    }

    public Set<Account> getCustomerAccounts(){
       return customer.getAccounts();
    }

    public double getAccountBalance(){
        return customerService.getBalance();
    }

    public int getAccountId(){return account.getId(); }

    public AccountType getType(){return account.getAccountType();}
}
