package org.academiadecodigo.javabank.domain.BehavioralPattern;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.integer.IntegerRangeInputScanner;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import org.academiadecodigo.javabank.domain.Bank;
import org.academiadecodigo.javabank.domain.Customer;
import org.academiadecodigo.javabank.managers.AccountManager;

import static org.academiadecodigo.javabank.domain.Customer.getNumberCustomers;

public class Menu {

    private Bank bank;


    private MenuOption menuOption;



    private Customer customer;
    private AccountManager accountManager;
    private Prompt prompt;

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setMenuOption(MenuOption menuOption) {
        this.menuOption = menuOption;
    }

    public void executeOption(){

        menuOption.executeOption(accountManager, customer);

    }

    public static void main(String[] args) {

        Customer customer = null;

            Prompt prompt = new Prompt(System.in, System.out);

            IntegerRangeInputScanner scanner = new IntegerRangeInputScanner(1, getNumberCustomers());

            int customerId = prompt.getUserInput(scanner);


            String[] options = {"Create Account", "Withdraw", "Deposit", "Transfer", "Balance"};

            MenuOption[]  (new CreateAccount(), new Withdraw(), new Deposit(), new Transfer(), Balance());

            MenuInputScanner scanMenu = new MenuInputScanner(options);

            scanner.setMessage("Choose an option: ");

            int userInput = prompt.getUserInput(scanMenu);

    }
}


