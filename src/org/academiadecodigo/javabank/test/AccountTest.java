package org.academiadecodigo.javabank.test;

import org.academiadecodigo.javabank.domain.Account;
import org.academiadecodigo.javabank.domain.AccountType;
import org.academiadecodigo.javabank.domain.Checking;
import org.academiadecodigo.javabank.domain.Savings;

public class AccountTest {

    public boolean checkingTest() {

        Account account = new Checking();

        // account should start with zero money
        if (account.getBalance() != 0) {
            return false;
        }

        // we should be able to deposit money in account
        account.credit(80);
        if (account.getBalance() != 80) {
            return false;
        }

        // we should be able to take money from account
        account.debit(40);
        if (account.getBalance() != 40) {
            return false;
        }

        return true;
    }


    public boolean savingsTest(){

        Account account = new Savings();

        //account should start with 100

        if(account.getBalance() != 100){
            return false;
        }

        //account savings should not let us deposit
        account.debit(40);

        if (account.getBalance() != 100){

            return false;
        }


        account.credit(60);

        if(account.getBalance() != 100){

            return false;
        }

        return true;

    }



}
