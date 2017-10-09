package org.academiadecodigo.javabank.view;

import controller.Controller;
import controller.ControllerLogIn;
import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.integer.IntegerSetInputScanner;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import org.academiadecodigo.javabank.application.Messages;
import org.academiadecodigo.javabank.domain.Bank;

public class ViewLogIn implements Views {


    private Bank bank;
    private Prompt prompt;
    private ControllerLogIn logInControl;

    public ViewLogIn (Bank bank, Prompt prompt) {
        super(bank, prompt);
    }

    @Override
    public void show() {

        IntegerSetInputScanner scanner = new IntegerSetInputScanner(bank.getCustomerIds());
        scanner.setMessage(Messages.CHOOSE_CUSTOMER);
        scanner.setError(Messages.ERROR_INVALID_CUSTOMER);

        logInControl.setAcessingCustomerId(prompt.getUserInput(scanner));

    }

    @Override
    public void setController(Controller controller) {
        this.logInControl = (ControllerLogIn) controller;
    }

    public void setLogInControl(ControllerLogIn logInControl) {
        this.logInControl = logInControl;
    }
}
