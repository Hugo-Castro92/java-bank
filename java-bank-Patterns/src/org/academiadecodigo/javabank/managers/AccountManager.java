package org.academiadecodigo.javabank.managers;

import org.academiadecodigo.javabank.domain.account.*;
import java.util.HashMap;
import java.util.Map;

public class AccountManager {

    private static int numberAccounts = 0;
    protected AccountFactory accountFactory;
    Map<Integer, Account> accountMap;

    public AccountManager() {
        this.accountMap = new HashMap<>();
        accountFactory = new AccountFactory();
    }

    public Account openAccount(AccountType accountType) {

        Account newAccount;

        numberAccounts++;

        newAccount = accountFactory.openAccount(accountType, numberAccounts);

        accountMap.put(newAccount.getId(), newAccount);

        return newAccount;

    }

    public void deposit(int id, double amount) {
        accountMap.get(id).credit(amount);
    }

    public void withdraw(int id, double amount) {

        Account account = accountMap.get(id);

        if (account.getAccountType() == AccountType.SAVINGS) {
            return;
        }

        accountMap.get(id).debit(amount);
    }

    public void transfer(int srcId, int dstId, double amount) {

        Account srcAccount = accountMap.get(srcId);
        Account dstAccount = accountMap.get(dstId);


 //       if(srcAccount.canDebit(amount) && dstAccount.canCredit(amount)){

   //         srcAccount.debit(amount);
     //       dstAccount.credit(amount);




        // make sure src account has sufficient funds
        if (srcAccount.getBalance() < amount) {
            return;
        }

        // if src account is savings, we need to keep a minimum balance
        if (srcAccount.getAccountType() == AccountType.SAVINGS &&
                srcAccount.getBalance() < SavingsAccount.MIN_BALANCE + amount) {
            return;
        }

        srcAccount.debit(amount);
        dstAccount.credit(amount);

    }
}