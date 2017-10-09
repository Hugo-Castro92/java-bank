package org.academiadecodigo.javabank.domain;

import org.academiadecodigo.javabank.domain.account.Account;
import org.academiadecodigo.javabank.domain.account.AccountType;
import org.academiadecodigo.javabank.managers.AccountManager;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Customer {




    private static int numberCustomers = 0;
    private AccountManager accountManager;
    private Map<Integer, Account> accounts = new HashMap<>();
    private int id;


    public void setAccountManager(AccountManager accountManager) {
        this.accountManager = accountManager;
    }

    public int openAccount(AccountType accountType) {
        Account account = accountManager.openAccount(accountType);
        accounts.put(account.getId(), account);
        return account.getId();
    }

    public double getBalance(int id) {
        return accounts.get(id).getBalance();
    }

    public double getBalance() {

        double balance = 0;

        for (Account account : accounts.values()) {
            balance += account.getBalance();
        }

        return balance;
    }

    public Set<Integer> getAccountNumber(){

        return accounts.keySet();

    }

    public int getID(){

        return id;

    }

    public void setID(){

        this.id = id;

    }

    public AccountManager getAccountManager() {
        return accountManager;
    }

    public static int getNumberCustomers() {
        return numberCustomers;
    }

    public static void setNumberCustomers(int numberCustomers) {
        Customer.numberCustomers = numberCustomers;
    }

}
