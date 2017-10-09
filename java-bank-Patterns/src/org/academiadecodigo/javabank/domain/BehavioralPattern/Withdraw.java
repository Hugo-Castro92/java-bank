package org.academiadecodigo.javabank.domain.BehavioralPattern;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.integer.IntegerSetInputScanner;
import org.academiadecodigo.bootcamp.scanners.precisiondouble.DoubleInputScanner;
import org.academiadecodigo.javabank.domain.Customer;
import org.academiadecodigo.javabank.managers.AccountManager;

import java.util.Set;


public class Withdraw implements MenuOption{

    @Override
    public void executeOption(Customer customer) {

        Set<Integer> accountsNumber = customer.getAccountNumber();
        Prompt prompt = new Prompt(System.in, System.out);

        IntegerSetInputScanner scanner = new IntegerSetInputScanner(accountsNumber);
        scanner.setMessage("Choose one of your account's ID: (" + accountsNumber.toString() + ") :");

        int accountID = prompt.getUserInput(scanner);

        DoubleInputScanner amountScanner = new DoubleInputScanner();
        amountScanner.setMessage("Choose the amount of money you want to Withdraw:");

        double amount = prompt.getUserInput(amountScanner);

        AccountManager accountManager = customer.getAccountManager();
        accountManager.withdraw(accountID, amount);

    }
}
