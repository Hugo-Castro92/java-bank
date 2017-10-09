package org.academiadecodigo.javabank.domain.BehavioralPattern;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.integer.IntegerSetInputScanner;
import org.academiadecodigo.bootcamp.scanners.precisiondouble.DoubleInputScanner;
import org.academiadecodigo.javabank.domain.Customer;
import org.academiadecodigo.javabank.managers.AccountManager;
import java.util.Set;

public class Transfer implements MenuOption {


    @Override
    public void executeOption(Customer customer) {

        Set<Integer> accountsNumber = customer.getAccountNumber();

        Prompt prompt = new Prompt(System.in, System.out);
        IntegerSetInputScanner scanner = new IntegerSetInputScanner(accountsNumber);
        scanner.setMessage("Choose the source Checkings account (" + accountsNumber.toString() + ") :");

        int srcID = prompt.getUserInput(scanner);

        scanner.setMessage("Choose the destination account (" + accountsNumber.toString() + ") :");

        int destID = prompt.getUserInput(scanner);

        DoubleInputScanner amountScanner = new DoubleInputScanner();
        amountScanner.setMessage("Choose the amount of money to transfer: ");

        double amount = prompt.getUserInput(amountScanner);

        AccountManager accountManager = customer.getAccountManager();

        accountManager.transfer(srcID, destID, amount);
    }

}

