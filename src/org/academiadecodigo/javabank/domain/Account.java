package org.academiadecodigo.javabank.domain;


public abstract class Account {

    public Account(){


    }

    private AccountType accountType;
    protected double balance = 0;
    private int id;

    public Account(int id, AccountType accountType) {
        this.id = id;
        this.accountType = accountType;
    }

    public void credit(double amount) {

        balance += amount;
    }

    public void debit(double amount) {
        if (balance >= amount) {
            balance -= amount;
        }
    }

    public double getBalance()
    {
        return balance;
    }

  //  public String getAccountType()
    //{
      //  return accountType;
    //}

    public int getId() {
        return id;
    }
}
