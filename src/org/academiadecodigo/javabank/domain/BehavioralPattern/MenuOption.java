package org.academiadecodigo.javabank.domain.BehavioralPattern;

import org.academiadecodigo.javabank.domain.Customer;
import org.academiadecodigo.javabank.managers.AccountManager;

public interface MenuOption {

    void executeOption(AccountManager accountManager, Customer customer);
}
