package controller.transactions;

import controller.Controller;
import org.academiadecodigo.javabank.domain.Bank;
import org.academiadecodigo.javabank.view.Views;

public class WithdrawController implements Controller {

    private Views view;
    private Bank bank;

    public WithdrawController(Bank bank) {this.bank = bank; }

    @Override
    public void initialize() {

        view.show();

    }

    @Override
    public void setview(Views view) {
        this.view = view;
    }


    public void withdraw(int accountId, double amount) {

        bank.getAccountManager().withdraw(accountId, amount);
    }
}
