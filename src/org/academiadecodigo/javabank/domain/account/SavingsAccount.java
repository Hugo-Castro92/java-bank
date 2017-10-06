package org.academiadecodigo.javabank.domain.account;

public class SavingsAccount extends Account {

    public static final double MIN_BALANCE = 100;

    public SavingsAccount(int id) {
        super(id);
    }

    @Override
    public AccountType getAccountType() {
        return AccountType.SAVINGS;
    }

}
