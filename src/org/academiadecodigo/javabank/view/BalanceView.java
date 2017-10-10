package org.academiadecodigo.javabank.view;

import org.academiadecodigo.javabank.controller.BalanceController;
import org.academiadecodigo.javabank.model.account.Account;

import java.text.DecimalFormat;
import java.util.Set;

public class BalanceView implements View {

    private BalanceController balanceController;

    DecimalFormat df = new DecimalFormat("#.##");


    @Override
    public void show() {
        showBalance();
    }

    private void showBalance() {


        System.out.println("\n" + balanceController.getCustomerName() + Messages.VIEW_BALANCE_MESSAGE + "\n");


        Set<Account> balanceControllers = balanceController.getCustomerAccounts();

            for( balanceController : balanceControllers) {

                System.out.println(String.format(balanceController.getAccountId() + "\t" + balanceController.getType() + "\t" + df.format(balanceController.getAccountBalance())));

            }

        System.out.println("\n\n" + Messages.VIEW_BALANCE_TOTAL_MESSAGE + df.format(balanceController.getAccountBalance()));
    }
}
