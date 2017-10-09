package controller;

import org.academiadecodigo.javabank.domain.Bank;
import org.academiadecodigo.javabank.domain.account.AccountType;
import org.academiadecodigo.javabank.view.Views;

public class ControllerNewAcc implements Controller {

    private Views view;
    private Bank bank;

    public ControllerNewAcc(Bank bank) {

        this.bank = bank;

    }

    @Override
    public void initialize() {

        view.show();

    }

    @Override
    public void setview(Views view) {

        this.view = view;

    }

    public int openAccount(AccountType accountType) {

        return bank.getCustomer(bank.getAcessingCustomerId()).openAccount(accountType);

    }
}
