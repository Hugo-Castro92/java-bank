package org.academiadecodigo.javabank;

import controller.Controller;
import controller.ControllerLogIn;
import controller.ControllerMenu;
import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.javabank.application.BankApplication;
import org.academiadecodigo.javabank.domain.Bank;
import org.academiadecodigo.javabank.domain.Customer;
import org.academiadecodigo.javabank.managers.AccountManager;
import org.academiadecodigo.javabank.view.ViewLogIn;
import org.academiadecodigo.javabank.view.ViewMenu;

public class App {

    public static void main(String[] args) {

        private Prompt prompt;
        ControllerMenu controllerMenu = new ControllerMenu();
        ControllerLogIn controllerLogIn = new ControllerLogIn();
        ViewLogIn viewLogIn = new ViewLogIn();
        ViewMenu viewMenu = new ViewMenu();


        Bank bank = new Bank();
        AccountManager accountManager = new AccountManager();
        bank.setAccountManager(accountManager);

        Customer c1 = new Customer(1,"Rui");
        Customer c2 = new Customer(2,"Sergio");
        Customer c3 = new Customer(3,"Bruno");
        bank.addCustomer(c1);
        bank.addCustomer(c2);
        bank.addCustomer(c3);

        BankApplication bankApplication = new BankApplication(bank);
        bankApplication.start();


    }
}
