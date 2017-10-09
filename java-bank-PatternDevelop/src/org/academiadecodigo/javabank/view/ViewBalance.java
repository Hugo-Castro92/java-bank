package org.academiadecodigo.javabank.view;

import controller.Controller;
import controller.ControllerBalance;
import org.academiadecodigo.javabank.application.Messages;
import org.academiadecodigo.javabank.domain.Bank;
import org.academiadecodigo.javabank.domain.Customer;
import org.academiadecodigo.javabank.domain.account.Account;

import java.text.DecimalFormat;
import java.util.Set;

public class ViewBalance implements Views {

    private Bank bank;
    private ControllerBalance controllerBalance;
    DecimalFormat df = new DecimalFormat("##.#");

    public ViewBalance(Bank bank, Prompt prompt) {

        super(bank, prompt);
    }


    @Override
    public void show() {
        Customer customer = bank.getCustomer(bank.getAcessingCustomerId());
        System.out.println("\n" + customer.getName() + Messages.BALANCE_MESSAGE + "\n");

        Set<Account> accounts = customer.getAccounts();
        for (Account account: accounts) {
            System.out.println(account.getId() + "\t" + account.getAccountType() + "\t" + df.format(account.getBalance()));
        }

        System.out.println("\n\n" + Messages.BALANCE_TOTAL_MESSAGE + df.format(customer.getBalance()));

    }

    @Override
    public void setController(Controller controller) {
        controllerBalance = (ControllerBalance) controller;
    }
}