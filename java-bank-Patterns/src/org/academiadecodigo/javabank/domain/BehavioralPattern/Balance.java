package org.academiadecodigo.javabank.domain.BehavioralPattern;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.integer.IntegerSetInputScanner;
import org.academiadecodigo.javabank.domain.Customer;
import java.util.Set;


public class Balance implements MenuOption {

    @Override
    public void executeOption(Customer customer) {
        Set<Integer> accountsNumber = customer.getAccountNumber();

        Prompt prompt = new Prompt(System.in, System.out);

        IntegerSetInputScanner scanner = new IntegerSetInputScanner(accountsNumber);

        scanner.setMessage("Choose one of your accounts (" + accountsNumber + ") :");
        System.out.println("The chosen account's balance is: " + customer.getBalance(prompt.getUserInput(scanner)));

    }
}
