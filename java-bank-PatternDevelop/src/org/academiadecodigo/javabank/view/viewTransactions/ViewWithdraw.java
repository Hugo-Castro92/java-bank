package org.academiadecodigo.javabank.view.viewTransactions;

import controller.Controller;
import controller.transactions.WithdrawController;
import org.academiadecodigo.javabank.domain.Bank;
import org.academiadecodigo.javabank.view.Views;

public class ViewWithdraw implements Views {

    private Bank bamk;
    private Prompt prompt;
    private WithdrawController withdrawController;

    public ViewWithdraw(Bank bank, Prompt prompt) {
        super(bank, prompt);
    }

    @Override
    public void show() {
        super.show();

        if (!hasAccounts()) {
            return;
        }

        Integer accountId = scanAccount();
        Double amount = scanAmount();

        if (bank.getCustomer(bank.getAcessingCustomerId()).getAccountIds().contains(accountId)) {
            withdrawController.withdraw(accountId, amount);
        }
    }

    @Override
    public void setController(Controller controller) {

    }
}
