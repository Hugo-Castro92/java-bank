package org.academiadecodigo.javabank.domain.BehavioralPattern;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.integer.IntegerSetInputScanner;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import org.academiadecodigo.javabank.domain.Bank;
import org.academiadecodigo.javabank.domain.Customer;
import org.academiadecodigo.javabank.managers.AccountManager;



public class Menu {

    private Bank bank;
    MenuInputScanner menuScan;
    private Customer customer;
    private Prompt prompt;
    private AccountManager accountManager;
    private static String[] options = {"Create Account", "Withdraw", "Deposit", "Transfer", "Balance"};
    private static MenuOption[] userChoice = {new CreateAccount(), new Withdraw(), new Deposit(), new Transfer(), new Balance()};


    public Menu() {

        Prompt prompt = new Prompt(System.in, System.out);
        accountManager = new AccountManager();
        bank = new Bank(accountManager);

        menuScan = new MenuInputScanner(options);
        menuScan.setMessage("What do you want to do? ");
    }

    public void setCustomer() {
        IntegerSetInputScanner scanner = new IntegerSetInputScanner(bank.getCustomerNr());

        scanner.setMessage("Insert customer ID: ");
        scanner.setError("Invalid customer ID");

        customer = bank.whatCustomer(prompt.getUserInput(scanner));

        //System.out.println("You are logged in as " + customer.getCustomerName());

    }

    public void userMenu() {
        int userOption = prompt.getUserInput(menuScan);

        if (userOption != options.length){
            userChoice[userOption - 1].executeOption(customer);

            userMenu();
        }
    }



}


