package controller;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import org.academiadecodigo.javabank.domain.Bank;
import org.academiadecodigo.javabank.domain.Customer;
import org.academiadecodigo.javabank.domain.account.Account;
import org.academiadecodigo.javabank.domain.account.AccountType;
import org.academiadecodigo.javabank.managers.AccountManager;
import org.academiadecodigo.javabank.view.ViewLogIn;
import org.academiadecodigo.javabank.view.ViewMenu;


public class BootStrap {

private Bank bank;
private Prompt prompt;
private MenuInputScanner menuInputScanner;
private AccountManager accountManager;
private Account account;
private AccountType accountType;
private Customer customer;
private ControllerMenu controllerMenu;
private ViewMenu viewMenu;
private ControllerLogIn controllerLogIn;
private ViewLogIn viewLogIn;



Customer c1 = new Customer(1,"Rui");
Customer c2 = new Customer(2,"Sergio");
Customer c3 = new Customer(3,"Bruno");






}
