package controller.transactions;

import controller.Controller;
import org.academiadecodigo.javabank.domain.Bank;
import org.academiadecodigo.javabank.view.Views;

import javax.swing.text.View;

public class DepositController implements Controller {

    private Views view;
    private Bank bank;

    public DepositController(Bank bank) {
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


    public void deposit(int accountId, double amount) {
        bank.getAccountManager().deposit(accountId, amount);
    }

}
