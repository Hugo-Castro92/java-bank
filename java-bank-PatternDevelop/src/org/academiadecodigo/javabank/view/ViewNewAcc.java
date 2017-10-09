package org.academiadecodigo.javabank.view;

import controller.Controller;
import controller.ControllerNewAcc;
import org.academiadecodigo.javabank.application.Messages;
import org.academiadecodigo.javabank.domain.Bank;
import org.academiadecodigo.javabank.domain.account.AccountType;

public class ViewNewAcc implements Views {


    private ControllerNewAcc controllerNewAcc;
    private Bank bank;
    private Prompt prompt;

    public ViewNewAcc(Bank bank, Prompt prompt) {
        super(bank, prompt);
    }

    @Override
    public void show() {

        int accountId = controllerNewAcc.openAccount(AccountType.CHECKING);

        System.out.println("\n" + Messages.CREATED_ACCOUNT + bank.getAcessingCustomerId() + " : " + accountId);
    }

    @Override
    public void setController(Controller controller) {
        controllerNewAcc = (ControllerNewAcc) controller;
    }
}
